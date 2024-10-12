 package Application;

import java.util.Random;
import java.util.Scanner;

import Entities.Aluno;
import Entities.Disciplina;
import Entities.Lista;
import Entities.Turma;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		Lista list = new Lista();
		Disciplina disciplina = new Disciplina("POO e Estrtura de dados");
		Integer codigo = 123456789;
		
		Turma turma = new Turma(list, disciplina, codigo); 
		
		String name;
		Integer matricula;
	
		for (int i=1 ; i<=8;i++) {
			matricula = (10000 +i);
			name = "nameteste"+ String.valueOf(i);
			Aluno aluno = new Aluno(name,matricula,random.nextDouble(10.0),random.nextDouble(10.0),random.nextDouble(10.0));
			turma.alunos.addElemento(aluno);
			
		}
		

		turma.alunos.exibirLista();
		System.out.println();
	

	}

}
