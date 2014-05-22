package lebewesen;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Bogachan
 * 
 */
public abstract class Lebewesen {

	// Alter in Jahren
	private int alter;
	private String name;
	// Gewicht in Kilogramm
	private int gewicht;
	private String geschlecht;
	private String haarfarbe;
	private String koerperfarbe;
	// Eine Collection von allen Objekten
	private static ArrayList<Lebewesen> lebewesenListe = new ArrayList<Lebewesen>();
	// Maximal Anzahl an Lebewesen die erzeugt werden koennen.
	private final int MAX_ANZAHL_LEBEWESEN = 3;

	/**
	 * 
	 * @param neuName
	 * @param neuAlter
	 * @param neuGewicht
	 * @param neuGeschlecht
	 * @param neuHaarfarbe
	 * @param neuKoerperfarbe
	 */
	public Lebewesen(String neuName, int neuAlter, int neuGewicht,
			String neuGeschlecht, String neuHaarfarbe, String neuKoerperfarbe) {

		this.name = neuName;
		this.alter = neuAlter;
		this.gewicht = neuGewicht;
		this.geschlecht = neuGeschlecht;
		this.haarfarbe = neuHaarfarbe;
		this.koerperfarbe = neuKoerperfarbe;
		if (lebewesenListe.size() <= MAX_ANZAHL_LEBEWESEN) {
			lebewesenListe.add(this);
		} else {
			System.out
					.println("Die maximal Anzahl an Lebewesen wurde erreicht.");
		}
	}

	/**
	 * Listet alle Lebewesen und return Lebewesen.
	 * 
	 * @return lebewesen
	 * @return
	 * 
	 */
	public String auflisten() {
		String lebewesen = null;
		for (Lebewesen lebewesen1 : getLebewesenListe()) {
			lebewesen = lebewesen1.toString();
		}

		return lebewesen;
	}

	/**
	 * Die Methode return die Daten der Lebewesen.
	 */
	public String toString() {

		return String
				.format("Name: %s\nAlter: %s Jahre\nGewicht: %s Kg\nGeschlecht: %s\nHaarfarbe: %s\nKoerperfaarbe: %s\n",
						name, alter, gewicht, geschlecht, haarfarbe,
						koerperfarbe);
	}

	/**
	 * Fuegt ein Lebewesen in die Collection ein.
	 * 
	 * @param lebewesen
	 */
	public void erfasseLebewesen(Lebewesen lebewesen) {
		lebewesenListe.add(lebewesen);
	}

	/**
	 * @return the mAX_ANZAHL_LEBEWESEN
	 */
	protected int getMAX_ANZAHL_LEBEWESEN() {
		return MAX_ANZAHL_LEBEWESEN;
	}

	/**
	 * @return the alter
	 */
	protected int getAlter() {
		return alter;
	}

	/**
	 * @param alter
	 *            the alter to set
	 */
	protected void setAlter(int alter) {
		this.alter = alter;
	}

	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gewicht
	 */
	protected int getGewicht() {
		return gewicht;
	}

	/**
	 * @param gewicht
	 *            the gewicht to set
	 */
	protected void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	/**
	 * @return the geschlecht
	 */
	protected String getGeschlecht() {
		return geschlecht;
	}

	/**
	 * @param geschlecht
	 *            the geschlecht to set
	 */
	protected void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	/**
	 * @return the koerperfarbe
	 */
	protected String getKoerperfarbe() {
		return koerperfarbe;
	}

	/**
	 * @param koerperfarbe
	 *            the koerperfarbe to set
	 */
	protected void setKoerperfarbe(String koerperfarbe) {
		this.koerperfarbe = koerperfarbe;
	}

	/**
	 * @return the haarfarbe
	 */
	protected String getHaarfarbe() {
		return haarfarbe;
	}

	/**
	 * @param haarfarbe
	 *            the haarfarbe to set
	 */
	protected void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	/**
	 * @return the lebewesenListe
	 */
	protected static ArrayList<Lebewesen> getLebewesenListe() {
		return lebewesenListe;
	}

	/**
	 * @param lebewesenListe
	 *            the lebewesenListe to set
	 */
	protected static void setLebewesenListe(ArrayList<Lebewesen> lebewesenListe) {
		Lebewesen.lebewesenListe = lebewesenListe;
	}
}
