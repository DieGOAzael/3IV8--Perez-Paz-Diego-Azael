import java.util.Scanner;
import javax.swing.JOptionPane;

//en este clase voy a poner el menú para elegir los programas y los métodos
public class index{
    
    public static void main(String[] args){
    Scanner entrada= new Scanner(System.in);
    //creo una mini interfaz para mostrar las opciones
    char letra;
    

    do{
        
        String texto = JOptionPane.showInputDialog("Buenas, bienvenido a el selector de programas de Diego Azael P\u00e9rez Paz. \nPara empezar eliga el programa que desee ejecutar: \n1.- Sueldo. \n2.- Proveedores. \n3.- Biblioteca (libreria). \n4.- Salir");
        //aqui se lee la opción
        int program = Integer.parseInt(texto);
        //utilizo un swtich dependiendo de la opcion ingresada por el usuario en la interfaz
        switch (program){
        
            case 1:
            
                    String opcs=JOptionPane.showInputDialog("Eliga su puesoto: \n1.- Empleado\n2.- Supervisor");
                    int opc=Integer.parseInt(opcs);
                    switch (opc){
                        case 1:
                        Empleado emp1=new Empleado();
                        emp1.mostrarEmpleado();
                        break;
                        case 2:
                        //Aqui mando a llamar a la clase
                    Supervisor emp=new Supervisor();
                    emp.mostrarSupervisor();
                        break;
                    }
                
                break;
            case 2:

                    //Aqui mando a llamar a la clase
                    Provedores pm2=new Provedores();
                    pm2.Provedores();
                        
            break;
            case 3:
            Libros pm3=new Libros();
            pm3.Opciones();

            Devolver pm3d=new Devolver();
            pm3d.PrintDevueltos();
            break;
            

            
        }
        System.out.println("Si deseas volver al selector de programas escribe <a> o si deseas cancelar pon cualquier otra letra");
                letra=entrada.next().charAt(0);
    }while(letra=='a');
    
}

}