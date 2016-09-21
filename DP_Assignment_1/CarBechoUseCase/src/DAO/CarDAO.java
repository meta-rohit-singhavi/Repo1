package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import Beans.Car;
import Beans.CarVO;
import Beans.VehicleVO;
import Factory.ConnectionFactory;

public class CarDAO {

	ConnectionFactory conFact = new ConnectionFactory();

	public void addCar(VehicleVO vehicleVO, Car car, CarVO carVO) throws SQLException{
		Connection con = conFact.getConInstance();

		
		String addIntoVehicleVO= "INSERT INTO vehiclevo (`make`, `model`, `engineInCC`, `fuelCapacity`, `milage`, `price`, `roadTax`)"
				+ "VALUES(?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(addIntoVehicleVO);
		
		pstmt.setString(1,vehicleVO.getMake());
		pstmt.setString(2,vehicleVO.getModel());
		pstmt.setFloat(3,vehicleVO.getEngineInCC());
		pstmt.setFloat(4,vehicleVO.getFuelCapacity());
		pstmt.setFloat(5,vehicleVO.getMileage());
		pstmt.setFloat(6,vehicleVO.getPrice());
		pstmt.setFloat(7,vehicleVO.getRoadTax());
		
		pstmt.executeUpdate();
		
		ResultSet rs = pstmt.getGeneratedKeys();
		int vehicleVO_ID = rs.getInt(1);
		
		
		String addIntoCar= "INSERT INTO `carbecho`.`car` (`vehicleVO_ID`,`Created_By`,`Updated_By`,`Updated_Time`) VALUES(?,?,?,?)";
		PreparedStatement pstmt1 = con.prepareStatement(addIntoCar);
		pstmt1.setInt(1, vehicleVO_ID);
		pstmt1.setString(2, car.getCreated_By());
		pstmt1.setString(3, car.getUpdated_By());
		pstmt1.setTimestamp(4, new Timestamp(new Date().getTime()));
		pstmt1.executeUpdate();
		
		
		String addIntoCarVO= "INSERT INTO `carbecho`.`carvo` ( `AC`, `powerSteering`, `accessoryKit`, `vehicleVO_ID`) VALUES (?,?,?,?)";
		PreparedStatement pstmt2 = con.prepareStatement(addIntoCarVO);
		pstmt2.setBoolean(1, carVO.isAc());
		pstmt2.setBoolean(2, carVO.isPowerSteering());
		pstmt2.setBoolean(3, carVO.isAccessoryKit());
		pstmt2.setInt(4, vehicleVO_ID);
		pstmt2.executeUpdate();
		
	}
}
