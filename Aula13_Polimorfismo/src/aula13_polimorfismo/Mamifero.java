/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13_polimorfismo;

/**
 *
 * @author Ronaldo
 */
public class Mamifero extends Animal{
    
    protected String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Emitir som mamifero");
    }
    
}
