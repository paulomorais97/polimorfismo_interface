package entidades;

public class ContaEmpresa extends ContaBancaria{

	private double limiteEmpresa;
	
	
	public ContaEmpresa(int numero, double saldo, double limiteEmpresa) {
		super(numero, saldo);
		this.limiteEmpresa = limiteEmpresa;
		
	}
	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}
	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}
	
	public void saldoEmprestimo() {
		System.out.println("Emprestimo pré aprovado: R$"+(this.limiteEmpresa*2));
	}
	
	public void emprestimoEmpresarial(double emprestimo) {
		
		if(getSaldo() <= (this.limiteEmpresa/2) &&  emprestimo <= (this.limiteEmpresa*2)) {
			
			creditar(emprestimo);
			System.out.println("Emprestimo liberado: R$"+emprestimo);
		}
		else {
			System.out.println("Emprestimo negado.");
		}
		
		
	}

}
