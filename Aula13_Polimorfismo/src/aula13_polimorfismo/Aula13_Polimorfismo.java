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
public class Aula13_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        
        c.reagir(false);
    }
    
}
