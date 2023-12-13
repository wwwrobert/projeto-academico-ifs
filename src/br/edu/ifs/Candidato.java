package br.edu.ifs;

public class Candidato extends Pessoa {

    private String dataConcurso;
    private int codigoVaga;
    private int pontuacao;

    public Candidato(String cpf) {
        super(cpf);
    }

    public String getDataConcurso() {
        return dataConcurso;
    }
    public void setDataConcurso(String dataConcurso) {
        this.dataConcurso = dataConcurso;
    }

    public int getCodigoVaga() {
        return codigoVaga;
    }
    public void setCodigoVaga(int codigoVaga) {
        this.codigoVaga = codigoVaga;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
		return " Candidato" + super.toString() + "Data do Concurso = " + dataConcurso + "\nCódigo de Vaga = " + codigoVaga + "\nPontuação = " + pontuacao + "\n";
	}
    
}
