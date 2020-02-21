DROP DATABASE IF EXISTS `demo_api`;
CREATE DATABASE `demo_api`;
USE `demo_api`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `first_name` NVARCHAR(255) DEFAULT NULL,
    `last_name` NVARCHAR(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `demo_api`.`user` (`first_name`, `last_name`) VALUES ('Nguyen', 'Quang');
