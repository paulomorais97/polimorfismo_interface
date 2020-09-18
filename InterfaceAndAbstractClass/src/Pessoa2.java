import Abstract.AbstractPeople;
import Interface.FirstInterface;
import Interface.SecondInterface;

public class Pessoa2 extends AbstractPeople implements FirstInterface, SecondInterface {

	
	public Pessoa2() {
		super();
	}

	public Pessoa2(String nome, int idade, String rg) {
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
