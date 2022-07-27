/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoedd.appdirectorio.back;

import com.proyectoedd.appdirectorio.contacto.Contacto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andaryus777
 */
public class LeerArchivo {

    private ArrayList<Contacto> listaContactos;
    int fila = 1;
    public LeerArchivo(ArrayList<Contacto> listaC) {
        this.listaContactos = listaC;
    }

    public void leerFichero(File archivo) throws FileNotFoundException, IOException {
        fila=1;
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        
        while ((linea = br.readLine()) != null) {
            System.out.println("Apuesta ingresada " + linea);
            String[] datos = separarLineas(linea);
            if (datos.length == 4) {
                agregarContacto(datos);

            } else {
                JOptionPane.showMessageDialog(null, "Error en el formato de entrada, Linea : " + fila);
            }
            fila++;
        }
        fr.close();
        JOptionPane.showMessageDialog(null, "Archivo analizado");
    }

    private String[] separarLineas(String linea) {
        return linea.split("-");
    }

    private String[] separarPuntos(String dato) {
        return dato.split(":");
    }

    private void agregarContacto(String[] datos) {
        String[] red1 = separarPuntos(datos[2]);
        String[] red2 = separarPuntos(datos[3]);
        if (red1.length == 2 && red2.length == 2) {
            Contacto nuevoC = new Contacto(datos[0], datos[1], red1[0], red2[0], red1[1], red2[1]);
            this.listaContactos.add(nuevoC);
        }else{
            JOptionPane.showMessageDialog(null, "Error en el formato de red social, Linea : "+fila);
        }

    }

}
