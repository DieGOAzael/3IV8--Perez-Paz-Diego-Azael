package ove;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class procesos implements Serializable{
    
    private ArrayList<ingresar> listalibros;
    
    private leer objarchivo = new leer();
    
    
    public procesos(){
        listalibros = new ArrayList<ingresar>();
        listalibros = objarchivo.leer();
    }
    
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        String resp = "s";
        
        while(resp == "s"){
            ingresar objlibro = new ingresar();
            objlibro.aceptaDatos();
            listalibros.add(objlibro);
            resp = JOptionPane.showInputDialog("Se ha agregado el usuario.\n"
                    + "¿Desea agregar otro usuario? («s»/«n»).");
        }
    }
    
    public void consultaGral(){
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay usuarios registrados.");
        }else{
            JOptionPane.showMessageDialog(null,"Los usuarios son:\n");
            for(int i = 0; i<listalibros.size(); i++){
                JOptionPane.showMessageDialog(null,"Nombre: " + listalibros.get(i).getNombre()+ ".\n"
                                 + "Edad: " + listalibros.get(i).getEdad()+ ".\n"
                                 + "Puntaje: " + listalibros.get(i).getPrecio()+ ".\n");
            }
            
        }
    }
    
    private int traePosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        for(int i = 0; i < listalibros.size(); i++){
            if(nombreBuscar.equals(listalibros.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
            }
        }
        if(!existe){
            JOptionPane.showMessageDialog(null,"No hay registros del usuario introducido.");
            pos = -1;
        }
        return pos;
    }
    
    public int buscar(){
        int posBuscando = 0;
        String nombreBusca;
        Scanner entrada = new Scanner(System.in);
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay usuarios registrados.");
        }
        else{
        JOptionPane.showMessageDialog(null,"Ingrese el nombre del usuario:");
        nombreBusca = entrada.nextLine();
        
        posBuscando = traePosicion(nombreBusca);
        
        JOptionPane.showMessageDialog(null,"Nombre: " + listalibros.get(posBuscando).getNombre()
                + "Edad: " + listalibros.get(posBuscando).getEdad()
                + "Puntaje: " + listalibros.get(posBuscando).getPrecio()
                + "ID: " + listalibros.get(posBuscando));
        }
        return posBuscando;
    }
    
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String libroBorrar;
        int posBorrar;
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay usuarios registrados.");
        }else{
            posBorrar = buscar();
            if(posBorrar < listalibros.size()){
                listalibros.remove(posBorrar);
                JOptionPane.showMessageDialog(null,"Usuario eliminado con éxito.");
            }
        }
    }
    
    public void modificar(){
        int posModificar = 0;
        int resMods = 0;
        String nombreModificar;
        String opcion = "s";
        Scanner entrada = new Scanner(System.in);
        
        if(listalibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay usuarios registrados.");
        }
        else{
            nombreModificar = JOptionPane.showInputDialog("Digite el nombre del usuario que se modificará:");
        
        while("s".equals(opcion)){
            posModificar = traePosicion(nombreModificar);
            if(posModificar <= 0);
            resMods = Integer.parseInt(JOptionPane.showInputDialog("\nSeleccione el dato que desea modificar:"
                        + "— nombre (1);"
                        + "— edad (2);"));
                
                switch (resMods) {
                    case 1:
                        JOptionPane.showMessageDialog(null,"El nombre del usuario es: "
                                + listalibros.get(posModificar).getNombre());
                        listalibros.get(posModificar).setNombre(JOptionPane.showInputDialog("Actualice el nombre del usuario:"));
                        JOptionPane.showMessageDialog(null,"Modificación realizada con éxito."
                                + "\nNombre del usuario: " + listalibros.get(posModificar).getNombre());
                    break;
                    
                    case 2:
                        JOptionPane.showMessageDialog(null,"La edad del usuario es: "
                                + listalibros.get(posModificar).getEdad());
                        listalibros.get(posModificar).setEdad(Integer.parseInt(JOptionPane.showInputDialog("Actualice la edad:")));
                        JOptionPane.showMessageDialog(null,"Modificación realizada con éxito."
                                + "\nEdad: " + listalibros.get(posModificar).getEdad());
                    break;                
                }
            opcion = JOptionPane.showInputDialog("¿Desea modificar otro producto? («s»/«n»).");        
        }
        }
    }

    public ArrayList<ingresar> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<ingresar> listalibros) {
        this.listalibros = listalibros;
    }

    public leer getObjarchivo() {
        return objarchivo;
    }

    public void setObjarchivo(leer objarchivo) {
        this.objarchivo = objarchivo;
    }
    
    public void grabar(){
        getObjarchivo().serializar(listalibros);
    }
}