
public class AddStaffContact {

	

StaffMember staff=new StaffMember();
Grade grade = new Grade();
GradeRate gradeRate = new GradeRate();
StaffGrade staffgrade = new StaffGrade();
Campaign campaign = new Campaign();

	
	public void getStaff(int selectType) {
		if(selectType==1) {
			staff.assignStaffContact();
		}else if(selectType==2) {
			staff.getStaffDetails();
		}
		
		
		else if(selectType==3) {
			staff.addNewStaffMember();
		}
		
		
		else if (selectType==4) {
			
			grade.createGrade();
		}
		
else if (selectType==5) {
			
			gradeRate.createGradeRate();
		}
else if (selectType==6) {
	
	campaign.createCampaign();
}
		
else if (selectType==7) {
	
	campaign.getCampaignDetails();
}
		
		
else if (selectType==8) {
	
	staffgrade.createStaffGrade();
}
	
else if (selectType==9) {
	
	staffgrade.getStaffGrades();
}
		
		
	
	}
	
}
