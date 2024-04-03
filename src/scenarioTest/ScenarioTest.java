package scenarioTest;

import personnages.Gaulois;
import produits.*;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void afficherMarcher(IEtal[] marche) {
		for (int i=0; i<marche.length; i++) {
			marche[i].etatEtal();
		}
	}
	
	public static void main(String[] args) {
	
		//IEtal[] marche = new IEtal[3];
		//IEtal<Sanglier>[] marche = new IEtal[3];
		
		/*IEtal<Sanglier> etalSanglier = new Etal<>();
		IEtal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;*/
		//marche[1] = etalPoisson;
		
		/*IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
		etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);*/
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		IEtal[] marche = new IEtal[3];
		Etal<Sanglier> etalSanglier1 = new Etal<>();
		Etal<Sanglier> etalSanglier2 = new Etal<>();	
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier1;
		marche[1] = etalSanglier2;
		marche[2] = etalPoisson;
		
		((Etal<Sanglier>) marche[0]).installerVendeur(obelix, sangliersObelix, 8);
		((Etal<Sanglier>) marche[1]).installerVendeur(asterix, sangliersAsterix, 10);
		((Etal<Poisson>) marche[2]).installerVendeur(ordralfabetix, poissons, 7);
		
		afficherMarcher(marche);
		
		int nbSanglierChercher =3;
		for(int i=0; i<marche.length; i++) {
			int quantiteAchete = marche[i].contientProduit("Sanglier", nbSanglierChercher);
			if (quantiteAchete>0) {
				marche[i].acheterProduit(quantiteAchete);
				nbSanglierChercher -=quantiteAchete;
			}
		}
		
		afficherMarcher(marche);
	}
	
}
