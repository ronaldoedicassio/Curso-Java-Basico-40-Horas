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
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssitindo;
    
    public void viuMaiUm(){
        this.totAssitindo++;
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
    
}
