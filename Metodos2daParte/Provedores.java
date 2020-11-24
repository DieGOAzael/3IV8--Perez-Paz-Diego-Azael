
import javax.swing.JOptionPane;

public class Provedores{
    String nombre_cliente;
    int i, j;
    int[] costo = new int[10];
    int[] Cant_Prod = new int[10];
    String[] producto = new String[10];
    float suma, max, min, promedio;

    public void Provedores(){
        nombre_cliente = JOptionPane.showInputDialog("Ingrese su Nombre:");

        try{
        JOptionPane.showMessageDialog(null, "Digite el costo y el nombre de sus productos uno a uno.");
        for(i = 0; i < costo.length; i++){
            costo[i] = Integer.parseInt(JOptionPane.showInputDialog("Costo ingresado" + (i + 1) + ":"));
            suma += costo[i];
            producto[i] = JOptionPane.showInputDialog("Producto ingresado " + (i + 1) + ":");
        }

    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Ingrese solo valores enteros en el precio o solo el nombre del producto donde se pide");
        JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
    }

        JOptionPane.showMessageDialog(null, "Digite las existencias de sus productos uno a uno."); 
        for(j = 0; j < Cant_Prod.length; j++){
            Cant_Prod[j] = Integer.parseInt(JOptionPane.showInputDialog("Existencia " + (j + 1) + ":"));
        }
        sump();
        Impr();
    }

    public void sump(){
        min = max = costo[0];
        for (i = 0; i < costo.length; i++){
            if(costo[i] > max){
                max = costo[i];
            }
            else if(costo [i] < min){
                min = costo[i];
            }
        }
    }

    public void Impr(){
        JOptionPane.showMessageDialog(null, "El costo total es de: " +suma+" $");
        JOptionPane.showMessageDialog(null, "Costo mayor ingresado: " +max+ " $");
        JOptionPane.showMessageDialog(null, "Costo menor ingresado: " +min+ " $");
        promedio = suma/costo.length;
        JOptionPane.showMessageDialog(null, "El promedio de los costos ingresados es de: " +promedio+ " $");
        
        JOptionPane.showMessageDialog(null, "Estimado " + nombre_cliente + " se le mostrar\u00e1 la lista de productos y costos:");
        JOptionPane.showMessageDialog(null, "Cantidad del Producto:" + Cant_Prod[0] + " Producto:" + producto[0] + " con costo de: " + (costo[0] * Cant_Prod[0]) + " $.\nCantidad del Producto:" + Cant_Prod[1] + " Producto:" + producto[1] + " cost\u00f3 " + (costo[1] * Cant_Prod[1]) + " $.\nCantidad del Producto:" + Cant_Prod[2] + " Producto:" + producto[2] + " con costo de: " + (costo[2] * Cant_Prod[2]) + " $.\nCantidad del Producto:" + Cant_Prod[3] + " Producto:" + producto[3] + " con costo de: " + (costo[3] * Cant_Prod[3]) + " $.\nCantidad del Producto:" + Cant_Prod[4] + " Producto:" + producto[4] + " con costo de: " + (costo[4] * Cant_Prod[4]) + " $.\nCantidad del Producto:" + Cant_Prod[5] + " Producto:" + producto[5] + " con costo de: " + (costo[5] * Cant_Prod[5]) + " $.\nCantidad del Producto:" + Cant_Prod[6] + " Producto:" + producto[6] + " con costo de: " + (costo[6] * Cant_Prod[6]) + " $.\nCantidad del Producto:" + Cant_Prod[7] + " Producto:" + producto[7] + " con costo de: " + (costo[7] * Cant_Prod[7]) + " $.\nCantidad del Producto:" + Cant_Prod[8] + " Producto:" + producto[8] + " con costo de: " + (costo[8] * Cant_Prod[8]) + " $.\nCantidad del Producto:" + Cant_Prod[9] + " Producto:" + producto[9] + " con costo de: " + (costo[9] * Cant_Prod[9]) + " $.\n");
    }
}