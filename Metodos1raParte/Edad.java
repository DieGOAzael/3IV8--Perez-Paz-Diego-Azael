import java.util.Scanner;
import javax.swing.JOptionPane;
//creo la clase edad, donde se pregunta el año de nacimiento del usuario y se le muestra su edad
public class Edad{
    int edad=0,naci=0, fecha=2020;
    Scanner entrada= new Scanner(System.in);
        public void Edad(){
        
        //defino las variables
    
    //creo una mini interfaz para que el usuario ingrese su año de nacimiento
        String nac= JOptionPane.showInputDialog("Ingrese la fecha en que naci\u00f3 (no se preocupe este dato no se guardar\u00e1 de ning\u00fan modo)");
        //se recibe el valor
        naci=Integer.parseInt(nac);
        //se calcula la edad y se muestra el resultado
        edad= fecha-naci;
        JOptionPane.showMessageDialog(null,"Su edad es de: "+edad);
    }
    
}