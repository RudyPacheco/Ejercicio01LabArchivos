
package com.proyectoedd.appdirectorio.back;

import com.proyectoedd.appdirectorio.contacto.Contacto;
import java.util.ArrayList;

/**
 *
 * @author andaryus777
 */
public class registrarContacto {
    
    private ArrayList<Contacto> listaContact = new ArrayList<>();
    
    public void crearContacto(Contacto usr){
        this.listaContact.add(usr);
    }
    
    public Contacto generarContacto(String nombre,String numero,String redS1,String usr1,String redS2,String user2){
        Contacto nuevoC = new Contacto(nombre, numero, redS1, redS2, usr1, user2);
        return nuevoC;
        
    }
    
    public ArrayList<Contacto> getListaContactos(){
        return  this.listaContact;
    }
    
    
    
}
