package cn.mldn.enterpriseauth.dao;

import java.util.Set;

public interface IActionDAO { 
	public Set<String> findAllByMember(String id) ;
}
