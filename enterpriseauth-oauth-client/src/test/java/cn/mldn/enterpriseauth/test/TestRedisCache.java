package cn.mldn.enterpriseauth.test;

import javax.annotation.Resource;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.enterpriseauth.ssm.util.cache.RedisCache;

@ContextConfiguration(locations= {"classpath:config/test-spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRedisCache {
	@Resource
	private RedisCache<Object,Object> redisCache ;
	@Test
	public void testPut() {
		this.redisCache.put("mldn", "www.mldn.cn") ;
	}
	@Test
	public void testGet() {
		System.err.println(this.redisCache.get("mldn"));
	}
}
