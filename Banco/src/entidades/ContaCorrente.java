package entidades;

public class ContaCorrente extends ContaBancaria{
 

	private int talionario;
	
	public ContaCorrente(int numero, double saldo, int talionario) {
		super(numero, saldo);
		this.talionario = talionario;
	}

	public int getTalionario() {
		return talionario;
	}

	public void setTalionario(int talionario) {
		this.talionario = talionario;
	}
	
	public void talionario() {
		if(this.talionario <= 05) {
			talionario = this.talionario + 12;
			System.out.println("você ja tem mais um talão de cheques disponivel em sua conta.");
		}
		else {
			System.out.println(" voce ainda não possui novos talões disponíveis");
		}
	}
	
}
