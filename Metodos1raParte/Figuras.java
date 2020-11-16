import java.util.Scanner;
import javax.swing.JOptionPane;
//Clase figuras, este programa calcula área y perímetro de 4 figuras
    public class Figuras{
            

    
    
    int opcion;
    char letra;
    public void Figuras(){
        Scanner entrada= new Scanner(System.in);
           do{
            
                //el cuerpo del programa
                //Se usa una mini interfaz para ingresar datos
                String texto = JOptionPane.showInputDialog("Elija la opcion deseada:\n 1.- Calcular el \u00e1rea y per\u00edmetro de un c\u00edrculo\n  2.- Calcular el \u00e1rea y per\u00edmetro de un rect\u00e1ngulo.\n  3.- Calcular el \u00e1rea y per\u00edmetro de un cuadrado.\n  4.- Calcular el \u00e1rea y per\u00edmetro de un tri\u00e1ngulo.\n  5.- Volver al menu");
                //se recoge y transforma
                opcion= Integer.parseInt(texto);
                //Creamos un switch para elegir las opcines

                switch (opcion){
            
                    case 1:
                    //aqui es donde llamamos al método
                    Figuras c=new Figuras();
                    c.areacirculo();
                    
                    
                        break;
                    case 2:
                    Figuras r=new Figuras();
                    r.arearectangulo();
                    

                        break;
                    case 3:
                    Figuras cu=new Figuras();
                    cu.areacuadrado();
                    
                    break;
                    case 4:
                    Figuras t=new Figuras();
                    t.areatriangulo();
                    
                    break;
                    default:
                    System.out.println("Gracias por participar");
            
                }
                System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s");
                //recibir una respuesta de si o no

                letra = entrada.next().charAt(0);

                //criterio para repetir
            }while(letra =='s');
        }
        
    //se ponen las variables generales de estos métodos
    int base=0, altura=0, lado=0, lado1=0, lado2=0, lado3=0;
        double resultado=0,resultadop=0;
        long perimetro=0; 
        Scanner entrada= new Scanner(System.in);
        //y se crea cada uno de los métodos para cacular area y perímetros
    public void areacirculo(){
        //Se pone una mini interfaz para ingresar valores
        String texto = JOptionPane.showInputDialog("Ingrese el valor del radio");
        base=Integer.parseInt(texto);

        resultado= 3.1416*base*base;
        //Y también se imprime el resulatado en un cuadro de texto
        JOptionPane.showMessageDialog(null,"El area del circulo es de: "+resultado);
        perimetrocirculo();
    }
    //la acción de ingresar valores y dar el resultado en un cuadro de texto se da en cada método
    public void perimetrocirculo(){
        resultadop=(2*3.1416)*base;
        JOptionPane.showMessageDialog(null,"El perimetro del circulo es de "+resultadop);
    }
    public void arearectangulo(){
        String texto = JOptionPane.showInputDialog("Ingrese el valor de la base ");
        base=Integer.parseInt(texto);
        String texto1 = JOptionPane.showInputDialog("Ingrese el valor de la altura ");
        altura=Integer.parseInt(texto1);

        resultado= base*altura;
        JOptionPane.showMessageDialog(null,"El area de rectangulo es de; "+resultado);
        perimetrorectangulo();
       
    }
    public void perimetrorectangulo(){
        resultadop= (2*base)+(2*altura);
        JOptionPane.showMessageDialog(null,"El perimetro del rectangulo es de "+resultadop );
    }
    public void areacuadrado(){
        String texto = JOptionPane.showInputDialog("Ingrese el valor de la base");
                    base=Integer.parseInt(texto);

                    resultado= base*base ;

                    JOptionPane.showMessageDialog(null,"El area del cuadrado es de: "+resultado);
                    perimetrocuadrado();
                    
    }
    public void perimetrocuadrado(){
        resultadop = base*4;
        JOptionPane.showMessageDialog(null,"El perimetro del cuadrado es de; "+resultadop);
    }
    public void areatriangulo(){
        String texto = JOptionPane.showInputDialog("Ingrese el valor de la base");
                base=Integer.parseInt(texto);
                String texto2 = JOptionPane.showInputDialog("Ingrese el valor de la altura");
                altura = Integer.parseInt(texto2);


                resultado= (base*altura)/2;

                JOptionPane.showMessageDialog(null,"El area del triangulo es de: "+resultado);
                perimetrotriangulo();
                

    }
    public void perimetrotriangulo(){
        String texto5 = JOptionPane.showInputDialog("Ingrese la medida de un primer lado del triangulo ");
                lado1=Integer.parseInt(texto5);
                String texto3 = JOptionPane.showInputDialog("Ingrese la medida del segundo lado del triangulo ");
                lado2=Integer.parseInt(texto3);
                String texto4 = JOptionPane.showInputDialog("Ingrese la medida del tercer lado del triangulo ");
                lado3=Integer.parseInt(texto4);

                resultadop= lado1+lado2+lado3;
                JOptionPane.showMessageDialog(null,"El perimetro del triangulo es de "+resultadop);
    }

}
