 package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.ListaDupla;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		ListaDupla list = new ListaDupla();
	
		
		
		for (int i=1 ; i<=7;i++) {
			list.addElemento(random.nextInt(99));
		}
		
		list.exibirLista();
		System.out.println();
		
		list.addElemento(999, 4);
		list.addElemento(999);
		list.addElemento(999, true);
		
		
		list.exibirLista();
		System.out.println();
		list.exibirListaInvertida();
		
		
		list.removerElementoFim();
		list.removerElementoInicio();
		
	
		
		System.out.println();
		list.exibirLista();
		System.out.println();
		list.exibirListaInvertida();
		

	}

}
