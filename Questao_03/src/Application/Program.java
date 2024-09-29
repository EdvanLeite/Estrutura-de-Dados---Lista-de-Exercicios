package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Fila;
import Entities.PilhaFila;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		PilhaFila pilhaX = new PilhaFila();

	
		pilhaX.fila = new Fila();
		pilhaX.pilha = new Fila();

		
		for (int i=0 ; i<=10;i++) {
			pilhaX.fila.push(random.nextInt(70));
			
		
		}

		pilhaX.fila.exibir();
		
		System.out.println();
		Fila pilha = pilhaX.pilha1();
		
		pilha.exibir();
		

	}

}
