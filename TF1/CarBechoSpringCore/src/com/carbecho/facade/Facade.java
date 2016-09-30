package com.carbecho.facade;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carbecho.beans.Car;
import com.carbecho.beans.CarVO;
import com.carbecho.beans.VehicleVO;
import com.carbecho.dao.CarDAO;

@Component("facade")
public class Facade {
	
	@Autowired
	CarDAO carDAO ;
	
	
	public void addCar(VehicleVO vehicleVO, Car car, CarVO carVO){
		try {
			carDAO.addCar(vehicleVO, car, carVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateCar(VehicleVO vehicleVO, Car car, CarVO carVO, int vehicleVO_ID){
		try {
			carDAO.updateCar(vehicleVO, car, carVO,vehicleVO_ID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List<VehicleVO> getVehicleVOList(){
		return carDAO.getVehicleVOList();
	}
	
	public List<Car> getCarList(){
		return carDAO.getCarList();
	}
	
	public List<CarVO> getCarVOList(){
		return carDAO.getCarVOList();
	}
	
	public void deleteCar(int vehicleVO_ID){
		 try {
			carDAO.deleteCar(vehicleVO_ID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
