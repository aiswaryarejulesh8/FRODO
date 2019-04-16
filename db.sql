/*
SQLyog Community v13.0.1 (64 bit)
MySQL - 5.1.32-community : Database - frodo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`frodo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `frodo`;

/*Table structure for table `accdetails` */

DROP TABLE IF EXISTS `accdetails`;

CREATE TABLE `accdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `card_no` varchar(50) NOT NULL,
  `key` varchar(50) NOT NULL,
  `balance` float NOT NULL,
  `date` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `accdetails` */

insert  into `accdetails`(`id`,`uid`,`card_no`,`key`,`balance`,`date`) values 
(1,3,'862512034763418','22',3020,'2013-03-03'),
(2,4,'862512034763418','2',1000,'2018-10-10'),
(3,9,'08876543256','12345',1000,'2018-10-16'),
(4,10,'08876543256','12345',1000,'2018-10-16'),
(5,11,'862512034763418','4567',1000,'2018-10-16'),
(6,12,'862512034763418','shabi',1000,'2018-10-16'),
(7,13,'862512034763418','anus',900,'2018-10-17'),
(8,14,'862512034763418','sha3',1000,'2018-10-22');

/*Table structure for table `aes` */

DROP TABLE IF EXISTS `aes`;

CREATE TABLE `aes` (
  `key` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `aes` */

insert  into `aes`(`key`) values 
('UEIL8CH1SRTEH7QG');

/*Table structure for table `branch` */

DROP TABLE IF EXISTS `branch`;

CREATE TABLE `branch` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `district` varchar(50) NOT NULL,
  `branch` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `branch` */

insert  into `branch`(`id`,`district`,`branch`) values 
(1,'calicut','sbi'),
(2,'calicut','sib'),
(3,'calicut','federal bank'),
(4,'thrissur','sbi'),
(5,'thrissur','sib'),
(6,'thrissur','federal bank');

/*Table structure for table `digital_coin` */

DROP TABLE IF EXISTS `digital_coin`;

CREATE TABLE `digital_coin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `amount` float NOT NULL,
  `file` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `digital_coin` */

insert  into `digital_coin`(`id`,`uid`,`amount`,`file`,`date`,`status`) values 
(2,3,100,'file//2_100.0.txt','2018-09-29','approved'),
(3,3,200,'\" + p + \"','2018-10-07','approved'),
(4,3,100,'null','2018-10-07','pending'),
(5,3,100,'null','2018-10-07','pending'),
(6,3,100,'null','2018-10-11','pending'),
(7,13,100,'null','2018-10-17','pending'),
(8,13,100,'null','2018-10-17','pending'),
(9,13,100,'file//9_100.0.txt','2018-10-22','approved'),
(10,14,100,'null','2018-10-22','pending'),
(11,14,100,'null','2018-10-22','pending');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `ntl` int(11) NOT NULL,
  `nfl` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`username`,`password`,`type`,`ntl`,`nfl`,`id`) values 
('Admin','admin','admin',0,0,1),
('manu','manu','user',0,0,2),
('shai','shai','user',49,3,3),
('fahi','fahi','user',0,0,4),
('Rahi','rah','pending',0,0,5),
('Shanu','123','pending',0,0,6),
('Jithin','12345','pending',0,0,8),
('Jithin','12345','pending',0,0,9),
('Jithin','12345','pending',0,0,10),
('Rahi','4567','pending',0,0,11),
('Shabi','shabi','user',0,0,12),
('Anus','anus','user',8,2,13),
('Shahina ','sha2','user',2,0,14);

/*Table structure for table `rsa_tbl` */

DROP TABLE IF EXISTS `rsa_tbl`;

CREATE TABLE `rsa_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `puky` varchar(100) NOT NULL,
  `prky` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `rsa_tbl` */

/*Table structure for table `transaction` */

DROP TABLE IF EXISTS `transaction`;

CREATE TABLE `transaction` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Acno` varchar(50) NOT NULL,
  `Amount` float NOT NULL,
  `Date` varchar(10) NOT NULL,
  `Type` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `transaction` */

insert  into `transaction`(`Id`,`Acno`,`Amount`,`Date`,`Type`) values 
(1,'2222',800,'2018-09-29','withdrwal'),
(2,'2222',200,'2018-09-29','withdrwal'),
(3,'2222',300,'2018-09-29','withdrwal'),
(4,'2222',100,'2018-09-29','withdrwal'),
(5,'2222',20,'2018-09-29','withdrwal'),
(6,'2222',100,'2018-09-29','withdrwal'),
(7,'2222',100,'2018-09-29','withdrwal'),
(8,'2222',100,'2018-09-30','withdrwal');

/*Table structure for table `transfer` */

DROP TABLE IF EXISTS `transfer`;

CREATE TABLE `transfer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dc_id` int(11) NOT NULL,
  `date` varchar(50) NOT NULL,
  `f_id` int(11) NOT NULL,
  `t_id` int(11) NOT NULL,
  `amount` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transfer` */

/*Table structure for table `user_reg` */

DROP TABLE IF EXISTS `user_reg`;

CREATE TABLE `user_reg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `dob` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `hname` varchar(50) NOT NULL,
  `place` varchar(50) NOT NULL,
  `pin` int(11) NOT NULL,
  `district` varchar(50) NOT NULL,
  `branch` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `pic` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `user_reg` */

insert  into `user_reg`(`id`,`name`,`dob`,`gender`,`hname`,`place`,`pin`,`district`,`branch`,`contact`,`pic`,`email`,`status`,`uid`) values 
(2,'Shahi','06/10/2018','female ','balusery','nb b ',989,'vghfcg','cvxcx','996357852','DSC_3462.jpg','shhh@gmail.com','Approved',3),
(3,'fahi','10/10/2018','female','manzil','balusery',123654,'calicut','branch','98745632','DSC_3462.jpg','fahi@gmail.com','Approved',4),
(4,'Jithin','25/05/1994','Male','kallada','kottakal',676503,'calicut','sbi','9747294370','che-guevara-oWm8hSiyvbAhffie9taRnA.jpg','tkjithin333@gmail.com','pending',9),
(5,'Jithin','25/05/1994','Male','kallada','kottakal',676503,'calicut','sbi','9747294370','che-guevara-oWm8hSiyvbAhffie9taRnA.jpg','tkjithin333@gmail.com','pending',10),
(6,'Rahi','10/10/2018','Female','Athyl','balusery',12345,'calicut','sbi','635489990','Faheema 20180120_203401.jpg','shhh@gmail.com','Approved',11),
(7,'Shabi','01/01/2018','Female','Ktlpda','Koylndy',357855,'calicut','sbi','565469644','BLUR_IMAGE_APP1516418636828.png','shabi@gmail.com','Approved',12),
(8,'Anus','10/10/2008','Female','Katil','tmy',124566,'thrissur','sbi','963258741','BLUR_IMAGE_APP1518493494211.png','shahina2112@gmail.com','Approved',13),
(9,'Shahina ','22/10/2018','Female','Athyal','Ekarool ',673612,'calicut','sbi','7902813028','FB_IMG_15241434784058274.jpg','shahina2112@gmail.com','Approved',14);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
