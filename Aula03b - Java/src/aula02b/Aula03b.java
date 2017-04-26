package aula02b;

public class Aula03b {

    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // Instância de um objeto
        c1.modelo = "BIC Cristal";  // Atributo Público
        c1.cor = "Azul";            // Atributo Público
        // c1.ponta = 0.5f;         -> O atributo é privado
        c1.carga = 80;              // Posso alterar atributos protegidos pois a classe está a utilizar a classe Caneta
        // c1.tampada = true;       -> O atributo é privado
        c1.tampar();                // Ao usar este método, posso alterar o atributo tampada - Método Setter
        c1.status();
    }
    
}
