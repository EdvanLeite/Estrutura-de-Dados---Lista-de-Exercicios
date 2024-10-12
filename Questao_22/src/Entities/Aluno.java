package Entities;

public class Aluno {
	
	public String name;
	public Integer matricula;
	public Aluno prox;
	
	public Double nota01;
	public Double nota02;
	public Double nota03;
	
	
	
	public Aluno(String name, Integer matricula, Double nota01, Double nota02, Double nota03) {
		super();
		this.name = name;
		this.matricula = matricula;
		this.nota01 = nota01;
		this.nota02 = nota02;
		this.nota03 = nota03;
	}


	public Aluno(String name, Integer matricula) {
		super();
		this.name = name;
		this.matricula = matricula;
		this.nota01 = 0.0;
		this.nota02 = 0.0;
		this.nota03 = 0.0;
	}
	
	public double media() {
		return (nota01*4 + nota02 *5 + nota03*6) / 15;
	}


	@Override
	public String toString() {
		return "Aluno name=" + name + ", matricula=" + matricula + " " + "Notas: " + String.format("%.2f",nota01 ) + "|"+ String.format("%.2f",nota02 ) + "|"+ String.format("%.2f",nota03 ) + ", Media : " + String.format("%.2f",this.media() );
	}
	
	

}
