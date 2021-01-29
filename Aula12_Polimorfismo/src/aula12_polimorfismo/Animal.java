/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_polimorfismo;

import java.lang.reflect.Method;

/**
 *
 * @author Ronaldo
 */
public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int menbros;

    //Metods abstrados
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emetirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }
   
}
