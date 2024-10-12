package Entities;

public class Player {

	
	public Lista hand =  new Lista();
	
	public int somaCards() {
		int soma=0;
		Bloco aux = hand.inicio;
		while(aux!= null) {
			soma = soma + aux.valor;
			aux = aux.prox;
		}
		return soma;
	}
}
