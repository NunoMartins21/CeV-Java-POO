package aula11b;

public class Professor extends Pessoa { // Nota - não realizado na aula
    // Atributos
    private String especialidade;
    private float salario;
    
    // Métodos
    public void receberAumento(float aum) {
        this.setSalario(this.getSalario() + aum);
        System.out.println("Salário de " + this.getNome() + " incrementado em " + aum + "€");
    }
    
    // Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
