package cn.mldn.enterpriseauth.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.enterpriseauth.dao.IClientDAO;
import cn.mldn.enterpriseauth.service.IClientService;
import cn.mldn.enterpriseauth.vo.Client;

@Service
public class ClientServiceImpl implements IClientService {
	@Resource
	private IClientDAO clientDAO;

	@Override
	public Client getByClientId(String clientId) {
		return this.clientDAO.findByClientId(clientId);
	}  

}
