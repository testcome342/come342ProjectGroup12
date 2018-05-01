
import java.util.Scanner;

public class Grade {
	
	static Grade grades=new Grade();

	public String gradeName;
	
	Scanner scanner=new Scanner(System.in);
	
	static Database gradeNamedb = new Database(2);
	
	public Grade() {
		
	}
	
	public Grade(String gradeName) {
		
		this.gradeName=gradeName;
		
	}
	
	
	public void setGradeName(String gradeName) {
		this.gradeName=gradeName;
	
	}
	
	public String getGradeName() {
		
		
		
		return gradeName;
		
		
	}
	
	public void createGrade() {
		System.out.println("Enter a new grade name:  ");
		grades.setGradeName(scanner.nextLine());
		
		gradeNamedb.gradeNameList.add(new Grade(grades.getGradeName()));
		
		System.out.println("New grade is added");
		
	}
	
	public void assignGradeRate() {
		
		
	}
}
