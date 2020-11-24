import java.util.Scanner;
import javax.swing.JOptionPane;

public class Empleado extends Sueldo{
    private double sueldo_quincenal;
    private int diurnas;
    private int nocturnas;
    public Empleado(){

    }
    //metodo para acceder a la clase principal y el pago quincena
    public Empleado(String Nombre_Emp, String Puesto, String ID, double sueldo_quincenal, int diurnas, int nocturnas){
        super(Nombre_Emp, Puesto, ID);
        this.sueldo_quincenal=sueldo_quincenal;
        this.diurnas=diurnas;
        this.nocturnas=nocturnas;
    }

    public double getsueldo_quincenal(){
       
        sueldo_quincenal= (5000+(getdiurnas()*50)+(getnocturnas()*60));
        return sueldo_quincenal;
    }
    public void setsueldo_quincenal(double sueldo_quincenal){
        this.sueldo_quincenal=sueldo_quincenal;
    }

    public int getdiurnas(){
        String diurnas1 = JOptionPane.showInputDialog("Ingresa las horas extra diurnas que ha trabajado");
        diurnas=Integer.parseInt(diurnas1);

        return diurnas;
    }
    public void setdiurnas(int diurnas){
        this.diurnas=diurnas;
    }

    public int getnocturnas(){
        String nocturnas1 = JOptionPane.showInputDialog("Ingresa las horas extra nocturnas que ha trabajado");
        nocturnas=Integer.parseInt(nocturnas1);
        return nocturnas;
    }
    public void setnocturnas(int nocturnas){
        this.nocturnas=nocturnas;
    }
    public void mostrarEmpleado(){
        JOptionPane.showMessageDialog(null, "Bienvenida(o) Sr(a). "+getNombre_Emp()+" \nCon puesto de: "+getPuesto()+" \n El ID que ingreso: "+getID()+" es correcto,\n Su pago es de "+ getsueldo_quincenal()+" Tenga buen d\u00eda");
    }
}