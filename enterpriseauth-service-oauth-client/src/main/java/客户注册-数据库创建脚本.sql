DROP DATABASE IF EXISTS mldnoauthclient;
CREATE DATABASE mldnoauthclient CHARACTER SET UTF8 ;
USE mldnoauthclient ;
CREATE TABLE client (
	clid     BIGINT  AUTO_INCREMENT ,
	client_id  VARCHAR(200) ,
	client_secret VARCHAR(200) ,
	CONSTRAINT pk_clid PRIMARY KEY(clid)
) ;
-- 编写测试数据
INSERT INTO client(client_id,client_secret) VALUES ('d0fde52c-538f-4e06-9c2f-363fe4321c7e','902be4ff-9a36-331d-9f71-afb604d07787') ;