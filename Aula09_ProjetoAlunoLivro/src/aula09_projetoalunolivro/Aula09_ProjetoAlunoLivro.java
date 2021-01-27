/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09_projetoalunolivro;

/**
 *
 * @author Ronaldo
 */
public class Aula09_ProjetoAlunoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[5];

        p[0] = new Pessoa("João", 24, "M");
        p[1] = new Pessoa("Jose", 34, "M");
        p[2] = new Pessoa("Maria", 29, "F");

        l[0] = new Livro("Rapido e Devagar", "Daniel Kahneam", 450, p[0]);
        l[1] = new Livro("Pai Rico, Pai Pobre", "Robet Kyosak", 300, p[2]);
        l[2] = new Livro("Armas da Persuação", "Rober Cialdini", 350, p[1]);
        l[3] = new Livro("Logica do Cisne Negro", "Nassim Taleb", 340, p[2]);
        l[4] = new Livro("Segredo da mente milionaria", "T. Harv Eker", 250, p[1]);
        
        System.out.println(l[0].detalhes());
        p[0].fazerAniversario();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
    }

}
