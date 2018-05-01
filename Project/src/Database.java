
import java.util.ArrayList;

public class Database {
	
	
public ArrayList<StaffMember> staffContactList=new ArrayList<StaffMember>();


public ArrayList<StaffMember> staffList=new ArrayList<StaffMember>();

public ArrayList<Grade> gradeNameList=new ArrayList<Grade>();

public ArrayList<GradeRate> gradeRateList=new ArrayList<GradeRate>();
public ArrayList<Campaign> campaignList=new ArrayList<Campaign>();

public ArrayList<StaffGrade> staffgradeList =new ArrayList<StaffGrade>();

	
	public  Database(String staffmember) {
		
		staffContactList.add(new StaffMember(10,"merve","19/05/2018","merveaakir@gmail.com"));
		staffContactList.add(new StaffMember(13,"cagla","20/05/2018","cagladogancay@gmail.com"));
	
	}
	
	
	

	public  Database() {  //yeni eklenen stafflar
		
		staffList.add(new StaffMember(201435010,"19/05/2018",1234));
		staffList.add(new StaffMember(201435013,"20/05/2018",3124536));
	
	}
	
	


	public  Database(int grades) {  //grade names
		
		gradeNameList.add(new Grade("Success Grade"));
		gradeNameList.add(new Grade("Communication Grade"));
	
	}
	

	public  Database(int graderate,int graderates) {  //grade rates
		
		gradeRateList.add(new GradeRate(20,"10/10/2018","10/01/2019"));
		gradeRateList.add(new GradeRate(40,"10/10/2020","10/01/2021"));
	
	}

	public  Database(String graderate,String graderates) {  //campaign 
		
		campaignList.add(new Campaign("abc","10/10/2018","10/01/2019",2.1,2.1));
		campaignList.add(new Campaign("abc","10/10/2018","10/01/2019",2.1,2.1));
	
	}
	

	public  Database(String staffgrade,int staffgradee) {  //campaign 
		
		staffgradeList.add(new StaffGrade(1435010,12));
		staffgradeList.add(new StaffGrade(1435013,12));
	
	}
	
	
	public ArrayList<StaffMember> getList() {
	       return staffList;
	   }
	
	
	
	
}
