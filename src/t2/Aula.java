/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;
import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class Aula {
    private int numeroCarpetas;
    private ArrayList<Estudiante> estudiante;

    public Aula(int numeroCarpetas, ArrayList<Estudiante> estudiante) {
        this.numeroCarpetas = numeroCarpetas;
        this.estudiante = estudiante;
    }

    public int getNumeroCarpetas() {
        return numeroCarpetas;
    }

    public void setNumeroCarpetas(int numeroCarpetas) {
        this.numeroCarpetas = numeroCarpetas;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(ArrayList<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }
    
    
}
