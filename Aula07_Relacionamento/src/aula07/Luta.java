/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Random;

/**
 *
 * @author Ronaldo
 */
public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencendor = aleatorio.nextInt(3);
            System.out.println("________________");
            System.out.print("Resultado: ");
            switch (vencendor) {
                case 0: //Empate   
                    System.out.println("Empate");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;

                case 1: // Desafiado vence
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

                case 2: // Desafiante
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("A Luta não pode acontecer");
        }
        System.out.println("________________");
    }

    //Metodos Especiais
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
