package cn.mldn.enterpriseauth.dao;

import cn.mldn.enterpriseauth.vo.Client;

public interface IClientDAO { 
	public Client findByClientId(String clientId) ; 
}
