package Entities;

public class Turma {
	
	public Lista alunos;
	
	public Disciplina disciplina;
	
	public Integer codigo;

	public Turma(Lista alunos, Disciplina disciplina, Integer codigo) {
		this.alunos = alunos;
		this.disciplina = disciplina;
		this.codigo = codigo;
	}
	
	

}
