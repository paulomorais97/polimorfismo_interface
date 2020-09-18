package aplicacao;

import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Principal {
	public static void main(String[] args) {
		System.out.println("****************** BANCO GENERATION BRASIL ******************");
		ContaCorrente cc = new ContaCorrente(23332,200,4);
		ContaPoupanca poupa = new ContaPoupanca(33423,100,18,0.3,0.4);
		ContaEmpresa empresa = new ContaEmpresa(42932, 20, 40);
		ContaEspecial especial = new ContaEspecial(42323,3,10, 10);
		
		System.out.println("\n*****************CONTA CORRENTE******************");
		System.out.println("TALIONARIO: ");
		cc.talionario();
		System.out.println("SALDO CONTA CORRENTE: R$"+cc.getSaldo());
		cc.creditar(100);
		System.out.println("CREDITOU 100");
		System.out.println("SALDO CONTA CORRENTE: R$"+cc.getSaldo());
		cc.debitar(100);
		System.out.println("DEBITOU 100");
		System.out.println("SALDO CONTA CORRENTE: R$"+cc.getSaldo());
		cc.emiteExtrato();
		System.out.println("\n");
		
		System.out.println("*****************CONTA POUPANÇA******************");
		System.out.println("SALDO DA CONTA POUPANÇA: R$"+poupa.getSaldo());
		poupa.aniversarioMes();
		System.out.println("RENDIMENTO MENSAL");
		poupa.emiteExtrato();
		System.out.println("\n");
		
		System.out.println("*****************CONTA EMPRESA*****************");
		System.out.println("SALDO DA CONTA EMPRESA: R$"+empresa.getSaldo());
		empresa.saldoEmprestimo();
		empresa.emprestimoEmpresarial(40);
		empresa.emiteExtrato();
		
		System.out.println("\n*****************CONTA ESPECIAL*****************");
		System.out.println("SALDO DA CONTA ESPECIAL: R$"+empresa.getSaldo());
		especial.debitar(12.0);
		especial.calculaJuros();
		
		
	}
}
