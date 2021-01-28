/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_herança;

/**
 *
 * @author Ronaldo
 */
public class Aula11_Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Joao");
        a1.setMatricula(1111);
        a1.setCurso("Java");
        a1.setIdade(24);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2122);
        b1.setNome("Ronaldo");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
                
        Tecnico t1 = new Tecnico();
        t1.setMatricula(3333);
        t1.setNome("José");
        t1.setSexo("M");
        t1.setIdade(22);
        t1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Paulo");
        p1.setIdade(43);
        p1.setSexo("M");
        p1.setEspecialidade("Programador Java");
        p1.setSalario(15000f);
        System.out.println(p1.toString());
        System.out.format("Salario R$" + "%.2f", p1.getSalario());
        
    }
    
}
