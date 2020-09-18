import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		
		try {	
			System.out.println("Digite uma sequencia de nomes");
			String vetor [] = ler.nextLine().split(" "); //Slit onde ele encontrar o argumento entre parenteses ele pula
			
			System.out.print("Escolha a posição da lista que quer exibir: ");
			int posicao = ler.nextInt();
			System.out.println("\n"+vetor[posicao]);
			
			
				System.out.println("\n"+vetor[posicao]); 
				//vetor[posicao] = "Null";
		}
		catch( java.util.InputMismatchException erro) {
				System.out.println("VOCE DIGITOU A TECLA ERRADA - USE SOMENTE NÚMEROS");
			}
		catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("VOCÊ ESTOUROU O TAMANHO DO VETOR");
			System.out.println("Digite mais um nome ao vetor...");
			String vetor[] = ler.nextLine().split(" ");
		}
			
		
		
	}

}
