package com.metacube.carmgmt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.metacube.carmgmt.exception.SystemException;
import com.metacube.carmgmt.vo.Car;
import com.metacube.carmgmt.vo.CarVO;
import com.metacube.carmgmt.vo.VehicleVO;

@Component("defaultCarDAO")
public class DefaultCarDAO implements CarDAO{

	int vehicleVO_ID ;
	public void addCar(VehicleVO vehicleVO, Car car, CarVO carVO)
			throws SQLException, SystemException {

		


		

	}

	
	public void deleteCar(int vehicleVO_ID) throws SQLException,
			SystemException {
		Connection con = ConnectionFactory.getInstance().getConnection();

		String deleteFromCar = "delete from Car where vehicleVO_ID=?";
		PreparedStatement pstmt3 = con.prepareStatement(deleteFromCar);
		pstmt3.setInt(1, vehicleVO_ID);
		pstmt3.executeUpdate();

		String deleteFromCarVO = "delete from CarVO where vehicleVO_ID=?";
		PreparedStatement pstmt4 = con.prepareStatement(deleteFromCarVO);
		pstmt4.setInt(1, vehicleVO_ID);
		pstmt4.executeUpdate();

		String deleteFromVehicleVO = "delete from vehiclevo where vehicleVO_ID=?";
		PreparedStatement pstmt5 = con.prepareStatement(deleteFromVehicleVO);
		pstmt5.setInt(1, vehicleVO_ID);
		pstmt5.executeUpdate();
	}

