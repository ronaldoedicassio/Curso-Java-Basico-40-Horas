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
public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssitindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitindo = 0;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitindo() {
        return totAssitindo;
    }

    public void setTotAssitindo(int totAssitindo) {
        this.totAssitindo = totAssitindo;
    }

    public void viuMaisUm() {
        this.totAssitindo++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString()+ "login=" + login + ", totAssitindo=" + totAssitindo + '}';
    }
    
    
}
