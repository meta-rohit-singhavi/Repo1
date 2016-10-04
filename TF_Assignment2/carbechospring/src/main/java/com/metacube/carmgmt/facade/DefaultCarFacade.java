package com.metacube.carmgmt.facade;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.metacube.carmgmt.dao.CarDAO;
import com.metacube.carmgmt.exception.SystemException;
import com.metacube.carmgmt.vo.Car;
import com.metacube.carmgmt.vo.CarVO;
import com.metacube.carmgmt.vo.VehicleVO;

@Component("defaultCarFacade")
public class DefaultCarFacade implements CarFacade {
	
		@Autowired
		CarDAO defaultCarDAO ;
		
		
		public void addCar(VehicleVO vehicleVO, Car car, CarVO carVO) throws SystemException{
			
			try {
				defaultCarDAO.addCar(vehicleVO, car, carVO);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		public List<VehicleVO> getVehicleVOList() throws SQLException, SystemException{
			return defaultCarDAO.getVehicleVOList();
		}
		
		public List<Car> getCarList() throws SystemException{
			return defaultCarDAO.getCarList();
		}
		
		public List<CarVO> getCarVOList() throws SQLException, SystemException{
			return defaultCarDAO.getCarVOList();
		}
		
		public void deleteCar(int vehicleVO_ID){
			 try {
				defaultCarDAO.deleteCar(vehicleVO_ID);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void updateCar(Car car, int vehicleVO_ID) throws SystemException {
			try {
				defaultCarDAO.updateCar( car,vehicleVO_ID);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		public void updateCarVO(CarVO carVO, int vehicleVO_ID)
				throws SystemException {
			try {
				defaultCarDAO.updateCarVO( carVO,vehicleVO_ID);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		public void updateVehicleVO(VehicleVO vehicleVO, int vehicleVO_ID)
				throws SystemException {
			try {
				defaultCarDAO.updateVehicleVO(vehicleVO,vehicleVO_ID);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}




		public void addVehicleVO(VehicleVO vehicleVO) throws SystemException {
			try {
				defaultCarDAO.addVehicleVO(vehicleVO);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}




		public void addCarVO(CarVO carVO) throws SystemException {
			try {
				defaultCarDAO.addCarVO(carVO);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}




		public void addCar(Car car) throws SystemException {
			try {
				defaultCarDAO.addCar(car);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}


