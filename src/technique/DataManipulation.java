package technique;

import model.Produit;

public class DataManipulation implements DataManipulationInterface{

	public DataManipulation() {
	}

	@Override
	public Produit getPreparedProduct(Produit produit) {
		
		double newPrice = produit.getPrix();
		
		if (produit.getStock()<50) {
			
			newPrice = produit.getPrix() * 1.2;
			
		}
		
		return new Produit(produit.getNom(), newPrice, produit.getStock());
	}

}
