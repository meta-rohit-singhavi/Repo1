package facade_layer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Car;
import Beans.CarVO;
import Beans.VehicleVO;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String createdBy = request.getParameter("createdBy");
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		float engineInCC = Float.parseFloat(request.getParameter("engineInCC"));
		float fuelCapacity = Float.parseFloat(request.getParameter("fuelCapacity"));
		float price = Float.parseFloat(request.getParameter("price"));
		float mileage = Float.parseFloat(request.getParameter("mileage"));
		boolean acValue = Boolean.parseBoolean(request.getParameter("acValue"));
		boolean pstr = Boolean.parseBoolean(request.getParameter("pstr"));
		boolean kit = Boolean.parseBoolean(request.getParameter("kit"));
		float roadTax= price/10;
		
		
		
		
		VehicleVO vehicleVO =new VehicleVO();
		Car car=new Car();
		CarVO carVO=new CarVO();
		
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
		
		
		
	
		
	}

}
