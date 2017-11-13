DROP DATABASE IF EXISTS mldnoauthauthz;
CREATE DATABASE mldnoauthauthz CHARACTER SET UTF8 ;
USE mldnoauthauthz ;
CREATE TABLE member(
   mid                  varchar(50) not null,
   name                 varchar(30),
   password             varchar(32),
   locked               int,
   CONSTRAINT pk_mid PRIMARY KEY (mid)
) engine='innodb';
-- 0表示活跃、1表示锁定
INSERT INTO member(mid,name,password,locked) VALUES ('admin','管理员','EAB62A7769F0313F8D69CEBA32F4347E',0) ;
INSERT INTO member(mid,name,password,locked) VALUES ('mldn','普通人','EAB62A7769F0313F8D69CEBA32F4347E',0) ;
INSERT INTO member(mid,name,password,locked) VALUES ('mermaid','美人鱼','EAB62A7769F0313F8D69CEBA32F4347E',1) ;
