package com.zy.wreserve.common.config;

import com.baomidou.kisso.common.encrypt.base64.Base64;
import com.zy.wreserve.common.MyFilter;
import com.zy.wreserve.common.UserRealm;
import com.zy.wreserve.common.redis.MyRedisSessionDao;
import com.zy.wreserve.common.redis.ShiroRedisCacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.redis.core.RedisTemplate;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zy
 */
@Configuration
public class ShiroConfiguration {

    @Bean(name = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }


    @Bean(name = "userRealm")
    @DependsOn(value = {"lifecycleBeanPostProcessor","ShiroRedisCacheManager"})
    public UserRealm userRealm(RedisTemplate redisTemplate) {
        UserRealm realm = new UserRealm();
        realm.setCacheManager(redisCacheManager(redisTemplate));
        realm.setCachingEnabled(true);
        //认证
        realm.setAuthenticationCachingEnabled(false);
        //授权
        realm.setAuthorizationCachingEnabled(false);
        return realm;
    }

    /**
     * 缓存管理器的配置
     * @param redisTemplate
     * @return
     */
    @Bean(name = "ShiroRedisCacheManager")
    public ShiroRedisCacheManager redisCacheManager(RedisTemplate redisTemplate) {
        ShiroRedisCacheManager redisCacheManager = new ShiroRedisCacheManager(redisTemplate);
        //name是key的前缀，可以设置任何值，无影响，可以设置带项目特色的值
        redisCacheManager.createCache("shiro_redis");
        return redisCacheManager;
    }


    @Bean(name = "ehCacheManager")
    @DependsOn("lifecycleBeanPostProcessor")
    public EhCacheManager ehCacheManager(){
        EhCacheManager ehCacheManager = new EhCacheManager();
        return ehCacheManager;
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager securityManager(RedisTemplate redisTemplate){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm(redisTemplate));
        //自定义session管理 使用redis
        securityManager.setSessionManager(sessionManager(redisTemplate));

//    //自定义缓存实现 使用redis
//    securityManager.setCacheManager(redisCacheManager());
        //注入记住我管理器;
        securityManager.setRememberMeManager(rememberMeManager());
        return securityManager;
    }
    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager  securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setSuccessUrl("/");
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        //自定义拦截器
        Map<String, Filter> filtersMap = new LinkedHashMap<String, Filter>();

//        filtersMap.put("myFilter", new MyFilter());
        shiroFilterFactoryBean.setFilters(filtersMap);
        //拦截器.
        Map<String, String> filterChainDefinitionManager = new LinkedHashMap<>();

        filterChainDefinitionManager.put("/**","authc");
//        filterChainDefinitionManager.put("/*","myFilter");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionManager);

        return shiroFilterFactoryBean;
    }


    /**
     *  配置sessionmanager，由redis存储数据
     */
    @Bean(name = "sessionManager")
    @DependsOn(value = "lifecycleBeanPostProcessor")
    public DefaultWebSessionManager sessionManager(RedisTemplate redisTemplate) {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        MyRedisSessionDao redisSessionDao = new MyRedisSessionDao(redisTemplate);
        //这个name的作用也不大，只是有特色的cookie的名称。
//        redisSessionDao.setSessionIdGenerator(sessionIdGenerator("starrkCookie"));
        sessionManager.setSessionDAO(redisSessionDao);
        sessionManager.setDeleteInvalidSessions(true);
        SimpleCookie cookie = new SimpleCookie();
        cookie.setName("starrkCookie");
        sessionManager.setSessionIdCookie(cookie);
        sessionManager.setSessionIdCookieEnabled(true);
        return sessionManager;
    }

    /**
     * 自定义的SessionId生成器
     * @return
     */
//    public MySessionIdGenerator sessionIdGenerator(String name) {
//        return new MySessionIdGenerator(name);
//    }

    /**
     * 这个参数是RememberMecookie的名称，随便起。
     * remenberMeCookie是一个实现了将用户名保存在客户端的一个cookie，与登陆时的cookie是两个simpleCookie。
     * 登陆时会根据权限去匹配，如是user权限，则不会先去认证模块认证，而是先去搜索cookie中是否有rememberMeCookie，
     * 如果存在该cookie，则可以绕过认证模块，直接寻找授权模块获取角色权限信息。
     * 如果权限是authc,则仍会跳转到登陆页面去进行登陆认证.
     * @return
     */
    public SimpleCookie rememberMeCookie() {
        SimpleCookie simpleCookie = new SimpleCookie("remenbermeCookie");
        //<!-- 记住我cookie生效时间30天 ,单位秒;-->
        simpleCookie.setMaxAge(60);
        return simpleCookie;
    }

    /**
     * cookie管理对象;记住我功能
     */
    public CookieRememberMeManager rememberMeManager() {
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
        //rememberMe cookie加密的密钥 建议每个项目都不一样 默认AES算法 密钥长度(128 256 512 位)
        cookieRememberMeManager.setCipherKey(Base64.decode("3AvVhmFLUs0KTA3Kprsdag=="));
        return cookieRememberMeManager;
    }

    @Bean
    @ConditionalOnMissingBean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
        daap.setProxyTargetClass(true);
        return daap;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
        aasa.setSecurityManager(securityManager);
        return aasa;
    }
}
