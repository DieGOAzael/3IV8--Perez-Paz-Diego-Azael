import java.util.Scanner;

class Productos{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        
        int cantidad, cvasos, cplatos, ccucharas, cservilletas,total;
        char letra;
        do{
            

            

            System.out.println("BIENVENIDO A MATERIAS PRIMAS EL GLOBO FELIZ");
            System.out.println("CONTAMOS CON LO NECESARIO PARA SUS FIESTAS A INCREIBLES PRECIOS");
            System.out.println("VASOS 11.00$");
            System.out.println("PLATOS 15.00$");
            System.out.println("CUCHARAS 8.00$");
            System.out.println("SERVILLETAS 20.00$");

            System.out.println ("¿Cuantos productos desea comprar?");
            cantidad= entrada.nextInt();
            if (cantidad !=0){

                System.out.println("Ingrese la cantidad de paquetes de vasos que compro ");
                cvasos=entrada.nextInt();
                System.out.println("Ingrese la cantidad de paquetes de platos que compro ");
                cplatos=entrada.nextInt();
                System.out.println("Ingrese la cantidad de paquetes de cucharas que compro ");
                ccucharas=entrada.nextInt();
                System.out.println("Ingrese la cantidad de paquetes de servilletas que compro ");
                cservilletas=entrada.nextInt();

                total=(cvasos*11)+(cplatos*15)+(ccucharas*8)+(cservilletas*20);
            System.out.println("El total de productos que compro fue: "+ cantidad);
            System.out.println("El total a pagar es de: "+total);

            }
            
            
            System.out.println("Lo que se le ofrezca estamos para servirle, vuelva pronto :D ");

            System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s");

             letra = entrada.next().charAt(0);

        }while(letra =='s');


    }
}