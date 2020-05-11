/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrojavaoito;

import java.util.function.Consumer;

/**
 *
 * @author darlo
 */
class Mostrador implements Consumer<Usuario>{

    @Override
    public void accept(Usuario u) {
        System.out.println(u.getNome());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
