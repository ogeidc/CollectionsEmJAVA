package exercicio3;

import java.util.ArrayList;

public class CollectionsJava {

	public static void main(String[] args) {
		Estoque produto1 = new Estoque("Celular", 1500, 25);
		
		ArrayList<Estoque> listaProdutos = new ArrayList <>();
		
		listaProdutos.add(produto1);
		System.out.println(listaProdutos);
		
		Estoque produto2 = new Estoque("Celular 2", 1500, 25);
		listaProdutos.add(produto2);
		listaProdutos.remove(produto2);
		System.out.println(listaProdutos);
		
		listaProdutos.set(0, new Estoque ("Celular 3", 1200, 25));
		System.out.println(listaProdutos);
		
		for (Estoque i: listaProdutos) {
			System.out.println(i);
		}
		

	}

}
