package loja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;



public class ControleEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<String> estoque = new ArrayList<>();

		estoque.add("Arroz");
		estoque.add("Feijão");
		estoque.add("Macarrão");
		estoque.add("Massa de Tomate");
		System.out.println("---Lista de Estoque---");
		for(String lista : estoque) {
			System.out.println(lista);
		}
		
		estoque.remove("Feijão");
		
		System.out.println("---Lista Atualizada---");
		
		List<String> estoque2 = Arrays.asList("Farofa", "Leite");
		estoque.addAll(estoque2);
		
		for(String lista : estoque)
		{
			System.out.println(lista);
			}
		
		
		}

}
