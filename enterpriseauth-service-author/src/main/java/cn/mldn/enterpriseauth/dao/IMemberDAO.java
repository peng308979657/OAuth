package cn.mldn.enterpriseauth.dao;

import cn.mldn.enterpriseauth.vo.Member;

public interface IMemberDAO {
	public Member findById(String id);
}
