package oops;

public class App {
	public static void main(String[] args) {
		Students s1 = new Students(1, "Mounish Vatti",'D');
		StaffDetails staff1 = new StaffDetails(1, "Harish Shah", "SWE");
		
		s1.printStudentInfo();
		s1.attendSessions();
		
		System.out.println();
		
		staff1.printDetails();
		staff1.applyLeave();
			
		StaffDetails.employeeBenefits();
		
		System.out.println();
		
		s1.set_studentID(0);
		s1.printStudentInfo();
		
		System.out.println();
		
		Students.college_name = "VIT Vellore";
		s1.printStudentInfo();
		
		Students s2 = new Students(1, "Rahul KP",'D');
		s2.printStudentInfo();
		Students.college_name = "VIT Chennai";
		s1.printStudentInfo();
	}
}
