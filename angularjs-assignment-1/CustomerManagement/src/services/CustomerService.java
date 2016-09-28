package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.beans.Customer;
import com.services.CustomerDAO;


@Path("/resources")
public class CustomerService {

	CustomerDAO customerDao = new CustomerDAO();
	@GET
	@Path("/customers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getEmployeeList() {
		return customerDao.getCustomerList();
	}
}
