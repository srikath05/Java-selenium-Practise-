package com.collections;

public class details {

			private int id;
			private String name;
			private String address;
			private String designation;
			private int salary;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getDesignation() {
				return designation;
			}
			public void setDesignation(String designation) {
				this.designation = designation;
			}
			public int getSalary() {
				return salary;
			}
			public void setSalary(int salary) {
				this.salary = salary;
			}
			
			public void printdetails() {
				System.out.println("id "+id+", "+"name "+name+", "+"designation "+designation+", "+"salary "+salary+", "+"address "+address);
			}
			}

