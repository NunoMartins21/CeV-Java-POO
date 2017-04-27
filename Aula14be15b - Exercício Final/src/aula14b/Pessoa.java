package aula14b;

public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    protected float experiencia;
    
    // Métodos
    protected void ganharExp() {
        
    }
    
    // Construtor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.setExperiencia(0);
    }
    
    // toString()
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
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

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
}
