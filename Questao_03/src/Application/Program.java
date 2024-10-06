package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Fila;
import Entities.PilhaFila;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        PilhaFila pilha = new PilhaFila();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        pilha.exibir();  

        pilha.pop();  
        pilha.exibir();  

        pilha.pop();  
        pilha.exibir();  

        pilha.pop();  
        pilha.exibir();  

       

        sc.close();
    }
}