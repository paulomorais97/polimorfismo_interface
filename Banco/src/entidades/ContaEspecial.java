package entidades;



public class ContaEspecial extends ContaCorrente {
	
	private double limite;
	
	public ContaEspecial(int numero, double saldo, int talionario, double limite) {
		super(numero, saldo, talionario);
		this.limite = limite;
	}



	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}

    public double debitar(double valor)
    {
    	double saldoComLimite=getSaldo()+limite;
    	if((saldoComLimite-valor)>=-0)
    	{
    		
    		limite = getSaldo()-valor;
    		System.out.println("SALDO DISPONIVEL: R$"+limite);
    		return limite;
    	}
    	else
    	{
    		System.out.println("Você ultrapassou o seu limite!");
    		return limite;
    	}
 
    }

	public void calculaJuros()
	{
		
		if(this.getLimite()<0)
		{
			this.limite+=limite*0.16;
			System.out.println("SALDO ATUAL COM A ADESÃO DOS JUROS: R$"+this.limite);
		}
		
	
	}


}
