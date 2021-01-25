/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Ronaldo
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco conta1 = new ContaBanco();
        ContaBanco conta2 = new ContaBanco();
        
        conta1.setDono("João");
        conta1.setNumConta(1111);
        conta1.abrirConta("cc");
        conta1.depositar(1000);
        
        conta2.setDono("Cleuza");
        conta2.setNumConta(2222);
        
        conta2.abrirConta("cp");
        conta1.statusAtual();
        conta2.statusAtual();
        
        
        
    }
    
}
