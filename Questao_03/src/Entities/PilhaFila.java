package Entities;

public class PilhaFila {

	private Fila fila1;
	private Fila fila2;

	public PilhaFila() {
		this.fila1 = new Fila();
		this.fila2 = new Fila();
	}

	public void push(int valor) {
		fila1.push(valor);
	}
	

	public void pop() {
		if (fila1.tamanho == 0) {
			System.out.println("A pilha está vazia.");
			return;
		}

		
		while (fila1.tamanho > 1) {
			fila2.push(fila1.inicio.valor); 
			fila1.pop();
		}

		
		fila1.pop();

		
		while (fila2.tamanho > 0) {
			fila1.push(fila2.inicio.valor);
			fila2.pop();
		}
	}

	
	
	public void exibir() {
		fila1.exibir();
	}

	public boolean estaVazia() {
		return fila1.tamanho == 0;
	}
}
