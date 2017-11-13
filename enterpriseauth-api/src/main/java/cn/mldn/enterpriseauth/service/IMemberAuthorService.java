package cn.mldn.enterpriseauth.service;

import java.util.Map;
import java.util.Set;

public interface IMemberAuthorService {
	/**
	 * 根据指定的用户编号获得其对应的所有授权信息（角色、权限）
	 * @param mid 用户ID
	 * @return 返回的信息里面包含有两类数据：
	 * 1、key = allRoles、value = 该用户具备的所有角色；
	 * 2、key = allActions、value = 该用户具备的所有权限
	 */
	public Map<String,Set<String>> getRoleAndActionByMember(String mid) ;
}
