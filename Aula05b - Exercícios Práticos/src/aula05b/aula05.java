package aula05b;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta(1111, "CC", "Jubileu");
        p1.depositar(100);
        p1.extratoConta();
        
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta(2222, "CP", "Creuza");
        p2.depositar(500);
        p2.sacar(100);
        p2.extratoConta();
    }
}
