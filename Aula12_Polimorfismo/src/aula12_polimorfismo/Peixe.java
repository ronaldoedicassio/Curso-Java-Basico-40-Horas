/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_polimorfismo;

/**
 *
 * @author Ronaldo
 */
public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substância");
    }

    @Override
    public void emetirSom() {
        System.out.println("Peixe não emite som");
        
    }
}
