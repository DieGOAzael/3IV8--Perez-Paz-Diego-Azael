import java.util.Scanner;
public class GatoPadre{
    protected String[] jugadores= new String[2];
    protected String[][] juego= new String[3][3];
    protected Scanner entrada= new Scanner(System.in);
    protected boolean jugando= true,yaIngresado=false;
    protected int jugadorsh= 1,turnos=0;

    public void llenarTablero(){
        for(int i=0; i <3; i++) { 
            for(int j=0; j <3; j++){

                 juego[i][j]= " "; }
        }
    }
    public void imprimeGato() {
        System.out.println("    1  2  3");
        for(int i=0; i <3; i++) {
            for(int j=0; j <3; j++) {
                if (j==0) System.out.print(i+1);
                System.out.print(" |"+juego[i][j]);
            }
            System.out.println(" |");
        }
    }
    public boolean agregaPosicion(int x, int y,String val){
        try {
            if (juego[x][y]==" ") {
                juego[x][y] = val;
                turnos++;
                return true;
            }
        } catch(Exception e) { return false; }
        return false;
    }
    
    
    public boolean compruebaGana() {
        for(int i=0; i <3; i++) {
            if (juego[0][0] == juego[1][1] && juego[1][1] == juego[2][2] && juego[1][1] != " ") return true;
            else if (juego[0][2] == juego[1][1] && juego[1][1] == juego[2][0] && juego[1][1] != " ") return true;
            else if (juego[i][0] == juego[i][1] && juego[i][1] == juego[i][2] && juego[i][1] != " ") return true;
            else if (juego[0][i] == juego[1][i] && juego[1][i] == juego[2][i] && juego[1][i] != " ") return true;
        }
        return false;
    }

}
