package com.js.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.js.dao.EmployeeCRUD;
import com.js.dto.Employee;

public class EmployeeMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("1.Add Employees");
			System.out.println("2.Display All Employees");
			System.out.println("3.Edit Employee Details");
			System.out.println("4.Delete Employee");
			System.out.println("5.exit");
			System.out.println("Enter the Choice");
			int n = sc.nextInt();
			switch (n) {

			case 1: {
				Employee e = new Employee();
				System.out.println("Enter Employee Id");
				e.setEmployeeId(sc.nextInt());
				System.out.println("Enter Employee FirstName");
				e.setFirstName(sc.next());
				System.out.println("Enter Employee LastName");
				e.setLastName(sc.next());
				System.out.println("Enter Employee EmailAddress");
				e.setEmailAddress(sc.next());
				System.out.println("Enter Employee ContactNumber");
				e.setContactNumber(sc.nextLong());

				EmployeeCRUD ec = new EmployeeCRUD();
				int res = ec.insertEmployee(e);
				if (res > 0) {
					System.out.println("Emplyee Inserted Successfully");
				} else {
					System.out.println("Failed to Insert Employee");
				}
			}
				break;
			case 2: {
				ArrayList<Employee> employees = new EmployeeCRUD().getAllEmployees();

				if (employees != null) {
					for (Employee e : employees) {
						System.out.println(e);
						System.out.println("==========================");
					}
				} else {
					System.out.println("No Employees are Available");
				}
			}
				break;
			case 3: {
				Employee p = new Employee();
				System.out.println("Enter Employee Id");
				int id = sc.nextInt();
				System.out.println("Enter Employee FirstName");
				p.setFirstName(sc.next());
				System.out.println("Enter Employee LastName");
				p.setLastName(sc.next());
				System.out.println("Enter Employee EmailAddress");
				p.setEmailAddress(sc.next());
				System.out.println("Enter Employee ContactNumber");
				p.setContactNumber(sc.nextLong());

				EmployeeCRUD pc = new EmployeeCRUD();
				int res = pc.updateEmployee(p, id);
				if (res > 0) {
					System.out.println("Product Updated Sucessfully");
				} else {
					System.out.println("Failed to Update Product");

				}
			}
				break;
			case 4: {
				System.out.println("Enter the Id to Delete");
				int id = sc.nextInt();
				EmployeeCRUD ec = new EmployeeCRUD();
				int res = ec.deleteEmployeeById(id);
				if(res>0) {
					System.out.println("Employee Deleted");
				} else {
					System.out.println("No Employee available to Delete");
				
				}
			}
				break;
			case 5: {
				b = false;
				System.out.println("Thank You");
			}
			}
		}
	}
}
