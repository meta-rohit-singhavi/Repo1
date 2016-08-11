use zip_code_db;
-- Insert data into state table
-- --------------------------------------
INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (1, 'Andhra Pradesh');

INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (2, 'Arunachal Pradesh');

INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (3, 'Assam');

INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (4, 'Bihar');

INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (5, 'Chhattisgarh');

INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (6, 'Goa');

INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (7, 'Gujarat');

INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (8, 'Haryana');

INSERT INTO `zip_code_db`.`states` (`State_Id`, `State_Name`) VALUES (9, 'Himachal Pradesh');

-- Insert data into city table
INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (1, '	Anantapur', 1);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (2, '	Chittoor', 1);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (3, '	Kakinada', 1);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (4, 'Bordumsa', 2);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (5, 'Bubang', 2);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (6, 'Changlang', 2);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (7, 'Deban', 2);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (8, 'Udalguri', 3);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (9, 'Karimganj', 3);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (10, 'Cachar', 3);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (11, 'Kamrup', 3);

INSERT INTO `zip_code_db`.`city` (`City_Id`, `City_Name`, `States_State_Id`) VALUES (12, 'Kamrup Metro', 3);

-- Insert data into zip table
-- --------------------------------
INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (101, 1);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (102, 2);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (103, 3);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (104, 4);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (105, 5);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (106, 6);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (107, 7);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (108, 8);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (109, 9);

INSERT INTO `zip_code_db`.`zip_code` (`Zip_Code`, `City_City_Id`) VALUES (110, 10);



