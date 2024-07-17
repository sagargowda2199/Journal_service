-- sql queries used for User_Management application:

-- new schema
CREATE SCHEMA `User_Management` DEFAULT CHARACTER SET utf8mb4 ;

-- creation of new table called user_details_info

CREATE TABLE `User_Management`.`user_details_info` (
  `user_id` INT NOT NULL,
  `username` VARCHAR(100) NULL,
  `user_email` VARCHAR(100) NULL,
  `phone_no` VARCHAR(12) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`user_id`));


-- new schema
CREATE SCHEMA `Journals` DEFAULT CHARACTER SET utf8mb4 ;

-- creation of new table called Journals
CREATE TABLE `Journals` (
  `id` int NOT NULL,
  `message` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
