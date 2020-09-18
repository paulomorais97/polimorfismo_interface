package entidades;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	private int mesAniversario;
	private double juros;
	private double corrMonetaria;
	


	public ContaPoupanca(int numero, double saldo, int mesAniversario, double juros, double corrMonetaria) {
		super(numero, saldo);
		this.mesAniversario = mesAniversario;
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
	}



	public int getMesAniversario() {
		return mesAniversario;
	}



	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	
	


	public double getJuros() {
		return juros;
	}



	public void setJuros(double juros) {
		this.juros = juros;
	}



	public double getCorrMonetaria() {
		return corrMonetaria;
	}



	public void setCorrMonetaria(double corrMonetaria) {
		this.corrMonetaria = corrMonetaria;
	}



	public void aniversarioMes() {
		
		Calendar hoje = Calendar.getInstance();
		
		if(mesAniversario == hoje.get(Calendar.DAY_OF_MONTH)) {
			double valor = 0;
			valor = super.getSaldo() * (this.juros+this.corrMonetaria);
			creditar(valor);
		}else {
			System.out.println("Hoje não é o dia do Rendimento Mensal");
		}
			
			
	}
}
