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
public class SistemaInterno {
    public static void login(Autenticavel a){
        int senha = 1234;
        
        boolean ok = a.autentica(senha);
    }
}
