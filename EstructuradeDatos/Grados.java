import java.util.Scanner;

class Grados{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        double celsius, kelvin, rankine, fahrenheit;
        int opcion;
        char letra;

        do{
            System.out.println("Ingrese la opcion que desea realizar; ");
            System.out.println("1.- De Fahrenheit a Celcius ");
            System.out.println("2.- De Fahrenheit a Kelvin");
            System.out.println("3.- De Fahrenheit a Rankine");
            
            opcion= entrada.nextInt();

            switch (opcion){
                case 1:
                System.out.println("Ingrese los grados Fahrenheit enteros que desea convertir: ");
                fahrenheit=entrada.nextDouble();

                celsius= (fahrenheit-32)/1.8;
                System.out.println("Los grados en celsius son: "+celsius);
                break;

                case 2:
                System.out.println("Ingrese los grados enteros de Fahrenheit que desea convertir");
                fahrenheit= entrada.nextDouble();

                kelvin= (((fahrenheit-32)*5)/9)+273.15;
                System.out.println("Los grados en Kelvin son "+kelvin);
                break;
                
                case 3:
                System.out.println("Ingrese los grados enteros de Fahrenheit que desea convertir ");
                fahrenheit= entrada.nextDouble();

                rankine= fahrenheit+459.67;
                System.out.println("Los grados en Rankine son: "+rankine);
                break;
                default:
                System.out.println("Vuelva a usarme pronto :D ");
            }System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s");

            letra = entrada.next().charAt(0);


        }while(letra=='s');
    }
}