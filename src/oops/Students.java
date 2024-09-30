package oops;

public class Students { // package-private by default in java
	int student_ID;
	String stdname;
	char division;
	static String college_name = "VIT";
	
	Students(){}
	
	Students(int student_ID, String stdname, char division){
		this.student_ID = student_ID;
		this.stdname = stdname;
		this.division = division;
	}
	
	// setters
	public void set_studentID(int student_ID) {
		this.student_ID = student_ID;
	}
	
	// getters
	public void get_studentID() {
		System.out.println(this.student_ID);
	}
	
	public void attendSessions() {
		System.out.println("Students are attending classes");
	}
	
	public void printStudentInfo() {
		System.out.println(this.student_ID+", "+this.stdname+", "+this.division+", "+college_name);
	}
}
