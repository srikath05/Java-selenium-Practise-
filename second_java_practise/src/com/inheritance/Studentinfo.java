package com.inheritance;

public class Studentinfo {
	
	private int roll;
	private String name;
	private String dept;
	private String clg;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	
	public void printstudentinfo()
	{
		System.out.println("roll "+roll+"name "+name+"dept "+dept+"clg "+clg);
	}
	

}
