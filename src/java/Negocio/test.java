/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;

import Beans.Facultad;
import Beans.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class test {
     public static void main(String[] args) {
         try {
             nFacultad nfac=new nFacultad();
             nUsuario nUser = new nUsuario();
             nUser.RegistrarUsuario(new Usuario(null,"Frank", "Gomez", "Flores", "72842685", "M", "Estudiante", "D", "frank@hotmail.com", "147258369","frank","123456", "U",new Facultad(1)));
         } catch (Exception ex) {
             System.out.println(ex);
         }
    }
}
