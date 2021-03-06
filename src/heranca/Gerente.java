/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import interfaces.Autenticavel;

/**
 *
 * @author darlo
 */
public class Gerente extends Funcionario implements Autenticavel{
    
    private int senha;
    private int funcionariosGerenciados;
    private String setor;
    
    public Gerente(String nome, String cpf, double salario,int senha,String setor){
        super(nome,cpf,salario);
        this.senha = senha;
        this.setor = setor;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido");
            return true;
        }else{
            System.out.println("Acesso negado !!!");
            return false;
        }
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    public int getSenha(){
        return senha;
    }
    
    public void setFuncionariosGerenciados(int numeroFuncionarios){
        funcionariosGerenciados = numeroFuncionarios;
    }
    
    public int getFuncionariosGerenciados(){
        return funcionariosGerenciados;
    }
 
    //sobrescrevendo o metodo getBonificacao
    @Override
    public double getBonificacao(){
        return getSalario()*0.15;
    }
    
    
}
