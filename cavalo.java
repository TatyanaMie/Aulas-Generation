package POOHeran�a;

public class cavalo extends Animal {
	private String ra�a;
	private String cor;
	
	public void correr() {
		System.out.println("O cavalo deve correr!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Emitir som de cavalo...");
	}
}
