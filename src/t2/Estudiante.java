/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

/**
 *
 * @author Leonardo
 */
public class Estudiante {
    private String nombre;
    private boolean presente;

    public Estudiante(String nombre) {
        this.nombre = nombre;

    }
    public Estudiante(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
    
 
    String getTexto(){
        return this.nombre;
    }
    
}
