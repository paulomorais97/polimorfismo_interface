package heranca_polimorfismo;

public class TesteAnimal {
	public static void main(String args[]) {
		Cachorro dog = new Cachorro("Brutus", 5, "Auau");
	
		Cavalo cavalo = new Cavalo("Pegasus", 8, "Hinn in in");
	
		Preguica preguica = new Preguica("Soneca", 3, "Aaaaaah");
		
		
		dog.setCorrer("30km");
		cavalo.setCorrer("80km");
		System.out.println("\nCachorro");
		System.out.println("Nome do animal: "+dog.getNome()+ " |Idade: "+dog.getIdade()+" |Som emitido pelo animal: "+dog.getSom());
		System.out.println(" "+dog.correndo());
		System.out.println("\nCavalo ");
		System.out.println("Nome do animal: "+cavalo.getNome()+" |Idade: "+cavalo.getIdade()+" |Som emitido pelo animal: "+cavalo.getSom());
		System.out.println(" "+cavalo.correndo());
		System.out.println("\nPreguiça");
		System.out.println("Nome do animal: "+preguica.getNome()+" |Idade: "+preguica.getIdade()+" | Som emitido pelo animal: "+preguica.getSom());
		System.out.println(" "+preguica.getSubirArvore());
	}
}
