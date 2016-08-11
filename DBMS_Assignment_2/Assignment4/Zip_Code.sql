

CREATE SCHEMA IF NOT EXISTS `Zip_Code_Db` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `Zip_Code_Db` ;

-- -----------------------------------------------------
-- Table `Zip_Code_Db`.`States`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Zip_Code_Db`.`States` (
  `State_Id` INT NOT NULL AUTO_INCREMENT ,
  `State_Name` VARCHAR(100) NOT NULL ,
  PRIMARY KEY (`State_Id`) ,
  UNIQUE INDEX `State_Name_UNIQUE` (`State_Name` ASC) );


-- -----------------------------------------------------
-- Table `Zip_Code_Db`.`City`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Zip_Code_Db`.`City` (
  `City_Id` INT NOT NULL AUTO_INCREMENT ,
  `City_Name` VARCHAR(100) NOT NULL ,
  `States_State_Id` INT NOT NULL ,
  PRIMARY KEY (`City_Id`) ,
  INDEX `fk_City_States` (`States_State_Id` ASC) ,
  UNIQUE INDEX `City_Name_UNIQUE` (`City_Name` ASC) ,
  CONSTRAINT `fk_City_States`
    FOREIGN KEY (`States_State_Id` )
    REFERENCES `Zip_Code_Db`.`States` (`State_Id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- -----------------------------------------------------
-- Table `Zip_Code_Db`.`Zip_Code`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Zip_Code_Db`.`Zip_Code` (
  `Zip_Code` INT NOT NULL ,
  `City_City_Id` INT NOT NULL ,
  PRIMARY KEY (`Zip_Code`) ,
  INDEX `fk_Zip_Code_City1` (`City_City_Id` ASC) ,
  CONSTRAINT `fk_Zip_Code_City1`
    FOREIGN KEY (`City_City_Id` )
    REFERENCES `Zip_Code_Db`.`City` (`City_Id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



