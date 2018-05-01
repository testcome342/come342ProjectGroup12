

import java.util.Scanner;

public class StaffGrade {

	public String gradeStartDate;
	public String gradeFinishDate;
	Scanner scanner=new Scanner(System.in);
	
	static StaffGrade staffgrade = new StaffGrade();
	
	static Database staffdb = new Database("",1);

public int staffNo;
public int staffGrade;

	
	public StaffGrade() {
		
		
	}
	
	public StaffGrade(int staffNo,int staffGrade) {
		this.staffNo= staffNo;
		this.staffGrade = staffGrade;
		
	}
	
	
	public void setStaffno(int staffNo) {
		
		this.staffNo = staffNo;
		
	}
	
	public int getStaffNo() {
		
		return staffNo;
		
	}
	
	

	public void setStaffGrade(int staffGrade){
		
		this.staffGrade = staffGrade;
		
	}
	
	
	
	public int getStaffGrade() {
		
		return staffGrade;
	
	}
	
	
	
	
	
	public void createStaffGrade() { 
		
		
		System.out.println("Enter Staff No:  ");
		staffgrade.setStaffno(scanner.nextInt());
		
		
		
		System.out.println("Enter Staff Grade:");
		staffgrade.setStaffGrade(scanner.nextInt());
		
		

		staffdb.staffgradeList.add(new StaffGrade(staffgrade.getStaffNo(),staffgrade.getStaffGrade()));
		
		System.out.println("Staff grade is added");
		
	}
	
	
	public void getStaffGrades() {    
		for(int i=0;i<staffdb.staffgradeList.size();i++) {
			
			
			
			System.out.println("Staff No: "+staffdb.staffgradeList.get(i).getStaffNo());
			System.out.println("Staff Grade: "+staffdb.staffgradeList.get(i).getStaffGrade());
		
			System.out.println("//////////////////////////////////////////////////");
			
			
	
	}
	
	
	}
	
	public void assignLatestGrade() {
		
		
	}
}
