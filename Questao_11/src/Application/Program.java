 package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Lista;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Lista list = new Lista();
	
		
		
		for (int i=1 ; i<=5;i++) {
			list.addElemento(random.nextInt(99));
		}
		
		list.exibirLista();
		System.out.println();
		
		list.addElemento(655, 8);
		

		
		list.exibirLista();
		System.out.println();
		System.out.println(list.tamanho());
		
	System.out.println(list.localizarBloco(4).valor);
		

	}

}
