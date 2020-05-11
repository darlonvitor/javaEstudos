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
public class TesteRemove {
    public static void main(String[] args) {
         ContatoDAO dao = new ContatoDAO();
    
        dao.remove(new Long(1));
        
        System.out.println("Contato removido.");
    }
   
}
