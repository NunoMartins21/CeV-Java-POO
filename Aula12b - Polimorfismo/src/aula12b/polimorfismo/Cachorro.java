package aula12b.polimorfismo;

public class Cachorro extends Mamifero {
    // Métodos Sobrepostos
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au!");
    }
    
    // Métodos
    public void enterrarOsso() {
        System.out.println("Enterrando um osso...");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o rabo..."); 
    }
}
