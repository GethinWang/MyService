CREATE TABLE `users` (
  `id` BIGINT(20) NOT NULL  AUTO_INCREMENT COMMENT '唯一标识|wanggx|2019-01-23',
	`user_sex` TINYINT COMMENT '性别|wanggx|2019-01-23',
	`nick_name` VARCHAR(128)  NOT NULL COMMENT '名称|wanggx|2019-01-23',
	  PRIMARY KEY (`id`)
) ENGINE = INNODB COMMENT = 'users|users表|wanggx|2019-01-23'
CHARACTER SET utf8 COLLATE utf8_general_ci;