package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Lista;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Lista list = new Lista();
	
		
		
		for (int i=0 ; i<=10;i++) {
			list.addElemento(random.nextInt(99));
		}
		
		list.exibirLista();
		
		Lista listInvertida = list.inverterLista();
		
		System.out.println();
		
		listInvertida.exibirLista();

		

	}

}
