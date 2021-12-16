package POOHerança;

public class cachorro extends Animal {
	private int patas;
	private String pedigree;
	
	public void correr() 
	{
		System.out.println("O cachorro deve correr !");
	}
	@Override
	public void emitirSom() {
		System.out.println("Emitir som de chachorro ...");
	}
	
	

}
