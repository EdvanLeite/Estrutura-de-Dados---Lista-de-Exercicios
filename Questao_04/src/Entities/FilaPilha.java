package Entities;

public class FilaPilha {

    private Pilha pilha1;  
    private Pilha pilha2;  

    public FilaPilha() {
        this.pilha1 = new Pilha();
        this.pilha2 = new Pilha();
    }

    public void inserir(int valor) {
        pilha1.push(valor);  
    }
    

    public void remover() {
        if (pilha2.tamanho == 0) {
            while (pilha1.tamanho > 0) {
                pilha2.push(pilha1.topo());
                pilha1.pop();
            }
        }

        if (pilha2.tamanho > 0) {
            pilha2.pop();
        } else {
            System.out.println("A fila está vazia.");
        }
    }
    
    

    public void exibir() {
    	if(pilha1.tamanho>0) {
    		pilha1.exibir();
    	}if(pilha2.tamanho >0) {
    		pilha2.exibir();
    	}
      
    }
}