INSERT INTO `carbecho`.`car` ( `Created_By`, `Created_Time`, `vehicleVO_ID`) VALUES ('Rakesh Sharma', '2015-01-11', 101);

INSERT INTO `carbecho`.`car` ( `Created_By`, `Created_Time`, `vehicleVO_ID`) VALUES ( 'Rohit Sharma', '2015-05-15', 102);

INSERT INTO `carbecho`.`car` ( `Created_By`, `Created_Time`, `vehicleVO_ID`) VALUES ( 'Shobhit Agrawal', '2015-12-11', 103);

INSERT INTO `carbecho`.`car` ( `Created_By`, `Created_Time`, `vehicleVO_ID`) VALUES ( 'Yash Jain', '2016-01-01', 104);



INSERT INTO `carbecho`.`vehiclevo` (`VehicleVO_ID`, `make`, `model`, `engineInCC`, `fuelCapacity`, `milage`, `price`, `roadTax`) VALUES (101, '	Chevrolet', '	Safari', 	1100, 35, 	17, 340000, 34000);

INSERT INTO `carbecho`.`vehiclevo` (`VehicleVO_ID`, `make`, `model`, `engineInCC`, `fuelCapacity`, `milage`, `price`, `roadTax`) VALUES (102, 'Maruti Suzuki', 'Maruti Suzuki WagonR', 1200, 40, 20, 300000, 30000);

INSERT INTO `carbecho`.`vehiclevo` (`VehicleVO_ID`, `make`, `model`, `engineInCC`, `fuelCapacity`, `milage`, `price`, `roadTax`) VALUES (103, '	Honda', 'City', 	1500, 38, 21, 425000, 42500);

INSERT INTO `carbecho`.`vehiclevo` (`VehicleVO_ID`, `make`, `model`, `engineInCC`, `fuelCapacity`, `milage`, `price`, `roadTax`) VALUES (104, 'Maruti Suzuki', 'Swift', 	1200, 42, 	15, 220000, 22000);



INSERT INTO `carbecho`.`carvo` ( `AC`, `powerSteering`, `accessoryKit`, `vehicleVO_ID`) VALUES ( true, true, true, 101);

INSERT INTO `carbecho`.`carvo` ( `AC`, `powerSteering`, `accessoryKit`, `vehicleVO_ID`) VALUES ( true, false, true, 102);

INSERT INTO `carbecho`.`carvo` ( `AC`, `powerSteering`, `accessoryKit`, `vehicleVO_ID`) VALUES ( false, true, true, 103);

INSERT INTO `carbecho`.`carvo` ( `AC`, `powerSteering`, `accessoryKit`, `vehicleVO_ID`) VALUES ( false, false, true, 104);



use carbecho;

ALTER TABLE `carbecho`.`car` CHANGE COLUMN `Created_Time` `Created_Time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP  , CHANGE COLUMN `Updated_Time` `Updated_Time` TIMESTAMP ;

INSERT INTO `carbecho`.`vehiclevo` (`VehicleVO_ID`, `make`, `model`, `engineInCC`, `fuelCapacity`, `milage`, `price`, `roadTax`) VALUES (107, '	maruti', '	Safari', 	1100, 35, 	17, 340000, 34000);

INSERT INTO `carbecho`.`car` (`Created_By`, `vehicleVO_ID`) VALUES ( 'Yash Jain',  107);

UPDATE `carbecho`.`car` SET `Updated_Time`='2016-09-19 18:28:52' WHERE `vehicleVO_ID`='105';

UPDATE `carbecho`.`car` SET `Updated_Time`='2016-09-19 18:35:30' WHERE `vehicleVO_ID`='107';