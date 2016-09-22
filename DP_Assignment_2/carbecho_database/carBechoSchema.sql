SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `carBecho` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `carBecho` ;

-- -----------------------------------------------------
-- Table `carBecho`.`vehicleVO`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `carBecho`.`vehicleVO` (
  `VehicleVO_ID` INT NOT NULL AUTO_INCREMENT ,
  `make` VARCHAR(45) NOT NULL ,
  `model` VARCHAR(45) NOT NULL ,
  `engineInCC` FLOAT NOT NULL ,
  `fuelCapacity` FLOAT NOT NULL ,
  `milage` FLOAT NOT NULL ,
  `price` FLOAT NOT NULL ,
  `roadTax` FLOAT NOT NULL ,
  PRIMARY KEY (`VehicleVO_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `carBecho`.`car`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `carBecho`.`car` (
  `vehicleVO_ID` INT NOT NULL ,
  `Created_By` VARCHAR(45) NOT NULL ,
  `Created_Time` DATETIME NOT NULL ,
  `Updated_By` VARCHAR(45) NULL DEFAULT NULL ,
  `Updated_Time` DATETIME NULL DEFAULT NULL ,
  PRIMARY KEY (`vehicleVO_ID`) ,
  INDEX `fk_car_vehicleVO1` (`vehicleVO_ID` ASC) ,
  CONSTRAINT `fk_car_vehicleVO1`
    FOREIGN KEY (`vehicleVO_ID` )
    REFERENCES `carBecho`.`vehicleVO` (`VehicleVO_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `carBecho`.`carVO`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `carBecho`.`carVO` (
  `AC` TINYINT(1) NOT NULL ,
  `powerSteering` TINYINT(1) NOT NULL ,
  `accessoryKit` TINYINT(1) NOT NULL ,
  `vehicleVO_ID` INT NOT NULL ,
  PRIMARY KEY (`vehicleVO_ID`) ,
  CONSTRAINT `fk_carVO_vehicleVO1`
    FOREIGN KEY (`vehicleVO_ID` )
    REFERENCES `carBecho`.`vehicleVO` (`VehicleVO_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
