 package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.FilaPrioridade;
import Entities.Prioridade;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		FilaPrioridade fila = new FilaPrioridade();
		
		
	
		
		
		for (int i=1 ; i<=8;i++) {
			String nivel = "one";
			int num = random.nextInt(99);
			
			if(num%2 == 0) {
				nivel = "two";
			}
			if(num%3 == 0) {
				nivel = "three";
			}
			
			
			fila.push(num,Prioridade.valueOf(nivel) );
			
		}
		
		
		fila.exibir();
		System.out.println();
		
		fila.pop();
		fila.exibir();
		
		
		
	
		
	
		

	}

}
