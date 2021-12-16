package POOHerança;

public class preguiça extends Animal {
	private String pelo;
	private String especie;
	
	public void subir() {
		System.out.println("A preguiça deve subir na árvore!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Emitir som de preguiça...");
	}

}
