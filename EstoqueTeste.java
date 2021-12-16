package POOHerança;

import java.util.ArrayList;

public class EstoqueTeste {

	public static void main(String[] args) {
		Estoque x1= new Estoque ("camisa", 20);
		Estoque x2 = new Estoque ("calça",30);
		
		ArrayList<Estoque>relatorio1 = new ArrayList<>(); 
		
		relatorio1.add(x2);
		relatorio1.add(x1);
		System.out.println(relatorio1);

	}

}
