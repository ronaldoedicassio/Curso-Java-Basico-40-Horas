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
public interface Publicacao {

    public void abrir();

    public void fechar();

    public void folhear(int pag);

    public void avancarPag();

    public void voltarPag();

}
