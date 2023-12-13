package br.edu.ifs;

public class Pedagogo extends Pessoa {
    
    private int registro;

    public Pedagogo(int cpf) {
        super(cpf);
    }    

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public int getRegistro() {
        return this.registro;
    }

    @Override
	public String toString() {
		return " Pedagogo" + super.toString() + "Registro = " + registro + "\n";
	}
}