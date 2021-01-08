package ove;

import gato_3.interfaz;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Ove implements Serializable{
    
    private List<ingresar> listaLibros;
    
    public List<ingresar> getListaLibros(){
        return listaLibros;
    }
    
    public void setListaLibros(List<ingresar> listaLibros){
        this.listaLibros = listaLibros;
}
            
    public static void main() {
        procesos objlista = new procesos();
        int opcion;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la consola.\n"
                    + "Elija el proceso a realizar:\n"
                    + "— agregar un usuario (1);\n"
                    + "— consultar todos los usuarios (2);\n"
                    + "— modificar un usuario (3);\n"
                    + "— salir (4)."));
            
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Se ha superado el máximo"
                            + "de dos (2) usuarios registrados.");
                break;
                
                case 2:
                    JOptionPane.showMessageDialog(null,"Para consultar a los usuarios,"
                            + "presione el icono «HOGAR» durante una partida.");
                break;
                
                case 3:
                    objlista.modificar();
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null,"Archivo generado.");
                    objlista.grabar();
                break;
                
                default:
                JOptionPane.showMessageDialog(null,"Error.");
            }       
        }while((opcion >= 1) && (opcion < 4));
    }
}