 create database htht;
 use htht;

CREATE TABLE `product` (
  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `type` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT '',
  `desc` text CHARACTER SET utf8,
  `image` varchar(255) CHARACTER SET utf8 DEFAULT ''
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

CREATE TABLE `news` (
  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `type` int(2) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 DEFAULT '',
  `content` text CHARACTER SET utf8,
  `content` text CHARACTER SET utf8,
  `create_time` datetime DEFAULT now(),
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;