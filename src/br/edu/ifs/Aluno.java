package br.edu.ifs;

public class Aluno extends Pessoa {

    private double nota1;
    private double nota2;

    public Aluno(String cpf) {
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

    public double calcularMedia() {
        double media = (this.nota1 + this.nota2) / 2;
        return media;
    }

    @Override
    public double calcularRemuneracao() {
        if (calcularMedia() >= 7)
            return 400;
        else
            return 0;
    }

    @Override
    public String toString() {
        return " Aluno" + super.toString() + "Nota 1 = " + nota1 + "\nNota 2 = " + nota2 + "\nRemuneração = " + calcularRemuneracao() + "\n";
    }
}
