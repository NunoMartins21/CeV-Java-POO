package aula13;

public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Animal x = new Animal;  -  Classe Abstrata
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        /*
         *   m.emitirSom();
         *   l.emitirSom();
         *   c.emitirSom();
         */
        
        // Reagir
        c.reagir("Olá!");
        c.reagir("Vai apanhar!");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
    
}
