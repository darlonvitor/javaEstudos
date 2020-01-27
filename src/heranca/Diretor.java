/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author darlo
 */
public class Diretor extends Funcionario{

    private int senha;
    
    public Diretor(String nome, String cpf, double salario,int senha){
        super(nome,cpf,salario);
        this.senha = senha;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso autorizado");
            return true;
        }else{
            System.out.println("Acesso negado");
            return false;
        }
    }
    
    @Override
    public double getBonificacao() {
        return getSalario()*0.17;
    }
    
        
}
