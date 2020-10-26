import java.util.Scanner;

class FigurasClasico{

    /*
    vamos a crear un programa que se encargue de realizar 
    un menú en el cual se puda elegir entre calcular el 
    area o el perimetro de las siguientes figuras

    triangulo
    cuadrado
    circulo

    actualización, ahora quiero que se repita todo el programa
    para volver a calcular otra area,

    como trabajo
    agregar las opciones del perimetro
    y dos figuras mas
    
    rectangulo y pentagono


    */

    public static void main(String[] args){

        //instancia de nuestro objeto
            Scanner entrada= new Scanner(System.in);

            //variables
            int base, altura, opcion, lado, lado1, lado2, lado3;
            char letra;
            //char es el tipo de dato y letra es el nombre de la variable
            double resultado,resultadop;
            long perimetro;
            do{
                //el cuerpo del programa
                System.out.println("Elija la opcion deseada: ");
                System.out.println ("1.- Calcular el area y perimetro de un cuadrado ");
                System.out.println("2.- Calcular el area y perimetro de un triangulo");
                System.out.println("3.- Calcular el area y perimetro de un circulo");
                System.out.println("4.- Calcular el area y perimetro de un rectangulo" );
                System.out.println("5.- Calcular el area y perimetro de pentagono" );
                System.out.println("6.- Salir");
                
                opcion= entrada.nextInt();
                //segun, por que vamos a dar opciones a elegir

                switch (opcion){
                    case 1:
                    //aqui es donde realizamos las operaciones
                    System.out.println("Ingrese el valor dado");
                    base=entrada.nextInt();

                    resultado= base*base ;

                    System.out.println("El area del cuadrado es de: "+resultado);
                    
                    
                    resultadop = base*4;
                    System.out.println("El perimetro del cuadrado es de; "+resultadop);

                        break;
                    case 2:
                    System.out.println("Ingrese el valor de la base");
                    base=entrada.nextInt();
                    System.out.println("Ingrese el valor de la altura");
                    altura = entrada.nextInt();


                    resultado= (base*altura)/2;

                    System.out.println("El area del triangulo es de: "+resultado);

                    System.out.println("Ingrese la medida de un primer lado del triangulo ");
                    lado1=entrada.nextInt();
                    System.out.println("Ingrese la medida del segundo lado del triangulo ");
                    lado2=entrada.nextInt();
                    System.out.println("Ingrese la medida del tercer lado del triangulo ");
                    lado3=entrada.nextInt();

                    resultadop= lado1+lado2+lado3;
                    System.out.println("El perimetro del triangulo es de "+resultadop);

                        break;
                    case 3:
                    System.out.println("Ingrese el valor del radio");
                    base=entrada.nextInt();

                    resultado= 3.1416*base*base;

                    System.out.println("El area del circulo es de: "+resultado);
                    resultadop=(2*3.1416)*base;
                    System.out.println("El perimetro del circulo es de "+resultadop);
                    
                    break;
                    case 4:
                    System.out.println("Ingrese el valor de la base ");
                    base=entrada.nextInt();
                    System.out.println("Ingrese el valor de la altura ");
                    altura=entrada.nextInt();

                    resultado= base*altura;
                    System.out.println("El area de rectangulo es de; "+resultado);
                    resultadop= (2*base)+(2*altura);
                    System.out.println("El perimetro del rectangulo es de "+resultadop );

                    break;
                    
                    case 5:
                    System.out.println("Ingrese el balor del apotema ");
                    base=entrada.nextInt();
                    System.out.println("Ingrese el valor del perimetro ");
                    perimetro=entrada.nextLong();

                    resultado= (base*perimetro)/2;
                    System.out.println("El area del pentagono es de: "+resultado);
                    
                    System.out.println("Ingrese la medida de un lado del pentagono ");
                    lado=entrada.nextInt();

                    resultadop= lado*5;
                    System.out.println("El perimetro del pentagono es de "+resultadop);


                    break;
                    default:
                    System.out.println("Gracias por participar");
            
                }
                System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s");
                //recibir una respuesta de si o no

                letra = entrada.next().charAt(0);

                //si utilizamos char se usa ''
                //si utilizamos string se usa ""
                //char num = 1      1+1=11
            }while(letra =='s');
                
                //System.out.println(letra);
            

    }
}
