package br.edu.ifs;

public class Psicologo extends Pessoa {

    private int crp;
    private String especialidade;

    public Psicologo(int cpf) {
        super(cpf);
    }    

    public void setCrp(int crp) {
        this.crp = crp;
    }
    public int getCrp() {
        return this.crp;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return this.especialidade;
    }

    @Override
	public String toString() {
		return " Psicologo" + super.toString() + "CRP = " + crp + "\nEspecialidade = " + especialidade + "\n";
	}
}
