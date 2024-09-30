package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Pilha;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Pilha pilha = new Pilha();

	
		
		
		for (int i=0 ; i<=10;i++) {
			pilha.push(random.nextInt(70));
		}

		pilha.exibir();
		
		
		System.out.println();
		System.out.println("Insira dois novos numeros:");
		
		int aux = sc.nextInt();
		pilha.push(aux);
		aux = sc.nextInt();
		pilha.push(aux);
		
		
		pilha.exibir();
		
		
		System.out.println();
		int op =0;
		
		while (op != 1) {

			System.out.print("Remove number(0 - Yes || 1 - No)?");
			int opp = sc.nextInt();
			
			if (opp == 0) {
				
				pilha.pop();
			}

			System.out.print("Enter(0) or leave(1): ");
			op = sc.nextInt();
		}
		
		pilha.exibir();
		
		
		System.out.println("Topo -> "+ pilha.topo());

	}

}
