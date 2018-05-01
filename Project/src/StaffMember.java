

import java.util.Scanner;


public class StaffMember {
	public int staffNo, staffStartGrade;
	public String staffName,staffStartDate,staffEmailAdress;
	
	public int recordNo;
	
	static Database db=new Database("staffContact"); //staffContact
	static Database db2 = new Database();   //staffList
	
	static StaffMember staffmember=new StaffMember();
	
	
	
	Scanner scanner=new Scanner(System.in);
	
	public StaffMember() {
		
	}
	

	
	public StaffMember(int staffNo,String staffName,String staffStartDate, String staffEmailAdress ) {
		
		
		 this.staffNo= staffNo;
	     this.staffName = staffName;
		 this.staffStartDate = staffStartDate;
		 this.staffEmailAdress = staffEmailAdress;
		
		
	}
	
	
	public StaffMember(int staffNo,String staffStartDate,int staffStartGrade ) { //yeni staff eklemek için
		
		
		 this.staffNo= staffNo;
		 
		 this.staffStartDate = staffStartDate;
		 this.staffStartGrade = staffStartGrade;
	
		
		
	}
	
	
	public void setStaffNo(int staffNo) {
		
		this.staffNo= staffNo;
	}
	
		public int getStaffNo(){
		return staffNo;
		}
	
		public void setStaffName(String staffName) {
			
			this.staffName= staffName;
		}
		
		
		 public String getStaffName(){
				return staffName;
				}
		 
		 
			public void setStaffStartDate(String staffStartDate) {
				
				this.staffStartDate= staffStartDate;
			}
			
		 
	public String getStaffStartDate(){
		return staffStartDate;
		}
	
   
	public void setStaffEmailAdress(String staffEmailAdress) {
		
		this.staffEmailAdress= staffEmailAdress;
	}
	
	public String getStaffEmailAdress(){
		return staffEmailAdress;
		}
	
	
public void setStaffStartGrade(int staffStartGrade) {
		
		this.staffStartGrade= staffStartGrade;
	}
	
		public int getStaffStartGrade(){
		return staffStartGrade;
		}
	
	
	
	
	public void assignStaffContact() {
		
		System.out.println("Staff No:  ");
		staffmember.setStaffNo(scanner.nextInt());
		
		System.out.println("Staff Name:");
		
		staffmember.setStaffName(scanner.next());
		
		System.out.println("Staff Start date:");
		staffmember.setStaffStartDate(scanner.next());
		
		System.out.println("Staff Email Adress:");
		staffmember.setStaffEmailAdress(scanner.next());
		
	
		
		db.staffContactList.add(new StaffMember(staffmember.getStaffNo(),staffmember.getStaffName(),staffmember.getStaffStartDate(),staffmember.getStaffEmailAdress()));
		
		
		
		
		
	}
	
	
	
	
	public void addNewStaffMember() {
		
		System.out.println("Enter Staff No:  ");
		staffmember.setStaffNo(scanner.nextInt());
		
		
		
		System.out.println("Enter Staff Start Date:");
		staffmember.setStaffStartDate(scanner.next());
		
		
		System.out.println("Enter Staff Start Grade: ");
		staffmember.setStaffStartGrade(scanner.nextInt());
		
		
		db2.staffList.add(new StaffMember(staffmember.getStaffNo(),staffmember.getStaffStartDate(),staffmember.getStaffStartGrade()));
		
		System.out.println("New staff member is added !");
		
		
	}
	
	public void getStaffDetails() {
		
		for(int i=0;i<db.staffContactList.size();i++) {
			
		
				
				System.out.println("Staff No: "+db.staffContactList.get(i).getStaffNo());
				System.out.println("Staff Name: "+db.staffContactList.get(i).getStaffName());
				System.out.println("Staff Start Date: "+db.staffContactList.get(i).getStaffStartDate());
				System.out.println("Staff Email Adress: "+db.staffContactList.get(i).getStaffEmailAdress());
				
				System.out.println("//////////////////////////////////////////////////");
				
				
		
		}
		
		}
	}
		

	
	

