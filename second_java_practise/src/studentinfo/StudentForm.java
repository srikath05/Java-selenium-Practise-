package studentinfo;

public class StudentForm {

	// Class Variables
	private int roll;
	private String name;
	private int Tel;
	private int hin;
	private int eng;
	private int math;
	private int total;
	private double avg;

	// zero argument constuctor
	public StudentForm() {

	}

	// one argemtn constructor
	public StudentForm(int roll) {
		this.roll = roll;
	}

	// two argemtn constr
	public StudentForm(int roll, String name, int Tel, int hin, int eng, int math) {
		this.roll = roll;
		this.name = name;
		this.Tel = Tel;
		this.hin = hin;
		this.eng = eng;
		this.math = math;

	}

	// getters and setters
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

	public int getTel() {
		return Tel;
	}

	public void setTel(int tel) {
		Tel = tel;
	}

	public int getHin() {
		return hin;
	}

	public void setHin(int hin) {
		this.hin = hin;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	// normal non static methods
	public void total() {

		int total = Tel + hin + eng + math;
		this.total = total;
		/// System.out.println("studentdetail : "+total);

	}

	public void avg()

	{
		double avg = ((total * 100) / 400);
		this.avg = avg;
		// System.out.println("Student avg is :"+avg);
	}

	public void printStudentForm() {

		System.out.println("Roll " + roll + " Name " + name + " Tel " + Tel + " Hin " + hin + " Eng " + eng + " Math "
				+ math + " total" + total + " avg " + avg);
	}
}
