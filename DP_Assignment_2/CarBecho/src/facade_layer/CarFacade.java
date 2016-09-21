package facade_layer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Car;
import Beans.CarVO;
import Beans.VehicleVO;
import DAO.CarDAO;

/**
 * Servlet implementation class CarFacade
 */
@WebServlet("/CarFacade")
public class CarFacade extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CarFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String job = request.getParameter("job").trim();
		CarDAO carDAO = new CarDAO();
		List<Car> carList = carDAO.getCarList();
		List<CarVO> carVOList = carDAO.getCarVOList();
		List<VehicleVO> vehicleVOList = carDAO.getVehicleVOList();
		
		if (job.equals("detail")) {
			/*request.setAttribute("carList", carList);
			request.setAttribute("carVOList", carVOList);*/
			request.setAttribute("vehicleVOList", vehicleVOList);
			
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
			
			
		}//end job=view
		
		
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
			
			try {
				carDAO.deleteCar(vehicleVO_ID);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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

			VehicleVO vehicleVO = new VehicleVO();
			Car car = new Car();
			CarVO carVO = new CarVO();

			vehicleVO.setMake(make);
			vehicleVO.setEngineInCC(engineInCC);
			vehicleVO.setFuelCapacity(fuelCapacity);
			vehicleVO.setMileage(mileage);
			vehicleVO.setModel(model);
			vehicleVO.setPrice(price);
			vehicleVO.setRoadTax(roadTax);

			car.setCreated_By(createdBy);

			carVO.setAc(acValue);
			carVO.setAccessoryKit(kit);
			carVO.setPowerSteering(pstr);

			CarDAO carDAO = new CarDAO();
			try {
				carDAO.addCar(vehicleVO, car, carVO);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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

			VehicleVO vehicleVO = new VehicleVO();
			Car car = new Car();
			CarVO carVO = new CarVO();

			vehicleVO.setMake(make);
			vehicleVO.setEngineInCC(engineInCC);
			vehicleVO.setFuelCapacity(fuelCapacity);
			vehicleVO.setMileage(mileage);
			vehicleVO.setModel(model);
			vehicleVO.setPrice(price);
			vehicleVO.setRoadTax(roadTax);

			car.setCreated_By(createdBy);
			car.setUpdated_By(updatedBy);
			

			carVO.setAc(acValue);
			carVO.setAccessoryKit(kit);
			carVO.setPowerSteering(pstr);

			CarDAO carDAO = new CarDAO();
			try {
				carDAO.updateCar(vehicleVO, car, carVO,vehicleVO_ID);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

}
