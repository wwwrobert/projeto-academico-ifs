package br.edu.ifs;

public class Zelador extends Pessoa {

    private String setorResponsavel;
    private boolean possuiChave;

    public Zelador(String cpf) {
        super(cpf);
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;    
    }    
 
    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setPossuiChave(boolean possuiChave) {
        this.possuiChave = possuiChave;
    }

    public boolean getPossuiChave() {
        return possuiChave;
    }

    @Override
    public double calcularRemuneracao() {
        return 0;
    }

    @Override
	public String toString() {
		return " Zelador" + super.toString() + "Setor = " + setorResponsavel + "\nPossui chave = " + possuiChave + "\nRemuneração = " + calcularRemuneracao() + "\n";
	}  
}
