import java.util.Scanner;
import javax.swing.JOptionPane;
public class Llamad{

        
         
    //un programa que busque recibir un numero, el costo de las llamadas realizadas, recarga y consulta
    public void Llamad(){
        //definimos las variables
        int acc;
    char letra;
    long num=0;
    Scanner entrada= new Scanner(System.in);
    //mini interfaz para recibir datos
    String texto = JOptionPane.showInputDialog("Bienvenido a Movicel, para comenzar ingrese su n\u00famero telef\u00f3nico:");
        num=Integer.parseInt(texto);
        //imprimirlos en un cuadro de texto
        JOptionPane.showMessageDialog(null,"Por ser un nuevo usuario de nuestra red, recibe 50$ de saldo para que hable con quien sea :3 : ");

        do{
            String texto1 = JOptionPane.showInputDialog("Seleccione la opci\u00f3n que quiere realizar en nuestro programa\n 1.-Costo de llamadas\n 2.-Recarga de Saldo\n 3.-Consulta de saldo");
            acc=Integer.parseInt(texto1);
            //switch para elegir opción en una interfaz
            switch(acc){
                case 1:
                float cred;
                //se llama al método
                Llamad c=new Llamad();
                c.cost();
                break;

                case 2:
                double nuevosaldo;
                Llamad r=new Llamad();
                r.recarga();
                break;

                case 3:
                
                Llamad cons=new Llamad();
                cons.Consulta();
                break;

            }
            System.out.println("¿ Deseas repetir el programa?, si lo desea escriba s");
                //recibir una respuesta de si o no
                //condición de repetición
                letra = entrada.next().charAt(0);
        }while(letra =='s');
    }
    //variables generales
    double na=0.0, lo=0.0, cl=0.0,nuevosaldo=0.0,cred=50.0,credgast=0,recarga=0;
    int acc,cna=0,clo=0,ccl=0;
    Scanner entrada= new Scanner(System.in);
//los métodos para todo el programa
    public void cost(){
        //Ingreso de datos con una mini interfaz
        String texto3 = JOptionPane.showInputDialog("¿Cu\u00e1ntas llamadas Nacionales ha hecho?");
        cna=Integer.parseInt(texto3);
        na= (cna*0.5);
        System.out.println(+na);
        System.out.println(+cred);
        //para saber la suma de costo y a la vez saber cuanto queda
        if (na>0){
            String texto4 = JOptionPane.showInputDialog("¿Cu\u00e1ntas llamadas Locales nacionales ha hecho?");
            clo=Integer.parseInt(texto4);
            lo= (clo*0.6);
            System.out.println(+lo);
            if (lo>0){
                String texto5 = JOptionPane.showInputDialog("¿Cu\u00e1ntas llamadas de celular ha hecho?");
                ccl=Integer.parseInt(texto5);
                cl=(ccl*0.2);
                System.out.println(+cl);
                if (cl>0){
                    credgast= na+lo+cl;
                    nuevosaldo= cred-credgast;
                    JOptionPane.showMessageDialog(null,"El total de saldo que ha gastado es: "+credgast);
                    JOptionPane.showMessageDialog(null,"Tu saldo ahora es de: "+nuevosaldo);
                }else JOptionPane.showMessageDialog(null,"Su saldo se ha agotado "+cl);
            }else JOptionPane.showMessageDialog(null,"Su saldo se ha agotado "+lo);
        }else JOptionPane.showMessageDialog(null,"Su saldo se ha agotado "+na);

    }//recarga de crédito
    public void recarga(){
        String texto7 = JOptionPane.showInputDialog("A seleccionado la recarga de cr\u00e9dito, ¿cu\u00e1nto desea recargar?");
        recarga=Integer.parseInt(texto7);
        nuevosaldo=recarga+nuevosaldo;
        JOptionPane.showMessageDialog(null,"Su saldo ahora es de: "+nuevosaldo);
    }
    //consulta de saldo
    public void Consulta(){
        if (nuevosaldo==0){
            JOptionPane.showMessageDialog(null,"Su saldo es de: "+cred);
        }else JOptionPane.showMessageDialog(null,"Su saldo es de: "+nuevosaldo);
    }
}