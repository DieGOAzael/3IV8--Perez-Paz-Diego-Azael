import java.util.Scanner;

class Sesion4Menu{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        char letra;
        int programa,edad, numero,exp, digito,opcion, cantidad, cvasos, cplatos, ccucharas, cservilletas,total,base, altura, lado, lado1, lado2, lado3, operacion;
        double binario, celsius, kelvin, rankine, fahrenheit, resultado,resultadop;
        int numeros,positivos=0;
        int negativos=0;
        long perimetro;
        double numerof,factorial = 1;
        double valor1, valor2;

        System.out.println("3IV8_PEREZ_PAZ_DIEGO_AZAEL");

        do{
        
                System.out.println("Elija el programa deseado: ");
                System.out.println ("1.- Descuentos ");
                System.out.println("2.- Decimal a binario");
                System.out.println("3.- Grados");
                System.out.println("4.- Positivos y negativos" );
                System.out.println("5.- Ventas" );
                System.out.println("6.- Area, perimetro y volumen");
                System.out.println("7.- Tabla de Valores");
                System.out.println("8.- Factorial");
                System.out.println("13.- Calculadora");
                System.out.println("14.- Exit");

                programa= entrada.nextInt();
                
                switch (programa){
                    case 1:
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
                    break;
                    case 2:
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
                    break;
                    case 3:
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
                    break;
                    case 4:
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
                    break;
                    case 5:
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
                    break;
                    case 6:
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
                    break;
                    case 7:
                    do{
                        System.out.println("Tabla de valores: ");
            
                        System.out.println("\tN\t\t\t");
                        System.out.println("\t1\t10\t100\t1000");
                        System.out.println("\t2\t20\t200\t2000");
                        System.out.println("\t3\t30\t300\t3000");
                        System.out.println("\t4\t40\t400\t4000");
                        System.out.println("\t5\t50\t500\t5000");
                        System.out.println("\t6\t60\t600\t6000");
                        System.out.println("\t7\t70\t700\t7000");
                        System.out.println("\t8\t80\t800\t8000");
                        System.out.println("\t9\t90\t900\t9000");
                        System.out.println("\t10\t100\t1000\t1000");
                        
                        System.out.println(" ");
                        System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s");
            
            
                        letra = entrada.next().charAt(0);
                        }while(letra ==  's');
                    break;
                    case 8:
                    System.out.println("Escriba un numero entero positivo para obtener su factorial ");
                numerof = entrada.nextDouble();

                do{
                    do{
                    factorial = factorial*numerof;
                    numerof --;
                    }while(numerof!=0);

                    System.out.println("La factorial es igual a " +factorial);

                    System.out.println("Si desea repetir el ejercicio, ingrese una s");
                    letra = entrada.next().charAt(0);
                }while(letra == 's');
                    break;
                    case 13:
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
                    break;



                }
                
                System.out.println("¿ Deseas volver al menu?, si lo desea escriba m. Si desea salir escriba e");
                letra = entrada.next().charAt(0);

               
        }while(letra =='m'); 
        
            
    }
}