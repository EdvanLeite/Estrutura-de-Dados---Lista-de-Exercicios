package Entities;

public class PilhaFila  {
    
    public Fila fila;
    public Fila pilha;
    
    public PilhaFila() {
        this.fila = new Fila();
        this.pilha = new Fila();
    }
    
    public void push(int valor) {
        fila.push(valor);
        Fila aux = this.inverterFila(fila);
        pilha = aux;
    }
    
    public void pop() {
        if (pilha.inicio != null) {
            pilha.pop();
            fila.pop();
        } else {
            System.out.println("Pilha está vazia!");
        }
    }
    
    public void exibir() {
        Bloco aux = pilha.inicio;
        while (aux != null) {
            System.out.print(aux.valor + ", ");
            aux = aux.prox;
        }
        System.out.println();
    }
    
    public Fila inverterFila(Fila fila) {
        if (fila.inicio == null) {
            return null;
        }

        Bloco anterior = null;
        Bloco atual = fila.inicio;
        Bloco proximo;

        while (atual != null) {
            proximo = atual.prox;
            atual.prox = anterior;
            anterior = atual;
            atual = proximo;
        }

        Fila filaInvertida = new Fila();
        filaInvertida.inicio = anterior;

        return filaInvertida;
    }
}