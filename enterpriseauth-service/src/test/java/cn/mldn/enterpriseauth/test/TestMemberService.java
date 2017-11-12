package cn.mldn.enterpriseauth.test;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.enterpriseauth.service.IMemberService;
import cn.mldn.enterpriseauth.vo.Member;

@ContextConfiguration(locations = { "classpath:config/test-dubbo-consumer.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberService {
	@Resource
	private IMemberService memberService; 

	@Test
	public void testGet() {
		Member member = this.memberService.get("admin");
		System.err.println(member);
	}

	@Test
	public void testGetRoleAndAction() { 
		Map<String, Set<String>> map = this.memberService.getRoleAndActionByMember("admin");
		System.err.println(map);
	}
}
