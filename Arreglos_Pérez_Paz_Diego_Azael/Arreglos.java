import java.util.*;
public class Arreglos{
    
        int positivos=0;
        int negativos=0;
        int aprobados, reprobados;
        double sumpos=0; 
        double sumneg=0;
        double promedio=0;
        int[] num= new int[10];
        int i;
        double [] calf= new double[10];
        
        
        

    public static void main(String[] args){
        Arreglos maymen = new Arreglos();
        Scanner entrada= new Scanner(System.in);
        int opcion;
        char letra;

        do{
        System.out.println("Bienvenido a el selector de programas de Diego Azael P\u00e9rez Paz");
        System.out.println("Eliga el programa que desee: ");
        System.out.println("1.- Promedio de numeros enteros positivos y negativos");
        System.out.println("2.- Promedio de numeros enteros positivos y negativos pero solo pares del array");
        System.out.println("3.- Calficaciones");
        System.out.println("4.- Leer un matriz");
        System.out.println("5.- Salir");

        opcion=entrada.nextInt();
        switch (opcion) {
            case 1:
                do{
                    maymen.ingresonum();
                    maymen.sumasdeposyneg();
                    maymen.promedio();

                    System.out.println("Si deseas repetir el programa escribe r  o si deseas cancelar pon cualquier otra letra");
                    letra=entrada.next().charAt(0);
                }while(letra=='r');
                break;
            case 2:
            do{
                maymen.ingresonumsolopares();
                
                System.out.println("Si deseas repetir el programa escribe  r o si deseas cancelar pon cualquier otra letra");
                letra=entrada.next().charAt(0);
            }while(letra=='r');
                break;
            
            case 3:
            do{
                maymen.calificaciones();
                maymen.promediocalf();
                maymen.calfaltaybaja();
                maymen.calfsuppro();
                maymen.cantaprorep();

                System.out.println("Si deseas repetir el programa escribe  r o si deseas cancelar pon cualquier otra letra");
                letra=entrada.next().charAt(0);
            }while(letra=='r');
                break;
            
            case 4:
            do{
                maymen.matrizmatrazelultimoprogramaveraz();

                System.out.println("Si deseas repetir el porgrama escribe r o si desea cancelar pon cualquier letra");
                letra=entrada.next().charAt(0);
            }while(letra=='r');
                break;
            
        }   
             
        System.out.println("Si deseas volver al menu escribe *m* o si desea salir del programa ingrese *5*");
                letra=entrada.next().charAt(0);
        
    }while(letra=='m');
}

    public void ingresonum(){
        Scanner entrada= new Scanner(System.in);

        

        System.out.println("Ingrese 10 numeros enteros: ");
        for ( i=0; i<num.length; i++){
            System.out.println("Numeros " +(i+1)+ "=");
            num[i]=entrada.nextInt();

        }
    }
    public void sumasdeposyneg(){


        for (i =0; i<num.length; i++){
            if (num[i] > 0){
                sumpos += num[i];
                positivos ++;
            } else if (num[i] < 0){
                sumneg += num[i];
                negativos ++;
            }
        }
    }
    public void promedio(){
        if (positivos !=0){
            promedio= (sumpos/positivos);
            System.out.println("El promedio de los numeros positivos es de: "+promedio);
        }
        if(negativos !=0){
            promedio= sumneg/negativos;
            System.out.println("El promedio de los numeros negativos es de "+ promedio);
        }
    }
        
    
    public void ingresonumsolopares(){
        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese 10 numeros enteros: ");
        for ( i=0; i<num.length; i++){
            System.out.println("Numeros " +i+ "=");
            num[i]=entrada.nextInt();

        }
        for (i =0; i<num.length; i++){
            if(i%2==0){
            if (num[i] > 0){
                sumpos += num[i];
                positivos ++;
            } else if (num[i] < 0){
                sumneg += num[i];
                negativos ++;
            }
           
            }
        }
        if (positivos !=0){
            promedio= (sumpos/positivos);
            System.out.println("El promedio de los numeros positivos que se encuentran en los pares del array es de: "+promedio);
        }
        if(negativos !=0){
            promedio= sumneg/negativos;
            System.out.println("El promedio de los numeros negativosque se encuentran en los pares del array es de "+ promedio);
        }
    }
 
