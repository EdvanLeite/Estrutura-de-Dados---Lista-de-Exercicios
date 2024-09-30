package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Fila;
import Entities.PilhaFila;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        PilhaFila pilhaX = new PilhaFila();
        
        pilhaX.pilha = new Fila();

        for (int i = 0; i <= 5; i++) {
            pilhaX.push(random.nextInt(70));
        }

        pilhaX.pilha.exibir();

        pilhaX.push(10);
        System.out.println();
        pilhaX.pilha.exibir();
        
        pilhaX.fila.exibir();

        sc.close();
    }
}