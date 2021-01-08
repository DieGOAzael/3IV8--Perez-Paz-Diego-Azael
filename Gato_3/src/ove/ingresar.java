package ove;

import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ingresar implements Serializable {
    
    private String nombre;
    private int edad;
    private float precio;
    
    public ingresar(){
    }

    public ingresar(String nombre, int edad, float precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void aceptaDatos(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario.");
        
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario."));
        
        //precio = (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese la puntuación del usuario."));
    }   
}