    public void calificaciones(){
        Scanner entrada= new Scanner(System.in);
        //uso las variables ya definidas para no estar poniendo mas
        for (i=0;i<calf.length;i++){
            System.out.print("Ingrese las calificaciones de los alumnos "+(i+1)+"=");
            calf[i]=entrada.nextDouble();
        }
        System.out.println("Listado de todas las calificaciones ");
        System.out.println("Se imprimiran las calificaciones de los alumnos:");
            for (i = 0; i < calf.length; i++) {
                     
                 System.out.println("Alumno: " + (i + 1)+ " Calificacion: " + calf[i]);
            }

    }
    public void promediocalf(){
        
        for (i =0; i<num.length; i++){
            sumpos= sumpos + calf[i];
        }
            promedio= sumpos/calf.length;
            System.out.println("El promedio del grupo es de: "+promedio);
        
  
    }
    public void calfaltaybaja(){
        System.out.println("Calificacion altas y bajas");
        double mayor,menor;
        menor=mayor=calf[0];
        for (i=0;i<calf.length;i++){
            
            if (calf[i] > mayor){
                mayor=calf[i];
                
                
                
            }else if (calf[i]< menor)
                menor= calf[i];   
            
        }
        System.out.println("La calificacion mas alta es: "+mayor);
        

        System.out.println("La calificacion mas baja es: "+menor);
            
    }
    public void calfsuppro(){

    System.out.println("Listado de notas superiores a la promedio: ");
        for (i = 0; i < calf.length; i++) {
            if (calf[i] > promedio) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + calf[i]);
            }
        }
    }
    public void cantaprorep(){

    for(i=0; i<calf.length;i++){
    if (calf[i]>=6){
        aprobados+=1;
    }else{
        reprobados+=1;
        }
    }
        System.out.println("El total de aprobados es de: "+aprobados);
        System.out.println("El total de reprobados es de: "+reprobados);
    
    }

    public void matrizmatrazelultimoprogramaveraz(){
        Scanner entrada= new Scanner(System.in);

        //variables de las matrices
        int ma[][]=new int [3][3];
        int mb[][]=new int [3][3];
        int mc[][]=new int [ma.length][mb.length];
        float sumarfilas=0;

        for(int i=0; i<ma.length; i++){
            //columnas
            for(int j=0; j<ma.length; j++){
            System.out.println("Ingresa el numero de la fila "
            + (i+1) + " y de la columna " +(j+1)+ " : ");
            ma[i][j]=entrada.nextInt();

            System.out.println(String.format("Ingreso el: %d",ma[i][j]));
            }
        }
        System.out.print("Ahora vamos con la matriz b");
        for(int i=0; i<mb.length; i++){
            //columnas
            for(int j=0; j<mb.length; j++){
            System.out.println("Ingresa el numero de la fila "
            + (i+1) + " y de la columna " +(j+1)+ " : ");
            mb[i][j]=entrada.nextInt();

            System.out.println(String.format("Ingreso el: %d",mb[i][j]));
            }
        }
        System.out.println("Se suman los dos anteriores matrices");
        for(int i=0; i<mc.length; i++){
            //columnas
            for(int j=0; j<mc.length; j++){

                mc[i][j]=ma[i][j]+mb[i][j];
            System.out.println("La suma de ma y mb en mc es: "+mc[i][j]);
            }
        }//forma para imprimir el resultado
        System.out.println("Asi quedaria representado:");
        for (int i=0; i < mc.length; i++) {
            System.out.print("[");
            for (int j=0; j < mc[i].length; j++) {
              System.out.print (mc[i][j]);
              if (j!=mc[i].length-1) System.out.print("\t");
            }
            System.out.println("]");
        }



    }

}