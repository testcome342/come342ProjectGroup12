

import java.util.Scanner;


public class GradeRate {
public int gradeRate;
public String gradeStartDate,gradeFinishDate;

static GradeRate gradeRates =new GradeRate();

static Database gradeRatedb = new Database(1,2);


Scanner scanner=new Scanner(System.in);
public GradeRate() {
	
	
}

public GradeRate(int gradeRate,String gradeStartDate,String gradeFinishDate) {
	
	
	this.gradeRate= gradeRate;
    this.gradeStartDate= gradeStartDate;
	this.gradeFinishDate=gradeFinishDate;
	
	
}

public void setGradeRate(int gradeRate) {
	
	this.gradeRate = gradeRate;
	
}

public int getGradeRate() {
	
	return gradeRate;
	
}


public void setGradeStartDate(String gradeStartDate) {
	
	this.gradeStartDate=gradeStartDate;
	
}

public String getGradeStartDate() {
	
	
	return gradeStartDate;
	
}


public void setGradeFinishDate(String gradeFinishDate) {
	
	this.gradeFinishDate=gradeFinishDate;
	
}

public String getGradeFinishDate() {
	
	return gradeFinishDate;
}

public void createGradeRate() {
	
	
	System.out.println("Enter Grade Rate:  ");
	gradeRates.setGradeRate(scanner.nextInt());
	
	
	
	System.out.println("Enter Grade Start date:");
	gradeRates.setGradeStartDate(scanner.next());
	
	
	System.out.println("Enter Grade Finish Date: ");
	gradeRates.setGradeFinishDate(scanner.next());
	
	
	gradeRatedb.gradeRateList.add(new GradeRate(gradeRates.getGradeRate(),gradeRates.getGradeStartDate(),gradeRates.getGradeFinishDate()));
	
	System.out.println("New Grade rate is added !");
	
	
}

public void assignLatestGradeRate() {
	
	
	
}

}
