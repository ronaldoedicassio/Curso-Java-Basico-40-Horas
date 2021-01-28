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
public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do aluno " + this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + "é Bolsista! Pagamento diferenciado");
    }
}
