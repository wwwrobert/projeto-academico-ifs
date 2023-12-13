package br.edu.ifs;

public class Professor extends Pessoa {
    
    private String formacao;
    private int quantDisciplinas;

    public Professor(int cpf, String formacao) {
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

    @Override
	public String toString() {
		return " Professor" + super.toString() + "Formação = " + formacao + "\nQuant. de Disciplinas = " + quantDisciplinas + "\n";
	}
}
