##1.表结构，很粗糙凑合看
CREATE TABLE `s_user` (
  `id_` bigint(20) NOT NULL,
  `name_` varchar(20) DEFAULT NULL,
  `sex_` int(3) DEFAULT NULL,
  `age_` int(10) DEFAULT NULL,
  `status_` int(10) DEFAULT NULL,
  `username_` varchar(20) DEFAULT NULL,
  `password_` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

