package aula02b;

public class Aula02b {

    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // Instância de um objeto
        Caneta c2 = new Caneta();
        
        // Usar atributos - c1
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();
        c1.status();
        
        // Usar atributos - c2
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
    
}
