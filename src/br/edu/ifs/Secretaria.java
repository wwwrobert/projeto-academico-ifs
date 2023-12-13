package br.edu.ifs;

public class Secretaria extends Pessoa {
    private String departamento;
    private int ramal;
    private String funcaoS;
    private String turno;

    public Secretaria(int cpf) {
        super(cpf);
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }   

    // Ramal é um número acossiado a um telefone dentro da organização
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    public int getRamal() {
        return ramal;
    }
    
    public void setFuncaoS(String funcaoS) {
        this.funcaoS = funcaoS;
    }
    public String getFuncaoS() {
        return funcaoS;
    }
   
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getTurno() {
        return turno;
    }
    
    @Override
    public String toString() {
        return " Secretaria" + super.toString() + "Departamento = " + departamento + "\nRamal = " + ramal + "\nFunção = " + funcaoS + "\nTurno = " + turno + "\n";
    }

}
