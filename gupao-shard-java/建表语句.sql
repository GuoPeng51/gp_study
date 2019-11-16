创建数据库ds0，ds1
CREATE TABLE `user_info` (
  `user_id` bigint(19) NOT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `account` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order_history_201901` (
  `order_history_id` bigint(20) NOT NULL,
  `name1` varchar(255) NOT NULL,
  `money` varchar(255) NOT NULL,
  `month1` varchar(12) NOT NULL,
  PRIMARY KEY (`order_history_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

