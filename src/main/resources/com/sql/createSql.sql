-- 创建数据库 lanwan
CREATE DATABASE IF NOT EXISTS lanwan DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

-- 创建 user 表 
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;