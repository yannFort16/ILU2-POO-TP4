package produits;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier");
		this.poids =poids;
		this.chasseur =chasseur;	
	}

	@Override
	public String description() {
		return getNom() + " de " + poids + getUnite()+
				"  chassé par " + chasseur.getNom()+".";
	}

}
