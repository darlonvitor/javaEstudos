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
public class ControleBonificacoes {
    private double numeroDeBonificacoes  = 0;
    
    public void registra(Funcionario f){
        this.numeroDeBonificacoes += f.getBonificacao();
    }
    
    public double getTotalBonificacoes(){
        return this.numeroDeBonificacoes;
    }
}
