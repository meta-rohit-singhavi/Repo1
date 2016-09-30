package com.carbecho.connection;

import java.sql.Connection;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("connectionFactory")
public class ConnectionFactory {
	
	public ConnectionFactory(){}

	public Connection getConInstance(){
		DBConnection con = DBConnection.getInstance();
		return con.getConnection();
	}
}
