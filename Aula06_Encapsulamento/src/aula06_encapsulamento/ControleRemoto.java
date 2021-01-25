/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_encapsulamento;

/**
 *
 * @author Ronaldo
 */
public class ControleRemoto implements Controlador {

    private int vol;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.vol = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----MENU----");
        System.out.println("Esta ligado " + this.isLigado());
        System.out.println("Esta tocando " + this.isTocando());
        System.out.print("Volume " + this.getVol());
        System.out.print(" <");
        for (int i = 0; i <= this.getVol(); i += 10) {
            System.out.print("|");
        }
        System.out.println(">");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVol(getVol() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVol(getVol() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVol() > 0) {
            this.setVol(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVol() == 0) {
            this.setVol(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }

}
