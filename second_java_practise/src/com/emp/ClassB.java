package com.emp;

 public  class ClassB extends ClassC{

	
	private int id;
	private String Name;
	private String dept;
	private String span;
	
	
	public ClassB()
	{
		
	}
	public ClassB(int empsalary,int doj,String qualif,String gender,int id,String Name,String dept,String span)
	{
		super(empsalary,doj,qualif,gender);
		this.id=id;
		this.Name=Name;
		this.dept=dept;
		this.span=span;
		
	}
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSpan() {
		return span;
	}
	public void setSpan(String span) {
		this.span = span;
	}
	
	void printemp()
	{
		printempinfo();
		System.out.println("id "+id+","+"name "+Name+","+"dept "+dept+", "+"span "+span);
		
	}
	 
}
