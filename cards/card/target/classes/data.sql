DROP TABLE IF EXISTS cards;

CREATE TABLE `cards` (
`card_id` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`card_number` int NOT NULL,
`card_type` varchar(20) NOT NULL,
`expiry_date` date DEFAULT NULL
);

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`,`expiry_date`)
VALUES (1, 40005000, 'CREDIT CARD', CURDATE());

INSERT INTO `cards` (`customer_id`, `card_number`, `card_type`,`expiry_date`)
VALUES (1, 606000, 'DEBIT CARD', CURDATE());

INSERT INTO `cards` (`customer_id`, `card_number`, `card_type`,`expiry_date`)
VALUES (2, 8006000, 'CREDIT CARD', CURDATE());

INSERT INTO `cards` (`customer_id`, `card_number`, `card_type`,`expiry_date`)
VALUES (2, 16000, 'DEBIT CARD', CURDATE())