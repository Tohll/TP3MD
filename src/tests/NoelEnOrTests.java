package tests;

import org.junit.Assert;
import org.junit.Test;

import managers.ManagerProduits;

public class NoelEnOrTests {

	@Test
	public void testNoel() {
		
		//classe de test artificielle (getProductList renvoi true du moment qu'elle marche!)
		ManagerProduits manager = new ManagerProduits();
		Assert.assertTrue(manager.getProductsList());
		
	}

}
