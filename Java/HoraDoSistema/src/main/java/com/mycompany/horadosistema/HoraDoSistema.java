package com.mycompany.horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {    
    public static void main(String[] args) {        
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        System.out.print("O Idioma do sistema é: ");
        System.out.println(idioma.getDisplayLanguage());
        
        System.out.println("Resolução da tela é: " + d.width + " x " + d.height);
            
                
    }
    
}
