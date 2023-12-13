package br.edu.ifs;

public class Tecnico extends Pessoa {

    private String cargo;
    private String funcao;
    private String anoDeEntrada;

    public Tecnico(String cpf) {
        super(cpf);
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getFuncao() {
        return funcao;
    }

    public void setAnoDeEntrada(String anoDeEntrada) {
        this.anoDeEntrada = anoDeEntrada;
    }
    public String getAnoDeEntrada() {
        return anoDeEntrada;
    }

    @Override
	public String toString() {
		return " Tecnico" + super.toString() + "Cargo = " + cargo + "\nFunção = " + funcao + "\nAno de Entrada = " + anoDeEntrada + "\n";
	}
}