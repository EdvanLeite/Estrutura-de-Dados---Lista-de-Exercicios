package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.FilaPilha;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		 FilaPilha fila = new FilaPilha();
	        fila.inserir(1);
	        fila.inserir(2);
	        fila.inserir(3);

	        fila.exibir();  
	        System.out.println();

	        fila.remover(); 
	        fila.exibir();  
	        System.out.println();

	        fila.remover(); 
	        fila.exibir();  
	        System.out.println();

	        fila.remover();  
	        fila.exibir();  
	        System.out.println();
	    }

}
