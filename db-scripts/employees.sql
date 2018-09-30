CREATE DATABASE IF NOT EXISTS `employees`;
USE `employees`;


DROP TABLE IF EXISTS `ADDRESS`;

CREATE TABLE `ADDRESS` (
	`id` bigint(11) NOT NULL AUTO_INCREMENT,
	`ADD_CODE` varchar(5) NOT NULL,
	`HOUSE_NAME` varchar(150) NOT NULL,
	`ADD_LINE_ONE` varchar(150) NOT NULL,
	`CITY` varchar(150) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

LOCK TABLES `ADDRESS` WRITE;

INSERT INTO `ADDRESS` VALUES (1, 'OFF', 'Hogger Naught', 'Willian St', 'Noia'), (2, 'PER', 'Liam', 'Poscher St', 'Motina'),  (3, 'TMP', 'Miller Naught', 'Koscher St', 'Noida'), (4, 'PER', 'Moshta', 'Kupler St', 'Wiltada');

UNLOCK TABLES;

DROP TABLE IF EXISTS `EMPLOYEE`;

CREATE TABLE `EMPLOYEE` (
	`id` bigint(11) NOT NULL AUTO_INCREMENT,
	`address_id` bigint(11) DEFAULT NULL,
	`FIRST_NAME` varchar(150) NOT NULL,
	`LAST_NAME` varchar(150) NOT NULL,
	PRIMARY KEY (`id`),
	KEY `FK_Address` (`address_id`),
	CONSTRAINT `FK_Address` FOREIGN KEY (`address_id`) REFERENCES `ADDRESS` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

LOCK TABLES `EMPLOYEE` WRITE;

INSERT INTO `EMPLOYEE` VALUES (1, 2, 'Tiger', 'Scott'), (2, 1, 'Sima', 'Lugani'), (3, 3, 'Nilam', 'Kaur'), (4, 14, 'Matt', 'Morgan');

UNLOCK TABLES;

CREATE USER 'empadmin'@'%' IDENTIFIED BY 'password';
SET PASSWORD FOR 'empadmin' = PASSWORD('empadminpswd@123');

GRANT SELECT, INSERT, UPDATE, DELETE, DROP ON employees.* TO 'empadmin'@'%';



