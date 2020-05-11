/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

/**
 *
 * @author darlo
 */
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        //conexao com o BD
        ContatoDAO dao = new ContatoDAO();
        
        //Obtendo contatos cadastrados
        List<Contato> contatinhos = dao.getLista();
        
        //Imprimindo a lista de contatos
        contatinhos.stream().forEach(System.out::println);
    }
}
