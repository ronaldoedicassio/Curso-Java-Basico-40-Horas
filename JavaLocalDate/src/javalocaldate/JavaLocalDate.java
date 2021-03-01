/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocaldate;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Ronaldo
 */
public class JavaLocalDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        for (int i = 1; i <= num; i = i + 1 ) { //complete seu codigo aqui
            if (i % 2 != 0){
                System.out.println(i);
            }
            
        }
    }

}
