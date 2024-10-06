package Entities;

public class FilaPrioridade {
	public Bloco inicio;

	public int tamanho = 0;

	public void push(int valor, Prioridade nivel) {

		Bloco novo = new Bloco(valor, nivel);

		if (this.tamanho == 0) {

			this.inicio = novo;

		} else {

			Bloco aux = this.localizarUltimo();
			aux.prox = novo;
		}

		tamanho++;
	}

	
	public Bloco pop() {
	    Bloco aux = this.inicio;
	    Bloco anterior = null;

	    while (aux != null) {
	        if (aux.nivel == Prioridade.valueOf("three")) {
	            if (anterior == null) {
	                this.inicio = aux.prox;
	            } else {
	                anterior.prox = aux.prox;
	            }
	            return aux;
	        }
	        anterior = aux;
	        aux = aux.prox;
	    }

	    aux = this.inicio;
	    anterior = null;

	    while (aux != null) {
	        if (aux.nivel == Prioridade.valueOf("two")) {
	            if (anterior == null) {
	                this.inicio = aux.prox;
	            } else {
	                anterior.prox = aux.prox;
	            }
	            return aux;
	        }
	        anterior = aux;
	        aux = aux.prox;
	    }

	    if (this.inicio != null) {
	        Bloco removido = this.inicio;
	        this.inicio = this.inicio.prox;
	        return removido;
	    }

	    return null;
	}

	
	
	private Bloco localizarUltimo() {

		Bloco aux = inicio;

		while (aux.prox != null) {

			aux = aux.prox;
		}

		return aux;

	}

	public void exibir() {

		Bloco aux = inicio;

		if (this.tamanho == 0) {

			System.out.println("Lista Vazia.");

		} else {

			while (aux != null) {

				System.out.print(aux + ", ");
				aux = aux.prox;

			}
		}
	}

}
