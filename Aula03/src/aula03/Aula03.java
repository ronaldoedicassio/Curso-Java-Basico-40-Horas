/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Ronaldo
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Canetas c1 = new Canetas();
                
        c1.modelo = "Big Cristal";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.destampar();
        c1.rabiscas();
        c1.status();
    }
    
}
