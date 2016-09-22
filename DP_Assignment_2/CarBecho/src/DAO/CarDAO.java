package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import sun.security.action.GetIntegerAction;
import Beans.Car;
import Beans.CarVO;
import Beans.VehicleVO;
import ConnectionPakage.DBConnection;
import Factory.ConnectionFactory;

public class CarDAO {

	ConnectionFactory conFact = new ConnectionFactory();
	Connection con =new DBConnection().getConnection();

	public void addCar(VehicleVO vehicleVO, Car car, CarVO carVO) throws SQLException{
		

		
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
		int vehicleVO_ID=0;
		if(rs.next()){
			 vehicleVO_ID = rs.getInt(1);
		}
		
		
		
		String addIntoCar= "INSERT INTO `carbecho`.`car` (`vehicleVO_ID`,`Created_By`,`Updated_By`,`Updated_Time`) VALUES(?,?,?,?)";
		PreparedStatement pstmt1 = con.prepareStatement(addIntoCar);
		pstmt1.setInt(1, vehicleVO_ID);
		pstmt1.setString(2, car.getCreated_By());
		pstmt1.setString(3, car.getUpdated_By());
		pstmt1.setTimestamp(4, new Timestamp(new Date().getTime()));
		pstmt1.executeUpdate();
		
		
		String addIntoCarVO= "INSERT INTO `carbecho`.`carvo` ( `AC`, `powerSteering`, `accessoryKit`, `vehicleVO_ID`) VALUES (?,?,?,?)";
		PreparedStatement pstmt2 = con.prepareStatement(addIntoCarVO);
		pstmt2.setInt(1,carVO.isAc());
		pstmt2.setInt(2, carVO.isPowerSteering());
		pstmt2.setInt(3, carVO.isAccessoryKit());
		pstmt2.setInt(4, vehicleVO_ID);
		pstmt2.executeUpdate();
		
	}
	
	public void updateCar(VehicleVO vehicleVO, Car car, CarVO carVO, int vehicleVO_ID) throws SQLException{
		

		String updateIntoVehicleVO= "Update vehiclevo set make = ?, model =? , engineInCC=? , fuelCapacity=? , milage =? , price =? , roadTax = ? where VehicleVO_ID = ?";
		
		PreparedStatement pstmt = con.prepareStatement(updateIntoVehicleVO);
		
		pstmt.setString(1,vehicleVO.getMake());
		pstmt.setString(2,vehicleVO.getModel());
		pstmt.setFloat(3,vehicleVO.getEngineInCC());
		pstmt.setFloat(4,vehicleVO.getFuelCapacity());
		pstmt.setFloat(5,vehicleVO.getMileage());
		pstmt.setFloat(6,vehicleVO.getPrice());
		pstmt.setFloat(7,vehicleVO.getRoadTax());
		pstmt.setInt(8, vehicleVO_ID);
		pstmt.executeUpdate();
		
		
		String updateIntoCar= "Update   `carbecho`.`car` set `Updated_By`=?,`Updated_Time`=? where VehicleVO_ID = ?";
		PreparedStatement pstmt1 = con.prepareStatement(updateIntoCar);
		
		pstmt1.setString(1, car.getUpdated_By());
		pstmt1.setTimestamp(2, new Timestamp(new Date().getTime()));
		pstmt1.setInt(3, vehicleVO_ID);

		pstmt1.executeUpdate();
		
		
		String updateIntoCarVO= "Update `carbecho`.`carvo` set `AC`=?, `powerSteering`=?, `accessoryKit`=? where VehicleVO_ID = ?";
		PreparedStatement pstmt2 = con.prepareStatement(updateIntoCarVO);
		pstmt2.setInt(1,carVO.isAc());
		pstmt2.setInt(2, carVO.isPowerSteering());
		pstmt2.setInt(3, carVO.isAccessoryKit());
		pstmt2.setInt(4, vehicleVO_ID);
		pstmt2.executeUpdate();
	}
	
	public void deleteCar(int vehicleVO_ID) throws SQLException{
		String deleteFromCar = "delete from Car where vehicleVO_ID=?";
		PreparedStatement pstmt3 = con.prepareStatement(deleteFromCar);
		pstmt3.setInt(1,vehicleVO_ID);
		int rs1 = pstmt3.executeUpdate();
		
		String deleteFromCarVO = "delete from CarVO where vehicleVO_ID=?";
		PreparedStatement pstmt4 = con.prepareStatement(deleteFromCarVO);
		pstmt4.setInt(1,vehicleVO_ID);
		int rs2 = pstmt4.executeUpdate();
		
		
		String deleteFromVehicleVO = "delete from vehiclevo where vehicleVO_ID=?";
		PreparedStatement pstmt5 = con.prepareStatement(deleteFromVehicleVO);
		pstmt5.setInt(1,vehicleVO_ID);
		int rs3 = pstmt5.executeUpdate();
	}
	
	public List<CarVO> getCarVOList(){
		ResultSet rs = null;
		String getCarVO= "select * from carVO";
		List<CarVO> carVOList = new LinkedList<CarVO>();
		try {
			PreparedStatement pstmt = con.prepareStatement(getCarVO);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
			CarVO temp = new CarVO();
			temp.setAc(rs.getInt("AC"));
			temp.setPowerSteering(rs.getInt("powerSteering"));
			temp.setAccessoryKit(rs.getInt("accessoryKit"));
			temp.setVehicleVO_ID(rs.getInt("vehicleVO_ID"));
			carVOList.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return carVOList;
	}
	
	public List<Car> getCarList(){
		ResultSet rs = null;
		String getCar= "select * from car";
		List<Car> carList = new LinkedList<Car>();
		try {
			PreparedStatement pstmt = con.prepareStatement(getCar);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Car temp = new Car();
				temp.setCreated_By(rs.getString("Created_By"));
				temp.setCreated_Time(rs.getTimestamp("Created_Time"));
				temp.setUpdated_By(rs.getString("Updated_By"));
				temp.setUpdted_Time(rs.getTimestamp("Updated_Time"));
				temp.setVehicleVO_ID(rs.getInt("vehicleVO_ID"));
				carList.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return carList;
	}
	
	public List<VehicleVO> getVehicleVOList(){
		ResultSet rs = null;
		String getVehicleVO= "select * from vehiclevo";
		List<VehicleVO> vehicleVOList = new LinkedList<VehicleVO>();
		try {
			PreparedStatement pstmt = con.prepareStatement(getVehicleVO);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				VehicleVO temp = new VehicleVO();
				temp.setEngineInCC(rs.getFloat("engineInCC"));
				temp.setFuelCapacity(rs.getFloat("fuelCapacity"));
				temp.setMake(rs.getString("make"));
				temp.setMileage(rs.getFloat("milage"));
				temp.setModel(rs.getString("model"));
				temp.setPrice(rs.getFloat("price"));
				temp.setRoadTax(rs.getFloat("roadTax"));
				temp.setVehicleVO_ID(rs.getInt("vehicleVO_ID"));
				vehicleVOList.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vehicleVOList;
	}
	
	
	
	
}
