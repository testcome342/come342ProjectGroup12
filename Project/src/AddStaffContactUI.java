


public class AddStaffContactUI {

	
AddStaffContact staff =new AddStaffContact();
AddStaffContact grade = new AddStaffContact();
AddStaffContact campaign = new AddStaffContact();
	
	public void startUI(int num) {
		if (num==1) {
			staff.getStaff(num);

		}else if (num==2) {
			staff.getStaff(num);

		}
		
	else if (num==3) {      //add a new staff member 
			staff.getStaff(num);

		}
		
	else if (num ==4) {  //create a new grade
		grade.getStaff(num);
		
	}
	else if (num ==5) {  //create a new grade rate
		grade.getStaff(num);
		
	}
		
	else if (num ==6) {  //create a new grade rate
		campaign.getStaff(num);
		
	}
	else if (num ==7) {  //create a new grade rate
		campaign.getStaff(num);
		
	}
		
	else if (num ==8) {  //create a new grade rate
		grade.getStaff(num);
		
	}
		
	else if (num ==9) {  //create a new grade rate
		grade.getStaff(num);
		
	}
	
}
}
