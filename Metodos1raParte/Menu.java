import java.util.Scanner;
import javax.swing.JOptionPane;

//en este clase voy a poner el menú para elegir los programas y los métodos
public class Menu{
    
    public static void main(String[] args){
    Scanner entrada= new Scanner(System.in);
    //creo una mini interfaz para mostrar las opciones
    char letra;
    

    do{
        
        String texto = JOptionPane.showInputDialog("Buenas, bienvenido a el selector de programas de Diego Azael P\u00e9rez Paz. \nPara empezar eliga el programa que desee ejecutar: \n1.- Calcular la edad de una persona. \n2.- \u00c1rea y per\u00edmetro de distintas figuras. \n3.- Costo de llamadas telef\u00f3nicas. \n4.- Salir");
        //aqui se lee la opción
        int program = Integer.parseInt(texto);
        //utilizo un swtich dependiendo de la opcion ingresada por el usuario en la interfaz
        switch (program){
        
            case 1:
            
                do{
                    //Aqui mando a llamar a la clase Edad, que es el primer porgrama
                    Edad invoke=new Edad();
                    invoke.Edad();
                    //y la entrada para repetir sin interfaz porque no se como hacerlo con un char
                    System.out.println("Si deseas repetir el programa escribe  <r> o si deseas cancelar pon cualquier otra letra");
                    letra=entrada.next().charAt(0);
                }while(letra=='r');
                break;
            case 2:
            do{
                Figuras invoke= new Figuras();
                invoke.Figuras();

                System.out.println("Si deseas repetir el programa escribe  <r> o si deseas cancelar pon cualquier otra letra");
                letra=entrada.next().charAt(0);
            }while(letra=='r');
                break;
            case 3:
            do{

                Llamad call=new Llamad();
                call.Llamad();
                System.out.println("Si deseas repetir el programa escribe  <r> o si deseas cancelar pon cualquier otra letra");
                letra=entrada.next().charAt(0);
            }while(letra=='r');
            break;

            
        }
        System.out.println("Si deseas volver al selector de programas escribe <a> o si deseas cancelar pon cualquier otra letra");
                letra=entrada.next().charAt(0);
    }while(letra=='a');
    
}

}