package heranca_polimorfismo;

public class Cavalo extends Animal{
	//private String correr;

	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}

	public Cavalo(String nome, int idade, String som, String correr) {
		super(nome, idade, som, correr);
		
	}
	
	@Override
	public String correndo() {
		return super.getCorrer();
	}

	

	@Override
	public String getSom() {
	return super.getSom();
	}
	
	
}
