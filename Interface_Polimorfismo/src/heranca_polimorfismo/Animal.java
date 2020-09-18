	package heranca_polimorfismo;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	private String correr;
	
	
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}



	public Animal(String nome, int idade, String som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}



	public Animal(String nome, int idade, String som, String correr) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.correr = correr;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}



	public String getCorrer() {
		return correr;
	}



	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String correndo() {
		return "O "+getNome()+" está andando | Velocidade média: "+getCorrer() ;
	}
	//88
	
	
	//media 30km
	
}
