DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS accounts;

CREATE TABLE `customers` (
`customer_id` int AUTO_INCREMENT PRIMARY KEY,
`name` varchar(100) NOT NULL,
`mobile_number` varchar(13) NOT NULL,
`email_id` varchar(100) NOT NULL,
`created_date` date DEFAULT NULL
);

CREATE TABLE `accounts` (
`customer_id` int NOT NULL,
`account_number` int AUTO_INCREMENT PRIMARY KEY,
`account_type` varchar(100) NOT NULL,
`branch` varchar(100) NOT NULL,
`created_date` date DEFAULT NULL
);

INSERT INTO `customers` (`name`, `mobile_number`, `email_id`, `created_date`)
VALUES ('SkillLync','9876543210','test@skilllync.com',CURDATE());

INSERT INTO `customers` (`name`, `mobile_number`, `email_id`, `created_date`)
VALUES ('SkillLync 2','9876543220','test2@skilllync.com',CURDATE());


INSERT INTO `customers` (`name`, `mobile_number`, `email_id`, `created_date`)
VALUES ('SkillLync 3','9876543230','test3@skilllync.com',CURDATE());


INSERT INTO `accounts` (`account_number`,`customer_id`,`account_type`, `branch`, `created_date`)
VALUES (123, 1,'Savings', 'Chennai', CURDATE());

INSERT INTO `accounts` (`account_number`,`customer_id`,`account_type`, `branch`, `created_date`)
VALUES (1234, 2,'Savings', 'New Delhi', CURDATE());

INSERT INTO `accounts` (`account_number`,`customer_id`,`account_type`, `branch`, `created_date`)
VALUES (12345, 3,'Savings', 'Bangalore', CURDATE());
