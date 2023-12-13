package br.edu.ifs;

public class Monitor extends Professor {

    private double salario;
    private String periodo;
    private String disciplina;

    public Monitor(String cpf, String formacao) {
        super(cpf, formacao);
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double getSalario() {
        return salario;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getPeriodo() {
        return periodo;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return " Monitor" + super.toString() + "Salário = " + salario + "\nPeríodo = " + periodo + "\nDisciplina = " + disciplina + "\n";
    }
}
