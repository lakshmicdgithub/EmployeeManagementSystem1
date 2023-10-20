package com.js.dto;

public class Employee {
	private int EmployeeId;
	private String FirstName;
	private String LastName;
	private String EmailAddress;
	private long ContactNumber;

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public long getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}

	public void printStackTrace() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", EmailAddress=" + EmailAddress + ", ContactNumber=" + ContactNumber + "]";
	}

}
