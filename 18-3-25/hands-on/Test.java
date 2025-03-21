package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		String query="SELECT* FROM users;";
		
		String url="jdbc:mysql://localhost:3306/testdb";
		String user="root";
		String password="root";
		
		try{
			Connection con =  DriverManager.getConnection(url, user, password); //using interface and created obj con
			System.out.println("Connection established successfully");
			
			Statement st=con.createStatement(); //changing querry to stmt
			st.executeQuery(query);
			ResultSet rs=st.executeQuery(query); //storing result
			
			while(rs.next()){
			int id=rs.getInt("Id");
			String pass=rs.getString("password");
			String name=rs.getString("Customer_name");
			
			System.out.println(id + " " + pass + " " + name);			
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}


	}

}
