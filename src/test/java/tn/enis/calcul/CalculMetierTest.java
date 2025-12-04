package tn.enis.calcul;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculMetierTest {

	@Test
	void testSomme() {
		CalculMetier metier = new CalculMetier();
		assertTrue(metier.somme(9, 10)==19, "La somme est fausse");
	}
	@Test
	void testProduit() {
		CalculMetier metier = new CalculMetier();
		assertTrue(metier.produit(9, 10)==90, "Le produit est faux");
	}

}
