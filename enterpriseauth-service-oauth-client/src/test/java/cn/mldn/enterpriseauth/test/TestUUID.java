package cn.mldn.enterpriseauth.test;

import java.util.UUID;

public class TestUUID {
	public static void main(String[] args) {
		String salt = "mldnjava" ;
		String uuid = UUID.randomUUID().toString() ;
		String cre = UUID.nameUUIDFromBytes((salt + uuid).getBytes()).toString() ;
		System.err.println(uuid);
		System.err.println(cre);
	}
}
