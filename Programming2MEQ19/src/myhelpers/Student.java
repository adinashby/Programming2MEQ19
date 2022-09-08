package myhelpers;

public class Student implements Comparable<Student>{
	
	private int id;
	private String fname;
	private String lname;
	private int age;
	private char gender;
	
	public Student(int id, String fname, String lname, int age, char gender) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public int compareTo(Student anotherStudent) {
		// return this.age - anotherStudent.age;
		return this.fname.compareTo(anotherStudent.fname) * 100
				+ this.age - anotherStudent.age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	

	
	

}
