package br.edu.ifs;

public class Professor extends Pessoa {

    private String formacao;
    private int quantDisciplinas;
    private double tempoServico;

    public Professor(String cpf, String formacao) {
        super(cpf);
        this.formacao = formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public void setQuantDisciplinas(int quantDisciplinas) {
        this.quantDisciplinas = quantDisciplinas;
    }

    public int getQuantDisciplinas() {
        return quantDisciplinas;
    }

    public void setTempoServico(double tempoServico) {
        this.tempoServico = tempoServico;
    }

    public double getTempoServico() {
        return tempoServico;
    }

    @Override
    public double calcularRemuneracao() {
        if (this.tempoServico < 3)
            return 1000;
        else
            return 2000;
    }

    @Override
    public String toString() {
        return " Professor" + super.toString() + "Formação = " + formacao + "\nQuant. de Disciplinas = "
                + quantDisciplinas + "\nTempo de Serviço = " + tempoServico + "\nRemuneração = " + calcularRemuneracao() + "\n";
    }
}
