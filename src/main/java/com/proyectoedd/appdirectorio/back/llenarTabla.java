/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoedd.appdirectorio.back;

import com.proyectoedd.appdirectorio.contacto.Contacto;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andaryus777
 */
public class llenarTabla {
 
    public void llenarTabla(ArrayList<Contacto> listaC ,JTable tabla){
         DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        //Anadir columnas
        modelo.addColumn("Nombre");
        modelo.addColumn("Numero-Whatsapp");
        modelo.addColumn("Red social 1");
        modelo.addColumn("Usuario 1");
        modelo.addColumn("Red social 2");
        modelo.addColumn("Usuario 1");
        for (Contacto contacto : listaC) {
          modelo.addRow(new Object[]{contacto.getNombre(),contacto.getNumero(),contacto.getRedSocial1(),contacto.getUsuario1(),contacto.getRedSocial2(),contacto.getUsuario2()});
        }
    }
    
    
    
    
}
