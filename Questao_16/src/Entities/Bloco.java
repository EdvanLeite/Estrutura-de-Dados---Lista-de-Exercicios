package Entities;

public class Bloco {
	
	public int valor;
	public Bloco prox;
	public Prioridade nivel;
	
	
	public Bloco() {
	}
	
	public Bloco(int valor, Prioridade nivel) {
		this.valor = valor;
	}

	public Bloco(int valor, Bloco prox) {
		this.valor = valor;
		this.prox = prox;
	}

	@Override
	public String toString() {
		return valor + "";
	}

	
	
	

}
