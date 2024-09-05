package com.inheritance;

 public class SpecilizedTeacher extends Teacher {

	private String subject;
	
	public SpecilizedTeacher()
	{
		
	}
	
	public SpecilizedTeacher(String designation,String clgName,String clgAddress,String subject)
	{
		super(designation,clgName,clgAddress);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void printTeacherDetails() {
		printDetails();
		System.out.println(" subject " + subject);
	}
	
	public void printNumberofclasses()
	{
		int numberOfClasses = 10;
		System.out.println("numberOfClasses :"+numberOfClasses );
	}
	public void printAge()
	{
		int age =35;
		System.out.println("age is : "+age);
	}
	
}
