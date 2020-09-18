import Abstract.AbstractPeople;
import Interface.FirstInterface;
import Interface.SecondInterface;

public class Pessoa extends AbstractPeople implements FirstInterface, SecondInterface {

	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, int idade, String rg) {
		super(nome, idade, rg);
	}

	@Override
	public int segundaInterface() {
		return 0;
	}

	@Override
	public void primeiraAssinatura() {
		
	}

}
