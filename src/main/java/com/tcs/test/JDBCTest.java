package com.tcs.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		
		

		JDBCConnectionManager jcm=new JDBCConnectionManager("localhost:3306", "hplus", "root", "1234567890");
		
		try {
			
			Connection connection=jcm.getConnection();
			
//			Statement statement=connection.createStatement();
//			ResultSet resultset=statement.executeQuery("select count(*) from products;");
			
//			CustomersDAO dao=new CustomersDAO(connection);
//			
//			CustomersDTO dto=new CustomersDTO();
//			
//			dto.setFirstName("Abdul");
//			dto.setActivity("Basketball");
//			dto.setAge(23);
//			dto.setLastName("Syed");
//			dto.setPassword("Testinggggg");
//			dto.setUsername("Test_use");
//			dao.createCustomer(dto);
			
//			CustomersDTO dtoOut=dao.findCustomer("admin");
			
//			System.out.println(dtoOut.getActivity());
			
			CustomersDAO dao=new CustomersDAO(connection);
//			dao.updateCustomerfirstName("syedAbdul ", "admin");
			dao.deleteUser("testing");
			
			

		}
			
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}


