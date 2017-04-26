package aula11b;

public abstract class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    // Métodos
    public final void fazerAniv() {
        this.setIdade(this.idade++);
    }
    
    // ToString
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
