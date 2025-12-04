package tn.enis.calcul;

public class MainCalcul {
	public static void main(String[] args) {
		CalculMetier cm = new CalculMetier();
		System.out.println(cm.somme(5, 10));
		System.out.println(cm.produit(5,10));
	}
}
