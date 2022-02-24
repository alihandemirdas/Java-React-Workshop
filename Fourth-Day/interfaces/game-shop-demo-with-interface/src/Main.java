
public class Main {

	public static void main(String[] args) {
		Checker[] checkers = {new EdevletChecker()};
		GamerManager gamerManager = new GamerManager(checkers);
		Gamer alihan = new Gamer("12345","Alihan","Demirdas","2002");
		gamerManager.add(alihan);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign("Yeni",10);
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		salesManager.addSale(alihan, campaign);
	}

}
