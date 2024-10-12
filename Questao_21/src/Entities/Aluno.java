package Entities;

public class Aluno {
	
	public String name;
	public Integer matricula;
	public Aluno prox;
	
	
	public Aluno(String name, Integer matricula) {
		super();
		this.name = name;
		this.matricula = matricula;
	}


	@Override
	public String toString() {
		return "Aluno [name=" + name + ", matricula=" + matricula + "]";
	}
	
	

}
