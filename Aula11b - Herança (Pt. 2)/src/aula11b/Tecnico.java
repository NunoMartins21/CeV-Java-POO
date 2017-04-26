package aula11b;

public class Tecnico extends Aluno { // Nota - não realizado na aula
    // Atributos
    private int registroProfissional;
    
    // Métodos
    public void praticar() {
        System.out.println("Praticando...");
    }
    
    // Getters e Setters
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
