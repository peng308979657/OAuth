package cn.mldn.enterpriseauth.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.enterpriseauth.dao.IMemberDAO;
import cn.mldn.enterpriseauth.service.IMemberAuthzService;
import cn.mldn.enterpriseauth.vo.Member;
@Service
public class MemberAuthzServiceImpl implements IMemberAuthzService {
	
	@Resource
	private IMemberDAO memberDAO ;
	@Override
	public Member get(String mid) {
		return this.memberDAO.findById(mid);
	}
}

