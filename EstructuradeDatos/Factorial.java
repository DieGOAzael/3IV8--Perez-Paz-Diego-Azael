import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
    Scanner entrada= new Scanner(System.in);
        char letra;
        double numero,factorial = 1;
        
        System.out.println("Escriba un numero entero positivo para obtener su factorial ");
                numero = entrada.nextDouble();

                do{
                    do{
                    factorial = factorial*numero;
                    numero --;
                    }while(numero!=0);

                    System.out.println("La factorial es igual a " +factorial);

                    System.out.println("Si desea repetir el ejercicio, ingrese una s");
                    letra = entrada.next().charAt(0);
                }while(letra == 's');
        }
}