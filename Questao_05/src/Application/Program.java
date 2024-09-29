package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Fila;
import Entities.Pilha;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Pilha pilha = new Pilha();
		Fila fila = new Fila();
	
		
		
		for (int i=0 ; i<=10;i++) {
			pilha.push(random.nextInt(70));
		}

		pilha.exibir();
		
		
		fila = pilha.criarFila();
		
		System.out.println();
		fila.exibir();

	}

}
