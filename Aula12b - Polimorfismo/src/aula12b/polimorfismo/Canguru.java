package aula12b.polimorfismo;

public class Canguru extends Mamifero {
    // Métodos Sobrepostos
    @Override
    public void locomover() {
        System.out.println("Saltando...");
    }
    
    // Métodos
    public void usarBolsa() {
        System.out.println("Usando bolsa...");
    }
}
