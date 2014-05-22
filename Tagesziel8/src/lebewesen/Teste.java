package lebewesen;

/**
 * @author Bogachan
 * 
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mensch mensch = new Mensch("Bogachan Oenal", 22, 80, "maennlich",
				"Dunkelbraun", "Hell", 1.85, "Deutschland");

		Mensch karl = new Mensch("Karl", 12, 50, "maennlich", "Braun",
				"dunkel", 1.50, "Türkei");

		System.out.println(karl.toString());
		System.out.println(mensch.toString());

		// Katze eKurzhaar = new Katze("Leo", 2, 5, "maennlich", "Braun",
		// "Rosa",
		// "Europaäische Kurzhaar", "Mittelgroß");
		//
		// System.out.println(eKurzhaar.auflisten());
		//
		// Katze eKurzhaar2 = new Katze("Leo", 2, 5, "maennlich", "Braun",
		// "Rosa",
		// "Europaäische Kurzhaar", "Mittelgroß");

	}
}
