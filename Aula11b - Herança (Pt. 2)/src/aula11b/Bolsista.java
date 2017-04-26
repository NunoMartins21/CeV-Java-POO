package aula11b;

public class Bolsista extends Aluno {
    // Atributos
    private float bolsa;
    
    // Métodos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    // Métodos Sobrepostos (Polimorfismo)
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }
    
    // Getters e Setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
