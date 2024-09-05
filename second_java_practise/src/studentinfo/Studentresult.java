package studentinfo;

 //import studentinfo.*;
public class Studentresult {

	public static void main(String[] args) {
		
		StudentForm std=new StudentForm();
		std.setRoll(1);
		std.setName("srikanth");
		std.setTel(60);
		std.setHin(70);
		std.setEng(80);
		std.setMath(90);
		std.total();
		std.avg();
		std.printStudentForm();
		
		
		StudentForm std1=new StudentForm();
		std1.setRoll(2);
		std1.setName("shirisha");
		std1.setTel(75);
		std1.setHin(80);
		std1.setEng(94);
		std1.setMath(95);
		std1.total();
		std1.avg();
		std1.printStudentForm();
		
		StudentForm std2 = new StudentForm(3);
		std2.setName("Raj");
		std2.printStudentForm();
		
		StudentForm std3 = new StudentForm(4,"Kiran",45,60,70,75);
		std3.total();
		std3.avg();
		std3.printStudentForm();
		
	}

}
