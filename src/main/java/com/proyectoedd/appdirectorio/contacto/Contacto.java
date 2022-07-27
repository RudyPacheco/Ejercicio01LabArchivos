/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoedd.appdirectorio.contacto;

/**
 *
 * @author andaryus777
 */
public class Contacto {
    
    private String nombre;
    private String numero;
    private String redSocial1;
    private String redSocial2;
    private String usuario1;
    private String usuario2;
    
    public Contacto(){
        
    }

    public Contacto(String nombre, String numero, String redSocial1, String redSocial2, String usuario1, String usuario2) {
        this.nombre = nombre;
        this.numero = numero;
        this.redSocial1 = redSocial1;
        this.redSocial2 = redSocial2;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRedSocial1() {
        return redSocial1;
    }

    public void setRedSocial1(String redSocial1) {
        this.redSocial1 = redSocial1;
    }

    public String getRedSocial2() {
        return redSocial2;
    }

    public void setRedSocial2(String redSocial2) {
        this.redSocial2 = redSocial2;
    }

    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public String getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }
    
    
    
    
    
    
    
    
    
}
