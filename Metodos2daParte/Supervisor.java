import java.util.Scanner;
import javax.swing.JOptionPane;

public class Supervisor extends Sueldo{
    private double pago_quincena;
    public Supervisor(){

    }
    //metodo para acceder a la clase principal y el pago quincena
    public Supervisor(String Nombre_Emp, String Puesto, String ID, double pago_quincena){
        super(Nombre_Emp, Puesto, ID);
        this.pago_quincena=pago_quincena;
    }
    public double getpago_quincena(){
        pago_quincena= 8000-((0.02*000)+(0.01*8000)+(0.16*8000));

        return pago_quincena;
    }
    public void setpago_quincena(double pago_quincena){
        this.pago_quincena=pago_quincena;
    }
    public void mostrarSupervisor(){
        JOptionPane.showMessageDialog(null, "Bienvenida(o) Sr(a). "+getNombre_Emp()+" \nCon puesto de: "+getPuesto()+" \n El ID que ingreso: "+getID()+" es correcto,\n Su pago es de "+ getpago_quincena()+" Tenga buen d\u00eda");
    }

}