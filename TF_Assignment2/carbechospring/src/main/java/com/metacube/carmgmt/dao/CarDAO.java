package com.metacube.carmgmt.dao;

import java.sql.SQLException;
import java.util.List;

import com.metacube.carmgmt.exception.SystemException;
import com.metacube.carmgmt.vo.Car;
import com.metacube.carmgmt.vo.CarVO;
import com.metacube.carmgmt.vo.VehicleVO;


public interface CarDAO {

public void addCar(VehicleVO vehicleVO, Car car, CarVO carVO) throws SQLException, SystemException;
	
	
	
	public void deleteCar(int vehicleVO_ID)throws SQLException, SystemException;
	
	public List<CarVO> getCarVOList()throws SQLException, SystemException;
	
	public List<Car> getCarList() throws SystemException;
	
	public List<VehicleVO> getVehicleVOList()throws SQLException, SystemException;

	public void updateCar(Car car, int vehicleVO_ID) throws SystemException, SQLException;

	public void updateCarVO(CarVO carVO, int vehicleVO_ID) throws SystemException, SQLException;

	public void updateVehicleVO(VehicleVO vehicleVO, int vehicleVO_ID) throws SystemException, SQLException;

	public void addCar(Car car) throws SystemException, SQLException;

	public void addCarVO(CarVO carVO) throws SystemException, SQLException;

	public void addVehicleVO(VehicleVO vehicleVO) throws SystemException, SQLException;
}
