package aula10b;

public class Funcionario extends Pessoa {
    // Atributos
    public String setor;
    public boolean trabalhando;
    
    // Métodos
    public void mudarTrabalho() {
        this.setTrabalhando(!(this.isTrabalhando()));
    }
    
    // Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
