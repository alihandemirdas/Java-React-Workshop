
public class Campaign {
	
	public Campaign() {
		
	}
	
	public Campaign(String campaignName, int campaignTime) {
		super();
		this.campaignName = campaignName;
		this.campaignTime = campaignTime;
	}
	
	String campaignName;
	int campaignTime;
	
	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignTime() {
		return campaignTime;
	}

	public void setCampaignTime(int campaignTime) {
		this.campaignTime = campaignTime;
	}
}
