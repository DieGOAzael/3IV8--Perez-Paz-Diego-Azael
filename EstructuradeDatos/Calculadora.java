import java.util.Scanner;

class Calculadora{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        double valor1, valor2,resultado;
        char letra;
        int operacion;


        do{
            System.out.println("Digite el primer valor.");
            valor1 = entrada.nextDouble();
            System.out.println("Digite el segundo valor.");
            valor2 = entrada.nextDouble();

            System.out.println("Escriba que operacion desea realizar.");
            System.out.println("1.-Suma ");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Division ");
            
            operacion = entrada.nextInt();

                switch(operacion){
                    case 1:
                        resultado=valor1+valor2;
                        System.out.println("El resultado de la suma es: " + resultado);
                    break;
                    case 2:
                        resultado=valor1-valor2;
                        System.out.println("El resultado de la resta es: " + resultado);
                    break;
                    case 4:
                        resultado=(valor1)/(valor2);
                        System.out.println("El resultado de la division es: " + resultado);
                    break;
                    case 3:
                        resultado=valor1*valor2;
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                    default:
                    System.out.println("Sigamos resolviendo juntos");
                    break;
                    
                }
                System.out.println("Si desea repetir el ejercicio, ingrese una s");
                    letra = entrada.next().charAt(0);
        }while(letra=='s');
    }
}