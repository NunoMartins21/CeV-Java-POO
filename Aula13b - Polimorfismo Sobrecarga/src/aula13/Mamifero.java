package aula13;

public class Mamifero extends Animal {
    // Atributos
    private String corPelo;
    
    // Métodos Sobrepostos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
}
