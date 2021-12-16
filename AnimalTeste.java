package POOHerança;

public class AnimalTeste {

	public static void main(String[] args) {
		cachorro Cachorro1 = new cachorro ();
		cavalo Cavalo1 = new cavalo ();
		preguiça Preguiça1 = new preguiça ();
		
		Cachorro1.setNome("Bilbo");
		Cachorro1.setIdade(2);
		Cachorro1.setSom("late");
		Cachorro1.correr();
		Cachorro1.emitirSom();
		
		System.out.println("O cachorro chama " + Cachorro1.getNome() + ", possui " + Cachorro1.getIdade() + " anos e ele " + Cachorro1.getSom() + ".");
		System.out.println("\n");
		
		Preguiça1.setNome("Jujuba");
		Preguiça1.setIdade(9);
		Preguiça1.setSom("balida");
		Preguiça1.subir();
		Preguiça1.emitirSom();
		System.out.println("A preguiça chama " + Preguiça1.getNome() + ", possui " + Preguiça1.getIdade() + " anos e ela " + Preguiça1.getSom() + ".");
		System.out.println("\n");
		
		Cavalo1.correr();
		Cavalo1.setNome("Donna");
		Cavalo1.setIdade(5);
		Cavalo1.setSom("relincha");
		Cavalo1.emitirSom();
		System.out.println("O cavalo chama " + Cavalo1.getNome() + ", possui " + Cavalo1.getIdade() + " anos e ela " + Cavalo1.getSom() + ".");
		
	}

}
