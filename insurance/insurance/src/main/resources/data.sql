DROP TABLE IF EXISTS INSURANCE;

CREATE TABLE INSURANCE (
customer_id INT NOT NULL,
insurance_type VARCHAR(50) NOT NULL,
insured_amount INT AUTO_INCREMENT PRIMARY KEY,
insurance_end_date DATE DEFAULT CURDATE() + 1
);

INSERT INTO INSURANCE (customer_id, insurance_type, insured_amount, insurance_end_date)
VALUES (1, 'HOME INSURANCE', 557000, CURDATE()+100);

INSERT INTO INSURANCE (customer_id, insurance_type, insured_amount, insurance_end_date)
VALUES (1, 'VEHICLE INSURANCE', 99000, CURDATE()+365);

INSERT INTO INSURANCE (customer_id, insurance_type, insured_amount, insurance_end_date)
VALUES (2, 'TERM INSURANCE', 458000, CURDATE()+1000);

INSERT INTO INSURANCE (customer_id, insurance_type, insured_amount, insurance_end_date)
VALUES (2, 'TRAVEL INSURANCE', 359888, CURDATE()+90);