/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soma = 0, n, count = 0, countP = 0, countI = 0, maior = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("<html>Informe numeros <br>Valor 0 Interrompe</br></html>"));
            count++;
            soma += n;
            if (n % 2 == 0) {
                countP++;
            } else {
                countI++;
            }
            if (n > 100) {
                maior++;
            }
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr></hr>"
                + "\nTotal de Valores: " + count 
                + "\nTotal de Pares: " + countP 
                + "\nTotal de Impares: " + countI 
                + "\nAcima de 100: " + maior 
                + "\nMedia de Valores: " + soma/count);
    }

}
