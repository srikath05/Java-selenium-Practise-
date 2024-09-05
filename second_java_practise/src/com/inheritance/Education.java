package com.inheritance;

public class Education {
	
	private int deptno;
	private String sub;
	private String pra;
	private int labs;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getPra() {
		return pra;
	}
	public void setPra(String pra) {
		this.pra = pra;
	}
	public int getLabs() {
		return labs;
	}
	public void setLabs(int labs) {
		this.labs = labs;
	}
	 public void printeducationinfo()
	 {
		 System.out.println("deptno "+deptno+"sub "+sub+"pra "+pra+"labs "+labs);
	 }
	 }
	 
	


