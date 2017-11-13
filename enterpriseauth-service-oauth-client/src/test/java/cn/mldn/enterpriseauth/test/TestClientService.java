package cn.mldn.enterpriseauth.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.enterpriseauth.service.IClientService;

@ContextConfiguration(locations = { "classpath:config/test-dubbo-consumer.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestClientService {
	@Resource
	private IClientService clientService;

	@Test
	public void testGet() {
		System.err.println(this.clientService.getByClientId("d0fde52c-538f-4e06-9c2f-363fe4321c7e"));
	}

}
