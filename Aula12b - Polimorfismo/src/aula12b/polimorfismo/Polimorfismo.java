package aula12b.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        // Animal a = new Animal()  -  Classe Abstrata
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();
        
        k.locomover();
        co.locomover();
        t.locomover();
        g.locomover();
        ar.locomover();
        
        System.out.println("------------------");
        
        k.emitirSom();
        co.emitirSom();
        t.emitirSom();
        g.emitirSom();
        ar.emitirSom();
        
        System.out.println("------------------");
        
        m.setPeso(35.5f);
        m.setCorPelo("Castanho");
        m.alimentar();
        m.locomover();
        m.emitirSom();
    }
    
}
