import java.util.Scanner;


public class MainTest {
	
	public static AddStaffContactUI staffUI = new AddStaffContactUI();
	
	public static void main(String[] args) {
		
		
		int num;
		int loopNo = 100;
		
	
		
		
		for(int i = 0 ; i<loopNo;i++) {
			
			
            Scanner scanner = new Scanner(System.in);
			
			System.out.println("Press 1 for Assign Staff Contact");
			System.out.println("Press 2 for Get Staff Details");
			System.out.println("Press 3 for Add a New Staff Member");
			System.out.println("Press 4 for create a new grade");
			System.out.println("press 5 for create a new grade rate");
			System.out.println("Press 6 for Create a new Campaign");
			System.out.println("Press 7 for Get Campaign Details");
			System.out.println("Press 8 for Assign Staff Grade");
			System.out.println("Press 9 for Get Staff Grade");
			System.out.println("Press 10 for Campain Budget");
			System.out.println("Press 11 for Campain Overheads");
			num=scanner.nextInt();
			
			if(num ==1)
			{
				System.out.println("-Assign Staff Contact-");
				System.out.println();
				staffUI.startUI(1);
				
				System.out.println();
			
				
			}
			
			else if(num==2)
				{
				
				System.out.println("-Staff Member Informations-");
				System.out.println();
				staffUI.startUI(2);
				System.out.println();
							
		}
			
			
			else if(num==3)
			{
			
			System.out.println("-Add a new Staff Member-");
			System.out.println();
			
			staffUI.startUI(3);
			System.out.println();
						
	}
			
			else if(num==4)
			{
			
			System.out.println("-Create a new grade-");
			System.out.println();
			
			staffUI.startUI(4);
			System.out.println();
						
	}	
			
			else if(num==5)
			{
			
			System.out.println("-Create a new grade rate -");
			System.out.println();
			
			staffUI.startUI(5);
			System.out.println();
						
	}
			
			

			else if(num==6)
			{
			
			System.out.println("-Create a new campaign -");
			System.out.println();
			
			staffUI.startUI(6);
			System.out.println();
						
	}
			
			
			else if(num==7)
			{
			
			System.out.println("-Get campaign details -");
			System.out.println();
			
			staffUI.startUI(7);
			System.out.println();
						
	}
			else if(num==8)
			{
			
			System.out.println("-Set Staff Grade-");
			System.out.println();
			
			staffUI.startUI(8);
			System.out.println();
						
	}
			
			else if(num==9)
			{
			
			System.out.println("-Get staff grade details -");
			System.out.println();
			
			staffUI.startUI(9);
			System.out.println();
						
	}
			else if(num==10)
			{
			
			System.out.println("-Campain Budget  -");
			System.out.println();
			
			staffUI.startUI(10);
			System.out.println();
						
	}
			else if(num==11)
			{
			
			System.out.println("-Campain Overheads  -");
			System.out.println();
			
			staffUI.startUI(11);
			System.out.println();	
		}
		
		
		
			
	}
	
	
	
}