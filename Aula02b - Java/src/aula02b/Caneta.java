package aula02b;

public class Caneta {
    // Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // Métodos
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar!");
        }
        else {
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
    // Método para mostrar o estado
    void status() {
        System.out.println("----------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? - " + this.tampada);
        System.out.println("----------------------");
    }
}
