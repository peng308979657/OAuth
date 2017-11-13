package cn.mldn.enterpriseauth.service;

import cn.mldn.enterpriseauth.vo.Member;

public interface IMemberAuthzService {
	/**
	 * 根据用户ID获得一个用户的完整对象信息，包含有密码和锁定状态
	 * @param mid 要查询的用户ID
	 * @return 用户对象，如果用户不存在返回null
	 */
	public Member get(String mid) ;	
}
