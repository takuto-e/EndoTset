CREATE TABLE `customers` (
  `customer_id` int NOT NULL AUTO_INCREMENT COMMENT '顧客ID',
  `first_name` varchar(50) DEFAULT NULL COMMENT '名',
  `last_name` varchar(50) DEFAULT NULL COMMENT '姓',
  `email` varchar(100) DEFAULT NULL COMMENT 'メールアドレス',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '電話番号',
  `address` varchar(255) DEFAULT NULL COMMENT '住所',
  `city` varchar(100) DEFAULT NULL COMMENT '市区町村',
  `postal_code` varchar(20) DEFAULT NULL COMMENT '郵便番号',
  `country` varchar(100) DEFAULT NULL COMMENT '国',
  `create_date` datetime DEFAULT NULL COMMENT '作成日時',
  `update_date` datetime DEFAULT NULL COMMENT '更新日時',
  PRIMARY KEY (`customer_id`)
);
