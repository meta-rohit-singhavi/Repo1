package com.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.beans.Customer;

public class CustomerDAO {

	Connection con = new DBConnection().getConnection();

	public int addCustomer(Customer customer) throws SQLException {

		String addIntoCustomer = "INSERT INTO Customer (`firstName`, `lastName`,`email`, `address`, `numOfOrders`)"
				+ "VALUES(?,?,?,?,?)";

		PreparedStatement pstmt = con.prepareStatement(addIntoCustomer);
		pstmt.setString(1, customer.getFirstName());
		pstmt.setString(2, customer.getLastName());
		pstmt.setString(3, customer.getEmail());
		pstmt.setString(4, customer.getAddress());
		pstmt.setInt(5, customer.getNumOfOrders());

		int result = pstmt.executeUpdate();
		return result;

	}

	public void updateCustomer(Customer customer) throws SQLException {

		String updateIntoCustomer = "Update Customer set firstName=?,lastName=?,email=?,address=?,numOfOrders=? where customerID=?";

		PreparedStatement pstmt = con.prepareStatement(updateIntoCustomer);

		pstmt.setString(1, customer.getFirstName());
		pstmt.setString(2, customer.getLastName());
		pstmt.setString(3, customer.getEmail());
		pstmt.setString(4, customer.getAddress());
		pstmt.setInt(5, customer.getNumOfOrders());
		pstmt.setInt(6, customer.getCustomerID());
		pstmt.executeUpdate();
	}

	public int deleteCustomer(int customerID) throws SQLException {
		String deleteFromCustomer = "delete from Customer where customerID=?";
		PreparedStatement pstmt = con.prepareStatement(deleteFromCustomer);
		pstmt.setInt(1, customerID);

		int result = pstmt.executeUpdate();
		return result;
	}

	public List<Customer> getCustomerList() {
		ResultSet rs = null;
		String getCustomer = "select * from Customer";
		List<Customer> customerList = new LinkedList<Customer>();
		try {
			PreparedStatement pstmt = con.prepareStatement(getCustomer);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Customer temp = new Customer();
				temp.setCustomerID(rs.getInt("customerID"));
				temp.setFirstName(rs.getString("firstName"));
				temp.setLastName(rs.getString("lastName"));
				temp.setEmail(rs.getString("email"));
				temp.setAddress(rs.getString("address"));
				temp.setNumOfOrders(rs.getInt("numOfOrders"));
				customerList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customerList;
	}

	public Customer getCustomerByID(int customerID) {
		ResultSet rs = null;
		String getCustomer = "select * from Customer where customerID=?";
		Customer customer = new Customer();
		try {
			PreparedStatement pstmt = con.prepareStatement(getCustomer);
			pstmt.setInt(1, customerID);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				customer.setCustomerID(rs.getInt("customerID"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setEmail(rs.getString("email"));
				customer.setAddress(rs.getString("address"));
				customer.setNumOfOrders(rs.getInt("numOfOrders"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}
	
	public List<Customer> getCustomerListByName(String firstName) {
		ResultSet rs = null;
		String getCustomer = "select * from customer where firstName =?";
		List<Customer> customerList = new LinkedList<Customer>();
		try {
			PreparedStatement pstmt = con.prepareStatement(getCustomer);
			pstmt.setString(1, firstName);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Customer temp = new Customer();
				temp.setCustomerID(rs.getInt("customerID"));
				temp.setFirstName(rs.getString("firstName"));
				temp.setLastName(rs.getString("lastName"));
				temp.setEmail(rs.getString("email"));
				temp.setAddress(rs.getString("address"));
				temp.setNumOfOrders(rs.getInt("numOfOrders"));
				customerList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customerList;
	}

}
