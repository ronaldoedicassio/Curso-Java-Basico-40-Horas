/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Ronaldo
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void statusAtual(){
        System.out.println("-------------");
        System.out.println("Numero da conta: "+ this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    public ContaBanco() {
        this.saldo = 0.0f;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.setSaldo(50.0f);
        } else if (t == "cp") {
            this.setSaldo(150.0f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com debito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v) {

        if (this.isStatus() == true) {
           this.setSaldo(this.getSaldo() + v);
        }else{
            System.out.println("conta inexistente");
        }
    }

    public void sacar(float v) {
        if (this.isStatus() == true){
            if(this.getSaldo() >= v){
                setSaldo(this.getSaldo() - v);
            } else {                
                System.out.println("Valor a sacar maior que o saldo");
            }
        }else{
            System.out.println("Conta inexistente");
        }
    }

    public void pagarMensalidade() {
        float v = 0;
        
        if (this.getTipo()== "cc"){
            v = 12;
        }else if (this.getTipo() == "cp"){
            v = 20;
        }
        
        if (this.isStatus() == true){
            if(this.getSaldo()> v){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta inexistente");
        }
    }
}
