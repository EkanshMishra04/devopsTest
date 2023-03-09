package com.nagarro.dto;

public class StudentDto {
	
	private String name;
	private String department;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentDto() {
	}
	
	public StudentDto(String name, String department, String address) {
		this.name = name;
		this.department = department;
		this.address = address;
	}
}
