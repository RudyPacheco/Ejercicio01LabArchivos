package com.proyectoedd.appdirectorio.back;

import com.proyectoedd.appdirectorio.contacto.Contacto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andaryus777
 */
public class registrarContacto {

    private ArrayList<Contacto> listaContact = new ArrayList<>();

    public void crearContacto(Contacto usr) {
        boolean bandera = false;
        for (Contacto contacto : listaContact) {
            if (contacto.getNombre().equals(usr.getNombre())) {
                bandera = true;
            }
        }
        if (bandera) {
            JOptionPane.showMessageDialog(null, "Se intento ingresar un nombre de contacto ya existente");

        } else {
            this.listaContact.add(usr);
             JOptionPane.showMessageDialog(null, "Contacto registado");
        }

    }

    public Contacto generarContacto(String nombre, String numero, String redS1, String usr1, String redS2, String user2) {
        Contacto nuevoC = new Contacto(nombre, numero, redS1, redS2, usr1, user2);
        return nuevoC;

    }

    public ArrayList<Contacto> getListaContactos() {
        return this.listaContact;
    }

}
