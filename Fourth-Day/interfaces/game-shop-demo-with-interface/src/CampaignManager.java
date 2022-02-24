
public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println("Campaign information added: " + campaign.getCampaignName());
	}
	
	public void update(Campaign campaign) {
		System.out.println("Campaign information updated: " + campaign.getCampaignName());
	}
	
	public void delete(Campaign campaign) {
		System.out.println("Campaign information deleted: " + campaign.getCampaignName());
	}
}
