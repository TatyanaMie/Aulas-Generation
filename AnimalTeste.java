package POOHeran�a;

public class AnimalTeste {

	public static void main(String[] args) {
		cachorro Cachorro1 = new cachorro ();
		cavalo Cavalo1 = new cavalo ();
		pregui�a Pregui�a1 = new pregui�a ();
		
		Cachorro1.setNome("Bilbo");
		Cachorro1.setIdade(2);
		Cachorro1.setSom("late");
		Cachorro1.correr();
		Cachorro1.emitirSom();
		
		System.out.println("O cachorro chama " + Cachorro1.getNome() + ", possui " + Cachorro1.getIdade() + " anos e ele " + Cachorro1.getSom() + ".");
		System.out.println("\n");
		
		Pregui�a1.setNome("Jujuba");
		Pregui�a1.setIdade(9);
		Pregui�a1.setSom("balida");
		Pregui�a1.subir();
		Pregui�a1.emitirSom();
		System.out.println("A pregui�a chama " + Pregui�a1.getNome() + ", possui " + Pregui�a1.getIdade() + " anos e ela " + Pregui�a1.getSom() + ".");
		System.out.println("\n");
		
		Cavalo1.correr();
		Cavalo1.setNome("Donna");
		Cavalo1.setIdade(5);
		Cavalo1.setSom("relincha");
		Cavalo1.emitirSom();
		System.out.println("O cavalo chama " + Cavalo1.getNome() + ", possui " + Cavalo1.getIdade() + " anos e ela " + Cavalo1.getSom() + ".");
		
	}

}
