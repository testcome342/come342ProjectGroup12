
	import java.util.Scanner;

	public class Campaign {
	public String title;
	public String campaignStartDate;
	public String campaignFinishDate;
	public double estimatedCost;
	public double campaignOverheads;


	static Campaign kampanya = new Campaign();

	Scanner scanner = new Scanner(System.in);

	static Database dbkam=new Database("Campaign","kampanya");

	public Campaign() {
		//default
	}

	public Campaign(String title, String campaignStartDate , String campaignFinishDate, double estimatedCost,double campaignOverheads  ) {
		this.title = title;
		this.campaignStartDate = campaignStartDate;
		this.campaignFinishDate = campaignFinishDate;
		this.estimatedCost = estimatedCost;
		this.campaignOverheads = campaignOverheads;
	}
	public Campaign(String campaignStartDate , String campaignFinishDate, double estimatedCost,double campaignOverheads  ) {
		
		this.campaignStartDate = campaignStartDate;
		this.campaignFinishDate = campaignFinishDate;
		this.estimatedCost = estimatedCost;
		this.campaignOverheads = campaignOverheads;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(String campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public String getCampaignFinishDate() {
		return campaignFinishDate;
	}

	public void setCampaignFinishDate(String campaignFinishDate) {
		this.campaignFinishDate = campaignFinishDate;
	}

	public double getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public double getCampaignOverheads() {
		return campaignOverheads;
	}

	public void setCampaignOverheads(double campaignOverheads) {
		this.campaignOverheads = campaignOverheads;
	}
	public void createCampaign() {
		System.out.println("Campaign's Title : ");
		kampanya.setTitle(scanner.next());
		System.out.println("Campaign's Start Date : ");
		kampanya.setCampaignStartDate(scanner.next());
		System.out.println("Campaign's Finish Date : ");
		kampanya.setCampaignFinishDate(scanner.next());
		System.out.println("Campaign's Estimated Cost : ");
		kampanya.setEstimatedCost(scanner.nextDouble());
		System.out.println("Campaign's Overheads : ");
		kampanya.setCampaignOverheads(scanner.nextDouble());
		dbkam.campaignList.add(new Campaign(kampanya.getTitle(),kampanya.getCampaignStartDate(),kampanya.getCampaignFinishDate(),kampanya.getEstimatedCost(),kampanya.getCampaignOverheads()));
		System.out.println("New campaign is added");		
		
	}
	public void getCampaignDetails() {
		for(int i=0;i<dbkam.campaignList.size();i++) {
			System.out.println("Campain's Title " +dbkam.campaignList.get(i).getTitle());
			System.out.println("Campain's Start Date " +dbkam.campaignList.get(i).getCampaignStartDate());
			System.out.println("Campain's Finish Date " +dbkam.campaignList.get(i).getCampaignFinishDate());
			System.out.println("Campain's Estimated Cost " +dbkam.campaignList.get(i).getEstimatedCost());
			System.out.println("Campain's Overheads " +dbkam.campaignList.get(i).getCampaignOverheads());		
		}	
	}
	public void checkCampaignBudget() {
		for(int i=0;i<dbkam.campaignList.size();i++) {
			System.out.println("Campain's Title" +dbkam.campaignList.get(i).getTitle());
			System.out.println("Campain's Estimated Cost" +dbkam.campaignList.get(i).getEstimatedCost());
		}
	}
	public void getOverheads() {
		for(int i=0;i<dbkam.campaignList.size();i++) {
			System.out.println("Campain's Title" +dbkam.campaignList.get(i).getTitle());
			System.out.println("Campain's Overheads" +dbkam.campaignList.get(i).getCampaignOverheads());				
	}
	}
}
