
public class GamerManager {
	
	private Checker[] checkers;
	
	public GamerManager(Checker[] checkers) {
		super();
		this.checkers = checkers;
	}

	public void add(Gamer gamer) {
		System.out.println("Gamer information added: " + gamer.getFirstName());
		Utils.RunCheckers(checkers, gamer.getFirstName());
	}
	
	public void update(Gamer gamer) {
		System.out.println("Gamer information updated: " + gamer.getFirstName());
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Gamer information deleted: " + gamer.getFirstName());
	}
}
