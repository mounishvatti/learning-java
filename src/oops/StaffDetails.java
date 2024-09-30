package oops;

public class StaffDetails {
	int Emp_ID;
	String Emp_name;
	String designation;

	StaffDetails(){}
	
	StaffDetails(int Emp_ID, String Emp_name, String designation){
		this.Emp_ID = Emp_ID;
		this.Emp_name = Emp_name;
		this.designation = designation;
	}
	
	public void applyLeave() {
		System.out.println("Leave Applied!!");
	}
	
	public void printDetails() {
		System.out.println(this.Emp_ID+", "+this.Emp_name+", "+this.designation);
	}
	
	// static method - no need to create object before calling it
	public static void employeeBenefits() { 
		System.out.println("Work from home & High compensation");
	}
}
