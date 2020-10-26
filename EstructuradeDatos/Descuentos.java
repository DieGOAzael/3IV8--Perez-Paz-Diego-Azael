import java.util.Scanner;

class Descuentos{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        //asigno variables
        int edad, numero;
        char letra;
        //cuerpo
                do{
        
                    System.out.print("Ingrese la edad que tiene: ");
                    edad=entrada.nextInt();
                    
                    if (edad >= 65){
                        System.out.println("A su abono se le aplico un 40% de descuento ");
                    }else if (edad <= 21){
                        System.out.println( " ¿Sus padres son socios?, si su respuesta es afirmativa ingrese el numero 1, si no el numero 2 ");
                        numero=entrada.nextInt();
                        if (numero==1){
                            System.out.println("Al su abono se le aplico un 45% de descuento ");
                        }else 
                        System.out.println("A su abono se le aplico un 25% de descuento ");

                       } else System.out.println("Usted no clasifica para este abono" ); 
                       System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s, si no ingrese otra letra ");
                       
                    letra = entrada.next().charAt(0);
                    
                }while(letra=='s');        

    }
}
