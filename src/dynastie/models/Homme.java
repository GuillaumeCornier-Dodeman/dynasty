package dynastie.models;

public class Homme extends Personnage {

	private Femme epouse;

	
	public Homme(String nom, String surnom) {
		super(nom, surnom);
	}

	/**
	 * Permet à l'homme d'épouser une femme. Fait rentrer la femme dans la dynastie
	 * (celle de l'homme)
	 * 
	 * @param femme Une instance de Femme comme epouse
	 */
	
	public void epouser(Femme femme) {
		this.epouse = femme;
		femme.setDynastie(dynastie);
	}

}
