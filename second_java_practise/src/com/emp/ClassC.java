package com.emp;

import com.inheritance.SpecilizedTeacher;


public  class ClassC extends SpecilizedTeacher {

	private int empsalary;
	private int doj;
	private String qualif;
	private String gender;
	public ClassC()
	{
		
	}
	public ClassC(int empsalary,int doj,String qualif,String gender)
	{
		this.empsalary=empsalary;
		this.doj=doj;
		this.qualif=qualif;
		this.gender=gender; 
	}
	
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public String getQualif() {
		return qualif;
	}
	public void setQualif(String qualif) {
		this.qualif = qualif;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	void printempinfo()
	{
		
		System.out.println("empsalary "+empsalary+", "+"doj "+doj+", "+"qualif "+qualif+", "+"gender "+gender);
	}
}
