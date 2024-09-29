package Entities;

public class Pilha {
	
	private Bloco inicio;
	public int tamanho = 0;

	

	public void push(int valor) {
		
	    Bloco novo = new Bloco(valor);
	    novo.prox = inicio;  
	    inicio = novo;  
	    
	    tamanho++;
	}
	
	
	
	public void pop() {
		
		if(this.tamanho >= 1) {
		inicio = inicio.prox;
		tamanho --;
		
		}else {
			System.out.println("Lista vazia.");
		}
		
	
	}
	
	
	
	private Bloco localizarUltimo() {
		
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
	
	

	public int topo() {
		
		return inicio.valor;
		
	}

	
	public Fila criarFila() {
		Fila fila = new Fila();
		Bloco aux = inicio;
		
		while(aux != null) {
			fila.push(aux.valor);
			aux = aux.prox;
			
		}
		
		
		
		return fila;
		
	} 
	
}

