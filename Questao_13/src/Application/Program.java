 package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Lista;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Lista list = new Lista();
		Lista list2 = new Lista();
		Lista list3;
	
		
		
		for (int i=1 ; i<=8;i++) {
			list.addElemento(random.nextInt(99));
		}
		
		for (int i=1 ; i<=5;i++) {
			list2.addElemento(random.nextInt(99));
		}
		
		
		
		
		list.exibirLista();
		System.out.println();
		list2.exibirLista();
		System.out.println();
		
		list3 = list.concatenarListas(list, list2);
		
		list3.exibirLista();
		System.out.println();
	
		
	
		

	}

}
