
--分库1
CREATE DATABASE test0;
-- ----------------------------
-- Table structure for user0
-- ----------------------------
DROP TABLE IF EXISTS `user0`;
CREATE TABLE `user0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` tinyint(3) unsigned DEFAULT '18',
  `sex` varchar(2) NOT NULL,
  `birth` date NOT NULL,
  `email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user0
-- ----------------------------

-- ----------------------------
-- Table structure for user1
-- ----------------------------
DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` tinyint(3) unsigned DEFAULT '18',
  `sex` varchar(2) NOT NULL,
  `birth` date NOT NULL,
  `email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user1
-- ----------------------------
INSERT INTO `user1` VALUES ('82', '小红', '32', '女', '2020-05-02', '123@123.com', '123');


--分库2
CREATE DATABASE test1;
-- ----------------------------
-- Table structure for user0
-- ----------------------------
DROP TABLE IF EXISTS `user0`;
CREATE TABLE `user0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` tinyint(3) unsigned DEFAULT '18',
  `sex` varchar(2) NOT NULL,
  `birth` date NOT NULL,
  `email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user0
-- ----------------------------

-- ----------------------------
-- Table structure for user1
-- ----------------------------
DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` tinyint(3) unsigned DEFAULT '18',
  `sex` varchar(2) NOT NULL,
  `birth` date NOT NULL,
  `email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user1