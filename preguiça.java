package POOHeran�a;

public class pregui�a extends Animal {
	private String pelo;
	private String especie;
	
	public void subir() {
		System.out.println("A pregui�a deve subir na �rvore!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Emitir som de pregui�a...");
	}

}
