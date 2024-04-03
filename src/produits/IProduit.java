package produits;

public interface IProduit {

	void setUnite(String unite);

	String getNom();

	String description();

	String getUnite();

	double calculerPrix(int prix);

}