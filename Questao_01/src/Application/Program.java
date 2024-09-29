package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Fila;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Fila fila = new Fila();

	
		
		
		for (int i=0 ; i<=10;i++) {
			fila.push(random.nextInt(70));
		}

		fila.exibir();
		
		
		System.out.println();
		int op =0;
		
		while (op != 1) {

			System.out.print("Remove number(0 - Yes || 1 - No)?");
			int opp = sc.nextInt();
			
			if (opp == 0) {
				
				fila.pop();
			}

			System.out.print("Enter(0) or leave(1): ");
			op = sc.nextInt();
		}
		
		fila.exibir();

	}

}
