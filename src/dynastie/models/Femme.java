package dynastie.models;

public class Femme extends Personnage {
	private Homme mari;

	public Femme(String nom, String surnom) {
		super(nom, surnom);
	}

	
	

	/**
	 * Donne naissance à un enfant, à une certaine date. L'enfant fait partie des
	 * enfants de ses 2 parents et est intégré à la dynastie
	 * 
	 * @param enfant
	 * @param date
	 */
	public void enfanter(Personnage enfant, int date) {
		enfant.naitre(date);
		enfants.add(enfant);
		mari.getEnfants().add(enfant);
		enfant.setDynastie(dynastie);
	}

}
