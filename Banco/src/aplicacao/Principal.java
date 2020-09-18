package aplicacao;
import java.util.Scanner;
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
		
		Scanner leia = new Scanner(System.in);
		int decisao;
		
		System.out.println("DIGITE O TIPO DE CONTA");
		System.out.println("[1] CONTA CORRENTE");
		System.out.println("[2] CONTA POUPANÇA");
		System.out.println("[3] CONTA EMPRESARIAL");
		decisao=leia.nextInt();
		
		if(decisao==1) {
			
		System.out.println("\n*****************CONTA CORRENTE******************");
		System.out.println("TALIONARIO: ");
		cc.talionario();
		System.out.println("SALDO CONTA CORRENTE: "+cc.getSaldo());
		cc.creditar(100);
		System.out.println("CREDITOU 100");
		System.out.println("SALDO CONTA CORRENTE: "+cc.getSaldo());
		cc.debitar(100);
		System.out.println("DEBITOU 100");
		System.out.println("SALDO CONTA CORRENTE: "+cc.getSaldo());
		cc.emiteExtrato();
		System.out.println("\n");
		System.out.println("\n*****************CONTA ESPECIAL*****************");
		System.out.println("SALDO DA CONTA ESPECIAL: "+empresa.getSaldo());
		especial.debitar(12.0);
		especial.calculaJuros();
		}
		
		if(decisao==2) {
		System.out.println("*****************CONTA POUPANÇA******************");
		System.out.println("SALDO DA CONTA POUPANÇA: "+poupa.getSaldo());
		poupa.aniversarioMes();
		System.out.println("RENDIMENTO MENSAL");
		poupa.emiteExtrato();
		System.out.println("\n");
		}
		
		if(decisao==3) {
		System.out.println("*****************CONTA EMPRESA*****************");
		System.out.println("SALDO DA CONTA EMPRESA: "+empresa.getSaldo());
		empresa.saldoEmprestimo();
		empresa.emprestimoEmpresarial(40);
		empresa.emiteExtrato();
		}
		
		
	}
}