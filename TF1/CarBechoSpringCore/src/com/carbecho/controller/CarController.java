package com.carbecho.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carbecho.beans.Car;
import com.carbecho.beans.CarVO;
import com.carbecho.beans.VehicleVO;
import com.carbecho.facade.Facade;
import com.carbecho.facade.FacadeFactory;


/**
 * Servlet implementation class CarFacade
 */
@WebServlet("/CarController")
public class CarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	FacadeFactory facadeFactory;
	
	Facade facade = new FacadeFactory().getFacade();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CarController() {
		super();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String job = request.getParameter("job");

		List<Car> carList = facade.getCarList();
		List<CarVO> carVOList = facade.getCarVOList();
		List<VehicleVO> vehicleVOList = facade.getVehicleVOList();
		
		if (job.equals("detail")) {
			request.setAttribute("vehicleVOList", vehicleVOList);
			System.out.println("vehicle List : "+vehicleVOList);
			RequestDispatcher rd= request.getRequestDispatcher("list.jsp");
			rd.forward(request, response);
		}
		else if (job.equals("view")) {
			Car car =new Car();
			CarVO carVO = new CarVO();
			VehicleVO vehicleVO = new VehicleVO();
			int vehicleVO_ID = Integer.parseInt(request.getParameter("vehicle_ID"));
		
			for(Car tempCar : carList){
				if(tempCar.getVehicleVO_ID() == vehicleVO_ID){
					car= tempCar;
					break;
				}
			}
			for(CarVO tempCarVO : carVOList){
				if(tempCarVO.getVehicleVO_ID() == vehicleVO_ID){
					carVO = tempCarVO;
					break;
				}
			}
			for(VehicleVO tempVehicleVO : vehicleVOList){
				if(tempVehicleVO.getVehicleVO_ID() == vehicleVO_ID){
					vehicleVO = tempVehicleVO;
					break;
				}
			}
			
			request.setAttribute("car", car);
			request.setAttribute("carVO", carVO);
			request.setAttribute("vehicleVO", vehicleVO);
			
			RequestDispatcher rd= request.getRequestDispatcher("detailView.jsp");
			rd.forward(request, response);
			
			
		}
		
		
		else if (job.equals("update")) {
			
			Car car =new Car();
			CarVO carVO = new CarVO();
			VehicleVO vehicleVO = new VehicleVO();
			int vehicleVO_ID = Integer.parseInt(request.getParameter("vehicle_ID"));
		
			for(Car tempCar : carList){
				if(tempCar.getVehicleVO_ID() == vehicleVO_ID){
					car= tempCar;
					break;
				}
			}
			for(CarVO tempCarVO : carVOList){
				if(tempCarVO.getVehicleVO_ID() == vehicleVO_ID){
					carVO = tempCarVO;
					break;
				}
			}
			for(VehicleVO tempVehicleVO : vehicleVOList){
				if(tempVehicleVO.getVehicleVO_ID() == vehicleVO_ID){
					vehicleVO = tempVehicleVO;
					break;
				}
			}
			
			request.setAttribute("car", car);
			request.setAttribute("carVO", carVO);
			request.setAttribute("vehicleVO", vehicleVO);
			request.setAttribute("job","update");
			request.setAttribute("vehicle_ID", vehicleVO_ID);
			RequestDispatcher rd= request.getRequestDispatcher("add.jsp");
			rd.forward(request, response);
			
			
		}//end job=update
		
		else if(job.equals("add")){
			request.setAttribute("job","add");
			RequestDispatcher rd= request.getRequestDispatcher("add.jsp");
			rd.forward(request, response);
		}
		
		else if(job.equals("delete")){
			int vehicleVO_ID = Integer.parseInt(request.getParameter("vehicle_ID").trim());
			facade.deleteCar(vehicleVO_ID);
			
			RequestDispatcher rd= request.getRequestDispatcher("CarController?job=detail");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String job = request.getParameter("job").trim();
		if(job.equals("add")){
			String createdBy = request.getParameter("createdBy");
			String make = request.getParameter("make");
			String model = request.getParameter("model");
			float engineInCC = Float.parseFloat(request.getParameter("engineInCC"));
			float fuelCapacity = Float.parseFloat(request
					.getParameter("fuelCapacity"));
			float price = Float.parseFloat(request.getParameter("price"));
			float mileage = Float.parseFloat(request.getParameter("mileage"));
			int acValue = Integer.parseInt(request.getParameter("acValue"));
			int pstr = Integer.parseInt(request.getParameter("pstr"));
			int kit = Integer.parseInt(request.getParameter("kit"));
			float roadTax = price / 10;

			VehicleVO vehicleVO = new VehicleVO(make,model,engineInCC,fuelCapacity,mileage,price,roadTax);
			Car car = new Car();
			CarVO carVO = new CarVO(acValue,pstr,kit);
			
			car.setCreated_By(createdBy);
			facade.addCar(vehicleVO, car, carVO);
			
			RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			

		}
		else if(job.equals("update")){
			
			int vehicleVO_ID = Integer.parseInt(request.getParameter("vehicle_ID").trim());
			String updatedBy = request.getParameter("updatedBy");
			String createdBy = request.getParameter("createdBy");
			String make = request.getParameter("make");
			String model = request.getParameter("model");
			float engineInCC = Float.parseFloat(request.getParameter("engineInCC"));
			float fuelCapacity = Float.parseFloat(request
					.getParameter("fuelCapacity"));
			float price = Float.parseFloat(request.getParameter("price"));
			float mileage = Float.parseFloat(request.getParameter("mileage"));
			int acValue = Integer.parseInt(request.getParameter("acValue"));
			int pstr = Integer.parseInt(request.getParameter("pstr"));
			int kit = Integer.parseInt(request.getParameter("kit"));
			float roadTax = price / 10;

			VehicleVO vehicleVO = new VehicleVO(make,model,engineInCC,fuelCapacity,mileage,price,roadTax);
			Car car = new Car(createdBy,updatedBy);
			CarVO carVO = new CarVO(acValue,pstr,kit);
			

			
			facade.updateCar(vehicleVO, car, carVO,vehicleVO_ID);
			
			
			RequestDispatcher rd= request.getRequestDispatcher("CarController?job=detail");
			rd.forward(request, response);
		}
		
		if (job.equals("detail")) {
			
			List<VehicleVO> vehicleVOList = facade.getVehicleVOList();
			request.setAttribute("vehicleVOList", vehicleVOList);
			
			RequestDispatcher rd= request.getRequestDispatcher("list.jsp");
			rd.forward(request, response);
		}
		
	}

}
