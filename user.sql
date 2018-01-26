CREATE SCHEMA IF NOT EXISTS `mybatis_learn` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `mybatis_learn`.`user` (
  `id` VARCHAR(37) NOT NULL COMMENT 'UUID',
  `username` VARCHAR(128) NOT NULL COMMENT '用户名',
  `age` INT(10) unsigned NOT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)  COMMENT ''
  )
ENGINE = InnoDB
COMMENT = '用户表';