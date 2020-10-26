import java.util.Scanner;

class Figurillas{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        int base, altura, opcion, lado, lado1, lado2, lado3;
        char letra;
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado,resultadop;
        long perimetro;
        do{
            //el cuerpo del programa
            System.out.println("Elija la opcion deseada: ");
           
            System.out.println("1.- Calcular el area y perimetro de un triangulo ");
            System.out.println("2.- Calcular el area y perimetro de un rectangulo " );
            System.out.println("3.- Calcular el volumen de una esfera ");
            System.out.println("4.- Calcular el volumen de un cilindro ");
            System.out.println("5.- Salir");
            
            opcion= entrada.nextInt();

            switch (opcion){
               
                case 1:
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
                case 2:
                    System.out.println("Ingrese el valor de la base ");
                    base=entrada.nextInt();
                    System.out.println("Ingrese el valor de la altura ");
                    altura=entrada.nextInt();

                    resultado= base*altura;
                    System.out.println("El area de rectangulo es de; "+resultado);
                    resultadop= (2*base)+(2*altura);
                    System.out.println("El perimetro del rectangulo es de "+resultadop );
                    break;
                case 3:
                    System.out.println("Ingrese el valor del radio");
                    base=entrada.nextInt();

                    resultado= ((4/3)*3.1416)*(Math.pow(base,3));

                    System.out.println("El volumen de la esfera es de: "+resultado);
                
                break;
                case 4:
                    System.out.println("Ingrese el valor del radio");
                    base=entrada.nextInt();
                    System.out.println("Ingrese el valor de la altura");
                    altura = entrada.nextInt();

                    resultado= 3.1416*(Math.pow(base,2))*altura;

                    System.out.println("El volumen del cilindro es de: "+resultado);
                

                break;
                
               
                default:
                System.out.println("Gracias por participar");
        
            }
            System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s");


            letra = entrada.next().charAt(0);


        }while(letra =='s');
    }
}
   