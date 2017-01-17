package managers;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import model.Produit;
import technique.DataManipulation;
import technique.DataManipulationInterface;

public class ManagerProduits {

	private ArrayList<Produit> produits;
	private DataManipulationInterface dataManip;

	public ManagerProduits() {

		dataManip = new DataManipulation();
		Produit produit;
		int prix, randStock;
		produits = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			prix = 100;
			randStock = ThreadLocalRandom.current().nextInt(1, 200 + 1);
			produit = new Produit(""+i, prix, randStock);
			produits.add(produit);
		}
	}

	public boolean getProductsList () {

		System.out.println("Nom     Prix     Stock");
		for (Produit produit:produits) {
			System.out.println(
					dataManip.getPreparedProduct(produit).getNom()+
					"       "+
					dataManip.getPreparedProduct(produit).getPrix()+
					"       "+
					dataManip.getPreparedProduct(produit).getStock()
					);
		}
		return true;
	}
}
