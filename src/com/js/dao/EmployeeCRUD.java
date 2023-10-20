package com.js.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.js.dto.Employee;

public class EmployeeCRUD {
	private final static String PATH = "com.mysql.cj.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3307/jdbc_employee";
	private final static String USER = "root";
	private final static String PWD = "Lakshmi@2001";

	public int insertEmployee1(Employee e) {
		return 0;
	}

	public int insertEmployee(Employee e) {
		String query = "insert into employee values (?,?,?,?,?)";
		Connection con = null;
		try {
			Class.forName(PATH);
			con = DriverManager.getConnection(URL, USER, PWD);
			PreparedStatement es = con.prepareStatement(query);
			es.setInt(1, e.getEmployeeId());
			es.setString(2, e.getFirstName());
			es.setString(3, e.getLastName());
			es.setString(4, e.getEmailAddress());
			es.setLong(5, e.getContactNumber());
			return es.executeUpdate();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public int deleteEmployeeById(int id) {
		String query = "delete from employee where EmployeeId=?";
		Connection con = null; // local variable for method
		try {
			Class.forName(PATH);
			con = DriverManager.getConnection(URL, USER, PWD);
			PreparedStatement es = con.prepareStatement(query);
			es.setInt(1, id);
			return es.executeUpdate();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e1) {
				Throwable e;
				e1.printStackTrace();
			}
		}
		return 0;
	}

	public int updateEmployee(Employee p, int id) {
		String query = "update employee set FirstName=?,LastName=?,EmailAddress=?,ContactNumber=? where EmployeeId=?";// ? is a
																										// placeholder

		Connection con = null;// local variable method
		try {
			Class.forName(PATH);
			con = DriverManager.getConnection(URL, USER, PWD);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, p.getFirstName());
			ps.setString(2, p.getLastName());
			ps.setString(3, p.getEmailAddress());
			ps.setLong(4, p.getContactNumber());
			ps.setInt(5, id);
			return ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public ArrayList<Employee> getAllEmployees() {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Connection con = null;
		String query = "select * from employee";
		try {
			Class.forName(PATH);
			con = DriverManager.getConnection(URL, USER, PWD);
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setEmployeeId(rs.getInt(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setEmailAddress(rs.getString(4));
				e.setContactNumber(rs.getLong(5));
				al.add(e);
			}
			return al;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
