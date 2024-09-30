package Entities;

public class Fila {
	
	public Bloco inicio = new Bloco();
	
	public int tamanho = 0;
	
	
	

	public void push (int valor) {
		
		Bloco novo = new Bloco(valor);
		
		if(this.tamanho == 0) {
			
			this.inicio = novo;
			
		}else {
			
			Bloco aux  = this.localizarUltimo();
			aux.prox = novo;
		}
		
		tamanho ++;
	}
	
	
	
	public void pop() {
		
		if(this.tamanho >= 1) {
		inicio = inicio.prox;
		tamanho --;
		
		}else {
			System.out.println("Lista vazia.");
		}
		
	
	}
	
	
	
	protected Bloco localizarUltimo() {
		
		Bloco aux = inicio;
		
		 while(aux.prox != null) {
			 
			 aux = aux.prox;
		 }
		 
		return aux;
		
	}
	
	

	public void exibir() {
		
		Bloco aux = inicio;
		
		if (this.tamanho == 0) {
			
			System.out.println("Lista Vazia.");
			
		}else {
			
			while(aux != null) {
				
				System.out.print(aux + ", ");
				aux = aux.prox;
				
			}
		}
	}
	
	

}