	public List<CarVO> getCarVOList() throws SystemException {
		Connection con = ConnectionFactory.getInstance().getConnection();

		ResultSet rs = null;
		String getCarVO = "select * from carVO";
		List<CarVO> carVOList = new LinkedList<CarVO>();
		try {
			PreparedStatement pstmt = con.prepareStatement(getCarVO);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				CarVO temp = new CarVO();
				temp.setAc(rs.getInt("AC"));
				temp.setPowerSteering(rs.getInt("powerSteering"));
				temp.setAccessoryKit(rs.getInt("accessoryKit"));
				temp.setVehicleVO_ID(rs.getInt("vehicleVO_ID"));
				carVOList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return carVOList;
	}

	public List<Car> getCarList() throws SystemException {

		Connection con = ConnectionFactory.getInstance().getConnection();

		ResultSet rs = null;
		String getCar = "select * from car";
		List<Car> carList = new LinkedList<Car>();
		try {
			PreparedStatement pstmt = con.prepareStatement(getCar);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Car temp = new Car();
				temp.setCreated_By(rs.getString("Created_By"));
				temp.setCreated_Time(rs.getTimestamp("Created_Time"));
				temp.setUpdated_By(rs.getString("Updated_By"));
				temp.setUpdted_Time(rs.getTimestamp("Updated_Time"));
				temp.setVehicleVO_ID(rs.getInt("vehicleVO_ID"));
				carList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return carList;
	}

	public List<VehicleVO> getVehicleVOList() throws SystemException {
		Connection con = ConnectionFactory.getInstance().getConnection();

		ResultSet rs = null;
		String getVehicleVO = "select * from vehiclevo";
		List<VehicleVO> vehicleVOList = new LinkedList<VehicleVO>();
		try {
			PreparedStatement pstmt = con.prepareStatement(getVehicleVO);
			rs = pstmt.executeQuery();

			while (rs.next()) {
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
			e.printStackTrace();
		}

		return vehicleVOList;
	}

	public void updateCar(Car car, int vehicleVO_ID) throws SystemException, SQLException {
		Connection con = ConnectionFactory.getInstance().getConnection();

		String updateIntoCar = "Update   `carbecho`.`car` set `Updated_By`=?,`Updated_Time`=? where VehicleVO_ID = ?";
		PreparedStatement pstmt1 = con.prepareStatement(updateIntoCar);

		pstmt1.setString(1, car.getUpdated_By());
		pstmt1.setTimestamp(2, new Timestamp(new Date().getTime()));
		pstmt1.setInt(3, vehicleVO_ID);

		pstmt1.executeUpdate();
		
	}

	public void updateCarVO(CarVO carVO, int vehicleVO_ID) throws SystemException, SQLException {
		Connection con = ConnectionFactory.getInstance().getConnection();

		String updateIntoCarVO = "Update `carbecho`.`carvo` set `AC`=?, `powerSteering`=?, `accessoryKit`=? where VehicleVO_ID = ?";
		PreparedStatement pstmt2 = con.prepareStatement(updateIntoCarVO);
		pstmt2.setInt(1, carVO.getAc());
		pstmt2.setInt(2, carVO.getPowerSteering());
		pstmt2.setInt(3, carVO.getAccessoryKit());
		pstmt2.setInt(4, vehicleVO_ID);
		pstmt2.executeUpdate();
		
	}

	public void updateVehicleVO(VehicleVO vehicleVO, int vehicleVO_ID) throws SystemException, SQLException {
		Connection con = ConnectionFactory.getInstance().getConnection();

		String updateIntoVehicleVO = "Update vehiclevo set make = ?, model =? , engineInCC=? , fuelCapacity=? , milage =? , price =? , roadTax = ? where VehicleVO_ID = ?";

		PreparedStatement pstmt = con.prepareStatement(updateIntoVehicleVO);

		pstmt.setString(1, vehicleVO.getMake());
		pstmt.setString(2, vehicleVO.getModel());
		pstmt.setFloat(3, vehicleVO.getEngineInCC());
		pstmt.setFloat(4, vehicleVO.getFuelCapacity());
		pstmt.setFloat(5, vehicleVO.getMileage());
		pstmt.setFloat(6, vehicleVO.getPrice());
		pstmt.setFloat(7, vehicleVO.getRoadTax());
		pstmt.setInt(8, vehicleVO_ID);
		pstmt.executeUpdate();

		
		
	}


	public void addCar(Car car) throws SystemException, SQLException {
		
		Connection con = ConnectionFactory.getInstance().getConnection();
		String addIntoCar = "INSERT INTO `carbecho`.`car` (`vehicleVO_ID`,`Created_By`,`Updated_By`,`Updated_Time`) VALUES(?,?,?,?)";
		PreparedStatement pstmt1 = con.prepareStatement(addIntoCar);
		pstmt1.setInt(1, vehicleVO_ID);
		pstmt1.setString(2, car.getCreated_By());
		pstmt1.setString(3, car.getUpdated_By());
		pstmt1.setTimestamp(4, new Timestamp(new Date().getTime()));
		pstmt1.executeUpdate();
		
	}


	public void addCarVO(CarVO carVO) throws SystemException, SQLException {
		
		Connection con = ConnectionFactory.getInstance().getConnection();
		String addIntoCarVO = "INSERT INTO `carbecho`.`carvo` ( `AC`, `powerSteering`, `accessoryKit`, `vehicleVO_ID`) VALUES (?,?,?,?)";
		PreparedStatement pstmt2 = con.prepareStatement(addIntoCarVO);
		pstmt2.setInt(1, carVO.getAc());
		pstmt2.setInt(2, carVO.getPowerSteering());
		pstmt2.setInt(3, carVO.getAccessoryKit());
		pstmt2.setInt(4, vehicleVO_ID);
		pstmt2.executeUpdate();
		
	}


	public void addVehicleVO(VehicleVO vehicleVO) throws SystemException, SQLException{
		Connection con = ConnectionFactory.getInstance().getConnection();

		String addIntoVehicleVO = "INSERT INTO vehiclevo (`make`, `model`, `engineInCC`, `fuelCapacity`, `milage`, `price`, `roadTax`)"
				+ "VALUES(?,?,?,?,?,?,?)";

		PreparedStatement pstmt = con.prepareStatement(addIntoVehicleVO);

		pstmt.setString(1, vehicleVO.getMake());
		pstmt.setString(2, vehicleVO.getModel());
		pstmt.setFloat(3, vehicleVO.getEngineInCC());
		pstmt.setFloat(4, vehicleVO.getFuelCapacity());
		pstmt.setFloat(5, vehicleVO.getMileage());
		pstmt.setFloat(6, vehicleVO.getPrice());
		pstmt.setFloat(7, vehicleVO.getRoadTax());

		pstmt.executeUpdate();

		ResultSet rs = pstmt.getGeneratedKeys();
		
		if (rs.next()) {
			vehicleVO_ID = rs.getInt(1);
		}
		
	}
	
	
}
