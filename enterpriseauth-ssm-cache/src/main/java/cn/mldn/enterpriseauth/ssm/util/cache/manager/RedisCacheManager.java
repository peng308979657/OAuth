package cn.mldn.enterpriseauth.ssm.util.cache.manager;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import cn.mldn.enterpriseauth.ssm.util.cache.RedisCache;

public class RedisCacheManager implements CacheManager {
	// 建立一个负责管理所有缓存处理类的集合操作，要求保证线程安全
	private final ConcurrentMap<String, Cache<Object,Object>> CACHES = new ConcurrentHashMap<>() ;
	private JedisConnectionFactory connectionFactory ;
	@Override
	public Cache<Object, Object> getCache(String name) throws CacheException {
		System.err.println("******** cache-name = " + name);
		RedisCache<Object,Object> redisCache = new RedisCache<Object,Object>() ;
		redisCache.setConnectionFactory(this.connectionFactory);
		return redisCache ; 
	}	
	// 此时需要管理多个Redis的连接控制，所以所有的连接通过外部配置
	public void setConnectionFactory(JedisConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}
}
