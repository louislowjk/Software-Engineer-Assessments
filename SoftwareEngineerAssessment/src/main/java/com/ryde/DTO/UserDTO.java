package com.ryde.DTO;

import java.util.Date;



public class UserDTO {
	private Integer id; 
	private String name; 
	private Date dob; 
	private String address; 
	private String description; 
	private Date createdAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Id = "+ this.getId()+"\n");
		sb.append("Name - "+ this.getName()+"\n");
		sb.append("Address = "+ this.getAddress()+"\n");
		sb.append("Description = "+ this.getDescription()+"\n");
		sb.append("DOB = "+ this.getDob()+"\n");
		sb.append("Created At = "+ this.getCreatedAt()+"\n");
		return sb.toString();
	}
	
}
