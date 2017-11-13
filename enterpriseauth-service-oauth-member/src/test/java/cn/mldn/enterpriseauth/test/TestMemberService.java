package cn.mldn.enterpriseauth.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.enterpriseauth.service.IMemberAuthzService;
import cn.mldn.enterpriseauth.vo.Member;

@ContextConfiguration(locations = { "classpath:config/test-dubbo-consumer.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberService {
	@Resource
	private IMemberAuthzService memberService; 

	@Test
	public void testGet() {
		Member member = this.memberService.get("admin");
		System.err.println(member);
	}

}
