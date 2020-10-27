import java.util.Scanner;

class Examen{
    public static void main(String[] args){

            Scanner entrada = new Scanner(System.in);
            //comienzo a definir los valores de los pkm

            int ps=0;
            int ataque, ataquesec,pkm,numero;
            int id=0;
            int defensa=0;
            int fuerza=0;
            int pkmrival=80;
            char letra;

            System.out.println("3IV8_EXAMEN_PKDEX_PEREZ_PAZ_DIEGO_AZAEL");
            System.out.println("Bienvenido a mi Pokedex");
            //Empiezo con el cuerpo
            do{
                //cambie el orden de los pokemon, estando ahora en orden
                System.out.println("Hola Entrenador, soy una pokedex y te ayudare a conocer a los 3 iniciales de Kanto");
                System.out.println("Ingrese el numero 1 para conocer a  Bulbasaur");
                System.out.println("Ingrese el numero 2 para conocer a  Charmander");
                System.out.println("Ingrese el numero 3 para conocer a  Squirtle");
                System.out.println("Ingrese el numero 4 para el modo batalla");
                System.out.println("Ingrese el numero 5 para salir");


                pkm=entrada.nextInt();

                    //pongo un switch para elegir opciones

                switch (pkm){
                        case 1:
                        System.out.println("Bulbasaur");
                        ps= ps+50;
                        System.out.println("Bulbasaur tiene esta cantidad de ps "+ ps);
                        defensa=defensa+34;
                        System.out.println("Bulbasaur tiene esta defensa: "+defensa);
                        id=2132345;
                        System.out.println("El ID de Bulbasaur es: "+ id);
                        fuerza=fuerza+43;
                        System.out.println("Su fuerza es de: "+fuerza);
                        break;
                        
                        case 2:
                        System.out.println("Charmander");
                        ps= ps+61;
                        System.out.println("Charmander tiene esta cantidad de ps "+ ps);
                        defensa=defensa+19;
                        System.out.println("Charmander tiene esta defensa: "+defensa);
                        id=217895;
                        System.out.println("El ID de Charmander es: "+id);
                        fuerza=fuerza+49;
                        System.out.println("Su fuerza es de: "+fuerza);
                        break;

                        case 3:
                        System.out.println("Squirtle");
                        ps= ps+50;
                        System.out.println("Squirtle tiene esta cantidad de ps "+ ps);
                        defensa=defensa+60;
                        System.out.println("Squirtle tiene esta defensa: "+defensa);
                        id=2654225;
                        System.out.println("El ID de Squirtle es: "+id);
                        fuerza=fuerza+31;
                        System.out.println("Su fuerza es de: "+fuerza);
                        break;

                        case 4:
                        System.out.println("Escriba un numero del 1 al 3");
                        numero=entrada.nextInt();
                        if (numero >0){
                            switch (numero){
                                        case 1:
                                        System.out.println("Ingrese la cantidad de ps de su pokemon");
                                    ps= entrada.nextInt();
                                    if (ps !=0){
                                        System.out.println("Su pokemon es Squirtle y su vida es de: "+ps);
                                        System.out.println("Squirtle tiene esta cantidad de ps "+ ps);
                                        defensa=defensa+60;
                                        System.out.println("Squirtle tiene esta defensa: "+defensa);
                                        fuerza=fuerza+31;
                                        System.out.println("Su fuerza es de: "+fuerza);

                                        System.out.println("Ingrese el ataque");
                                        ataque=entrada.nextInt();
                                        ataque= (fuerza*defensa)/2;
                                        System.out.println("El impacto de su pokemon es de: "+fuerza);
                                        pkmrival= (pkmrival-fuerza);
                                        System.out.println("Su pkm ataco al pkm rival y lo dejo a "+pkmrival);
                                        if (pkmrival<0){
                                            System.out.println("Usted gano, ahora es un maestro pokemoOoN");
                                        }else 
                                        System.out.println("No pudo derrotar al rival y contra ataco, su pokemon se ha debilitado, te haz ido corriendo a un centro Pokemon.");
                                        

                                        

                                    }else
                                    System.out.println("Su Pokemon esta debilitado");
                                        break;

                                        case 2:
                                        System.out.println("Ingrese la cantidad de ps de su pokemon");
                                    ps= entrada.nextInt();
                                    if (ps !=0){
                                        System.out.println("Su pokemon es Charmander y su vida es de: "+ps);
                                        
                                        defensa=defensa+19;
                                        System.out.println("Charmander tiene esta defensa: "+defensa);
                                    
                                        fuerza=fuerza+49;
                                        System.out.println("Su fuerza es de: "+fuerza);

                                        System.out.println("Ingrese el ataque");
                                        ataque=entrada.nextInt();
                                        ataque= (fuerza*defensa)/2;
                                        System.out.println("El impacto de su pokemon es de: "+fuerza);
                                        pkmrival= (pkmrival-fuerza);
                                        System.out.println("Su pkm ataco al pkm rival y lo dejo a "+pkmrival);
                                        if (pkmrival<0){
                                            System.out.println("Usted gano, ahora es un maestro pokemoOoN");
                                        }else 
                                        System.out.println("No pudo derrotar al rival y contra ataco, su pokemon se ha debilitado, te haz ido corriendo a un centro Pokemon.");
                                        
                                    }else 
                                    System.out.print("Su pkm se ha debilitado");
                                    break;
                                        case 3:
                                        System.out.println("Ingrese la cantidad de ps de su pokemon");
                                    ps= entrada.nextInt();
                                    if (ps !=0){
                                        System.out.println("Su pokemon es Bulbasaur y su vida es de: "+ps);
                                    
                                        defensa=defensa+34;
                                        
                                        System.out.println("El ID de Bulbasaur es: "+id);
                                        fuerza=fuerza+43;
                                        System.out.println("Su fuerza es de: "+fuerza);

                                        System.out.println("Ingrese el ataque");
                                        ataque=entrada.nextInt();
                                        ataque= (fuerza*defensa)/2;
                                        System.out.println("El impacto de su pokemon es de: "+fuerza);
                                        pkmrival= (pkmrival-fuerza);
                                        System.out.println("Su pkm ataco al pkm rival y lo dejo a "+pkmrival);
                                        if (pkmrival<0){
                                            System.out.println("Usted gano, ahora es un maestro pokemoOoN");
                                        }else 
                                        System.out.println("No pudo derrotar al rival y contra ataco, su pokemon se ha debilitado, te haz ido corriendo a un centro Pokemon.");
                                        
                                    }else 
                                    System.out.println("Su pokemon se ha debilitado");
                                    break;
                                }
                            }
                        } System.out.println("Si desea volver al menu, escriba p, si no cualquier otra letra");
                        letra=entrada.next().charAt(0);
                    }while(letra =='p');
                }
            }

