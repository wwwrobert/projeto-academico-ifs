package br.edu.ifs;

public abstract class Pessoa {

    private String nome;
    private String dataNascimento;
    private String localNascimento;
    private char sexo;
    private String cpf; 

    public Pessoa(String cpf) {
        super();
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }
    public String getLocalNascimento() {
        return this.localNascimento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public char getSexo() {
        return this.sexo;
    }  

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    
    public String getCpf() {
        return this.cpf;
    }    

    public abstract double calcularRemuneracao();

    @Override
	public String toString() {
		return ":\nNome = " + nome + "\nData de Nascimento = " + dataNascimento + "\nLocal de Nascimento = " + localNascimento
				+ "\nSexo(M/F) = " + sexo + "\nCPF = " + cpf + "\n";
	}   
}
