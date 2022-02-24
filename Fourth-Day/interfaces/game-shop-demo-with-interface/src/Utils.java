
public class Utils {
	public static void RunCheckers(Checker[] checkers, String message) {
		for (Checker checker : checkers) {
			checker.check(message);
		}
	}
}
