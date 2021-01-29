/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14_exerciciopoo;

/**
 *
 * @author Ronaldo
 */
public class Aula14_ExercicioPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gafanhoto[] g = new Gafanhoto[2];
        Video[] v = new Video[3];
        g[0] = new Gafanhoto("Joao", 24, "M", "jo");
        g[1] = new Gafanhoto("Maria", 14, "F", "mamaria");

        v[0] = new Video("Aula POO");
        v[1] = new Video("Aula HTML");
        v[2] = new Video("Aula JAVA");

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1].toString());
        vis[1].avaliar();

        vis[2] = new Visualizacao(g[0], v[2]);
        System.out.println(vis[1].toString());
        vis[2].avaliar();

        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1].toString());
        vis[1].avaliar();

        vis[2] = new Visualizacao(g[0], v[2]);
        System.out.println(vis[1].toString());
        vis[2].avaliar();
    }

}
