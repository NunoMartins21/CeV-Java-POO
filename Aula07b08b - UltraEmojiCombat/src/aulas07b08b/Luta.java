package aulas07b08b;

import java.util.Random;


public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if (this.isAprovada() == true) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random rand = new Random();
            int vencedor = rand.nextInt(3); // 0, 1 ou 2
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                case 1: // Desafiado vence
                    System.out.println(this.getDesafiado().getNome() + " venceu!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                case 2: // Desafiante vence
                    System.out.println(this.getDesafiante().getNome() + " venceu!");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
            }
        }
        else {
            
        }
    }
    
    // Getters e Setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
