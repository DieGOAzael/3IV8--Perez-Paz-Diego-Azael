public class GatoM extends GatoPadre{
    public void Juego(){
        
        jugadores[0]="X";
        jugadores[1]="O";
        llenarTablero();
        
        do {

            System.out.println("Es el turno del Jugador ["+jugadorsh+"]");
            while(!yaIngresado){
                imprimeGato();

                try{
                System.out.println("Ingresa Fila:");
                int px=Integer.parseInt(entrada.nextLine());

                System.out.println("Ingresa Columna:");
                int py=Integer.parseInt(entrada.nextLine());

                yaIngresado = agregaPosicion(px-1,py-1,jugadores[jugadorsh-1]);
                if (!yaIngresado) System.out.println("Ya hay una jugada en esta casilla, o esta fuera del tablero, intenta otra vez.");
                
                }catch(Exception e){System.out.println("Ingrese solo valores num\u00e9ricos");}
            }

            if (compruebaGana()){
                imprimeGato();
                System.out.println("Jugador ["+jugadorsh+"] WINS "+jugadores[jugadorsh-1]);
                return;
            }

            if (turnos==8) System.out.println("¡Woo, el juego ah terminado con un empate!");
            jugadorsh++;
            if (jugadorsh == 3) jugadorsh = 1;
            yaIngresado=false;
            
        } while(jugando);
    }
    
}