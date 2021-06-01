package com.tcs.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersDAO {
	
	Connection connection;
	
	private static final String  UPDATE="update users set first_name=? where username=?";
	
	public CustomersDAO(Connection connection) {
		
		this.connection=connection;
	}
	
	
	
	public void deleteUser(String userName) {
		
		String delete="delete from users where username=?";

		try {
			
			PreparedStatement ps=connection.prepareStatement(delete);
			ps.setString(1, userName);
			ps.execute();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public CustomersDTO findCustomer(String userName) {
		
		
		String findState="select username,password,first_name,last_name,age,activity from users where username=?";
		
		try {
			PreparedStatement ps=this.connection.prepareStatement(findState);
			ps.setString(1, userName);
			CustomersDTO outDto=new CustomersDTO();

			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				outDto.setUsername(rs.getString("username"));
				outDto.setPassword(rs.getString("password"));
				outDto.setFirstName(rs.getString("first_name"));
				outDto.setLastName(rs.getString("last_name"));
				outDto.setAge(rs.getInt("age"));
				outDto.setActivity(rs.getString("activity"));
	
				

				

				
			}
			
			return outDto;

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
		}
		
		
		
	}
	
	
	public void updateCustomerfirstName(String firstName,String username) {
		
		try {
			PreparedStatement ps=connection.prepareStatement(UPDATE);
			ps.setString(1,firstName );
			ps.setString(2, username);
			
			ps.execute();
			System.out.println("updateUser");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void  createCustomer(CustomersDTO dto) {
		
		
		String INSERT="insert into users values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement statement=connection.prepareStatement(INSERT);
			
			statement.setString(1, dto.getUsername());
			statement.setString(2, dto.getPassword());
			statement.setString(3, dto.getFirstName());
			statement.setString(4, dto.getLastName());
			statement.setInt(5, dto.getAge());
			statement.setString(6, dto.getActivity());
			
			statement.execute();


			


			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
