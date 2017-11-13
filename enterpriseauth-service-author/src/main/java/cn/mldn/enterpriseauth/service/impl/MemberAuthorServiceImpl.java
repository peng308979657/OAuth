package cn.mldn.enterpriseauth.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.mldn.enterpriseauth.dao.IActionDAO;
import cn.mldn.enterpriseauth.dao.IRoleDAO;
import cn.mldn.enterpriseauth.service.IMemberAuthorService;
@Service
public class MemberAuthorServiceImpl implements IMemberAuthorService {
	@Resource 
	private IRoleDAO roleDAO ;
	@Resource
	private IActionDAO actionDAO ;
	@Override
	public Map<String, Set<String>> getRoleAndActionByMember(String mid) {
		Map<String, Set<String>> map = new HashMap<>() ;
		map.put("allRoles", this.roleDAO.findAllByMember(mid)) ;
		map.put("allActions", this.actionDAO.findAllByMember(mid)) ;
		return map;
	}

}

