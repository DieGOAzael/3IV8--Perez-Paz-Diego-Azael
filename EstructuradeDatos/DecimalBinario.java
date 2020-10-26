import java.util.Scanner;

class DecimalBinario{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        int numero, exp, digito;
        double binario;
        char letra;
        do{

            do{ 
                System.out.print("Introduce un numero entero mayor que  0: ");                                                
                numero = entrada.nextInt();
            }while(numero < 0);

            exp=0;
            binario=0;
            while(numero!=0){
                    digito = numero % 2;           
                    binario = binario + digito * Math.pow(10, exp);                                                   
                    exp++;
                    numero = numero/2;
            }
            System.out.printf("El binario es de: %.0f %n", binario);

            System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s, si no ingrese otra letra ");
                       
                    letra = entrada.next().charAt(0);
        }while(letra=='s');
    }    
}

