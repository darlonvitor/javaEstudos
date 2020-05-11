package bancodedados;

import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darlo
 */
public class TestePesquisa {
    public static void main(String[] args) {
        
        ContatoDAO dao = new ContatoDAO();
        Optional<Contato> oc;
        
        oc = dao.pesquisar(2);
        oc.ifPresentOrElse(System.out::println,() -> System.out.println("O contato nao foi encontrado !"));
    }
}
