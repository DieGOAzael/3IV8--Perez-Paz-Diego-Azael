import java.util.Scanner;

class PosNeg{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        int numeros,positivos=0;
        int negativos=0;
        char letra;
        do{

            do{
                System.out.println("Ingrese el numero a contar y presione ENTER, para terminar el cuento escriba 0 y de Enter; ");
                numeros=entrada.nextInt();

                if(numeros>0){
                    positivos = positivos + 1;
                }if(numeros<0){
                    negativos = negativos + 1;
                }
            }while(numeros!=0 );
         
            System.out.println("Cantidad de Positivos:" +positivos);
            System.out.println("Cantidad de Negativos:" +negativos);
                positivos = 0;
                negativos = 0;
                System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s");

             letra = entrada.next().charAt(0);
            

        }while(letra=='s');
    }
}            
