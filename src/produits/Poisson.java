package produits;

public class Poisson extends Produit {
	private String date; 
	
	public Poisson(String date) {
		super("poisson");
		this.date = date;
	}

	@Override
	public String description() {
		return getNom()+ " pêchés " + date +".";
	}
	
}
