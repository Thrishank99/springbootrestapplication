package com.org.java.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor 
@ToString
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	private String name;
	private double salary;
	private int departmentId;
	private String deptName;

}
