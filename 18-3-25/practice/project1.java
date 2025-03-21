/*package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Mail : ");
		String mail = sc.next();
		
		String query = "SELECT * FROM users WHERE Customer_name = '" + mail + "';";
		String url = "jdbc:mysql://localhost:3306/testdb";
		try {
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection Established Successfully...");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if(rs.next()) {
				String pass = rs.getString("Password");
				
				System.out.print("Enter the Password : ");
				String password = sc.next();
				
				if(password.equals(pass)) {
					System.out.println("Welcome back " + rs.getInt("Id"));
				}
				else {
					System.out.println("Incorrect password");
				}
			}
			else {
				System.out.println("User not found...");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}*/

package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/testdb";
		
		try {
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection Established Successfully...");
			
			System.out.print("Enter the Mail : ");
			String mail = sc.next();
			
			String query = "SELECT * FROM users WHERE Customer_name = '" + mail + "';";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if(rs.next()) {
				System.out.println("User already found...");
			}
			else {
				System.out.print("Enter the password : ");
				String pass = sc.next();
				
				String query1 = "INSERT INTO users (Customer_name, Password) VALUES ('" + mail + "', '" + pass + "');";
				int rowsAffect = st.executeUpdate(query1);
				if(rowsAffect > 0) {
					System.out.println("Account created successfully");
				}
				else {
					System.out.println("Failed to create a account");
				}
			}
			
			st.close();
			rs.close();
			con.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}