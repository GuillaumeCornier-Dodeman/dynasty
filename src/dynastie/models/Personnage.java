package dynastie.models;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
	protected Dynastie dynastie;
	protected List<Personnage> enfants;
	protected Homme pere;
	protected Femme mere;

	private String nom;
	private String surnom;
	private int naissance;
	private int deces;

	
	public Personnage(String nom, String surnom) {
		this.nom = nom;
		this.surnom = surnom;
		this.enfants = new ArrayList<Personnage>();
	}

	
	public void naitre(int annee) {
		this.naissance = annee;
	}

	public void mourir(int annee) {
		this.deces = annee;
	}

	public Dynastie getDynastie() {
		return dynastie;
	}

	public void setDynastie(Dynastie dynastie) {
		this.dynastie = dynastie;
	}

	public List<Personnage> getEnfants() {
		return enfants;
	}

}
