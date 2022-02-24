
public class SalesManager {
	
	public void addSale(Gamer gamer, Campaign campaign) {
		System.out.println("Satýþ gerçekleþtirildi: " + gamer.getFirstName() + " Kullanýlan Kampanya: " + campaign.getCampaignName());
	}
	
	public void updateSale(Gamer gamer, Campaign campaign) {
		System.out.println("Satýþ bilgisi güncellendi: " + gamer.getFirstName() + " Kullanýlan Kampanya: " + campaign.getCampaignName());
	}
	
	public void deleteSale(Gamer gamer, Campaign campaign) {
		System.out.println("Satýþ bilgisi silindi: " + gamer.getFirstName() + " Kullanýlan Kampanya: " + campaign.getCampaignName());
	}
}
