package aula05b;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos
    public void extratoConta() {
        System.out.println("-----------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo atual: " + this.getSaldo());
        if (this.getStatus()) {
            System.out.println("Aberta: Sim");
        }
        else {
            System.out.println("Aberta: Não");
        }
        System.out.println("-----------------------");
    }
    
    public void abrirConta(int nc, String t, String d) {
        if (this.getStatus() == false) {
            this.setNumConta(nc);
            this.setTipo(t);
            this.setDono(d);
            this.setStatus(true);
            if (this.getTipo().equals("CC")) {
                this.setSaldo(50);
            }
            else if (this.getTipo().equals("CP")) {
                this.setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso, sr(a) " + this.getDono() + "!");
        }
        else {
            System.out.println("Erro ao abrir a conta: já foi aberta!");
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada: ainda tem dinheiro.");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada: está em débito.");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito no valor de " + v + "€ na conta de " + this.getDono() + " realizado com sucesso!");
        }
        else {
            System.out.println("Impossível depositar: conta fechada");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque no valor de " + v + "€ na conta de " + this.getDono() + " realizado com sucesso!");
            }
            else {
                System.out.println("Impossível sacar: saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível sacar: conta fechada");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        // Saber o valor a pagar
        if (this.getTipo().equals("CC")) {
            v = 12;
        }
        else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade no valor de " + v + "€ da conta de " + this.getDono() + " paga com sucesso!");
            }
            else {
                System.out.println("Impossível pagar mensalidade: Saldo Insuficiente!");
            }
        }
        else {
            System.out.println("Impossível pagar mensalidade: conta fechada!");
        }
    }
    
    // Construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}