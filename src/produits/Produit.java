package produits;

public abstract class Produit implements IProduit {
	private String nom;
	private String unite = "kg";
	
	@Override
	public void setUnite(String unite) {
		this.unite = unite;
	}

	public Produit(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public abstract String description();

	@Override
	public String getUnite() {
		return unite;
	}
	
	@Override
	public double calculerPrix(int prix) {
		return prix;
	}

	
}
