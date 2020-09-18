package heranca_polimorfismo;

public class Preguica extends Animal{
	private String subirArvore;
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);	
	}

	public Preguica(String nome, int idade, String som, String subirArvore) {
		super(nome, idade, som);
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		
			
		
		return "Subindo na ávore...";
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
		
	@Override
	public String getSom() {
	return super.getSom();
	}
}
