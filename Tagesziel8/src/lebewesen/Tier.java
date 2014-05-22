package lebewesen;

/**
 * @author Bogachan
 * 
 */
public class Tier extends Lebewesen {

	private String rasse;
	// Eine ungefaehre groesse des Tieres
	private String tiergroesse;

	/**
	 * @param neuName
	 * @param neuAlter
	 * @param neuGewicht
	 * @param neuGeschlecht
	 * @param neuHaarfarbe
	 * @param neuKoerperfarbe
	 * @param neuRasse
	 * @param neuTiergroesse
	 */
	public Tier(String neuName, int neuAlter, int neuGewicht,
			String neuGeschlecht, String neuHaarfarbe, String neuKoerperfarbe,
			String neuRasse, String neuTiergroesse) {

		super(neuName, neuAlter, neuGewicht, neuGeschlecht, neuHaarfarbe,
				neuKoerperfarbe);
		this.rasse = neuRasse;
		this.tiergroesse = neuTiergroesse;
	}

	/**
	 * Die Methode gibt die Daten des Tieres am Monitor aus.
	 */
	public String toString() {

		return super.toString()
				+ String.format("Rasse: %s\nTiergroesse: %s\n", rasse,
						tiergroesse);
	}

	/**
	 * @return the rasse
	 */
	public String getRasse() {
		return rasse;
	}

	/**
	 * @param rasse
	 *            the rasse to set
	 */
	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	/**
	 * @return the tierGroesse
	 */
	public String getTierGroesse() {
		return tiergroesse;
	}

	/**
	 * @param tierGroesse
	 *            the tierGroesse to set
	 */
	public void setTierGroesse(String tierGroesse) {
		this.tiergroesse = tierGroesse;
	}

}
