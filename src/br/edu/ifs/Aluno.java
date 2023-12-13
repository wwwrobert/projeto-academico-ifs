package br.edu.ifs;

public class Aluno extends Pessoa{

    private double nota1;
    private double nota2;

    public Aluno(int cpf) {
        super(cpf);
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota2() {
        return this.nota2;
    }

    @Override
	public String toString() {
		return " Aluno" + super.toString() + "Nota 1 = " + nota1 + "\nNota 2 = " + nota2 + "\n";
	}
}
