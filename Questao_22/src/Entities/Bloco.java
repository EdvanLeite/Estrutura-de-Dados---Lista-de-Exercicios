package Entities;

public class Bloco {
	
	public Aluno valor;
	public Bloco prox;
	
	
	public Bloco() {
	}
	
	public Bloco(Aluno valor) {
		this.valor = valor;
	}

	public Bloco(Aluno valor, Bloco prox) {
		this.valor = valor;
		this.prox = prox;
	}

	@Override
	public String toString() {
		return valor + "";
	}

	
	
	

}
