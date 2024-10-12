 package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Cheap;
import Entities.Lista;
import Entities.Player;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Cheap cheap = new Cheap();
		
		
		cheap.addCards(100);
		
		System.out.println("==Deck Completo==");
		cheap.cheap.exibirLista();
		
		System.out.println();
		
		System.out.println("Quantos players vão jogar?");
		int aux = sc.nextInt();
		
		Player[] players = new Player[aux];
		
		for(int i =0;i<aux;i++) {
			players[i] = new Player();
			for(int j =0;j<5;j++) {
				
				players[i].hand.addElemento(cheap.cheap.localizarBloco(random.nextInt(100)).valor );
			}
			
		}
		
		
		Lista somas = new Lista();
		System.out.println("Mão dos players:");
		for(int i =0;i<aux;i++) {
			System.out.println("Jogador " + (i+1) + " :");
			players[i].hand.exibirLista();
			System.out.println();
			somas.addElemento(players[i].somaCards());
			System.out.println("Soma = " + players[i].somaCards());
			System.out.println();
			
		}
		
		System.out.println("Soma do jogador Vencedor: "+ somas.localizarMaiorValor());
		
		
	

	}

}
