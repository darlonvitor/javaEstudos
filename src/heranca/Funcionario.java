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
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    
    public Funcionario(){}
    
    public Funcionario(String cpf){
        this.cpf = cpf;
    }
  
    public Funcionario(String nome,String cpf, double salario){
        this(cpf);
        this.nome = nome;
        this.salario = salario;
    };

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the id to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprimirPerfil(){
        System.out.println("Nome: " + nome + "\n" + "Cpf: " + cpf + "\n" + "Salário: " + salario);
    }
    
    public abstract double getBonificacao();
    
}
