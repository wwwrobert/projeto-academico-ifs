package br.edu.ifs;

public class Responsavel extends Pessoa {

    private String parentesco;
    private double renda;

    public Responsavel(String cpf) {
        super(cpf);
    } 

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    public String getParentesco() {
        return this.parentesco;
    }
    
    public void setRenda(double renda) {
        this.renda = renda;
    }
    public double getRenda() {
        return this.renda;
    }

    @Override
	public String toString() {
		return " Responsável" + super.toString() + "Parentesco = " + parentesco + "\nRenda = " + renda + "\n";
	}
}
