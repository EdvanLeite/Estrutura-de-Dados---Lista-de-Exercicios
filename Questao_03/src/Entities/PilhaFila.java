package Entities;

public class PilhaFila  {
	
	public Fila fila;
	public Fila pilha;
	
	public Fila pilha() {
		
		Bloco aux = fila.inicio;
		pilha.inicio = fila.localizarUltimo();
		Bloco aux2 = pilha.inicio;
		
		boolean test = true;
		
		while(test) {
			while(aux.prox != aux2) {
				aux = aux.prox;
			}
			aux2.prox = aux; 
			aux = fila.inicio;
			aux2 = aux2.prox;
			
			if(fila.inicio.valor == pilha.localizarUltimo().valor) {
				test = false;
			}
			
		}
		
		return pilha;
	}
	
	
	
	 public Fila pilha1() {
	        
	       
	        Bloco aux = fila.inicio; 
	        pilha.inicio = fila.localizarUltimo(); 

	        Bloco aux2 = pilha.inicio;
	        boolean test = true;

	        while (test) {
	            while (aux.prox != aux2) {
	                aux = aux.prox; 
	            }
	            aux2.prox = aux; 
	            aux = fila.inicio; // Reinicia aux para o início da fila
	            aux2 = aux2.prox; // Move aux2 para o próximo

	            if (fila.inicio.valor == pilha.localizarUltimo().valor) {
	                test = false; // Para o loop se os valores forem iguais
	            }
	        }
	        
	        return pilha; // Retorna a pilha
	    }
	

}
