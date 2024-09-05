package com.inheritance;

abstract public class Teacher {

	private String designation;
	private String clgName;
	private String clgAddress;
	public Teacher()
	{
		
	}
	
	public Teacher(String designation,String clgName,String clgAddress)
	{
		this.designation =designation;
		this.clgName = clgName;
		this.clgAddress= clgAddress;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getClgAddress() {
		return clgAddress;
	}
	public void setClgAddress(String clgAddress) {
		this.clgAddress = clgAddress;
	}
	
	public void printDetails() {
		System.out.println(" designation " + designation+ " clgName " + clgName +" clgAddress "+clgAddress);
	}
	
	public void printNumberofclasses()
	{
		int numberOfClasses = 4;
		System.out.println("numberOfClasses :"+numberOfClasses );
	}
	
	abstract public void printAge();
	/*{
		
		int age =35;
		System.out.println("age is : "+age);
	}
	*/
	
}

