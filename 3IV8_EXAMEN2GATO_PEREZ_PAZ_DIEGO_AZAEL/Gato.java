import javax.swing.JOptionPane;
public class Gato{
    public static void main(String [] args){
        JOptionPane.showMessageDialog(null,"Bienvenido al Juego de GATO, por P\u00e9rez Paz Diego Azael.\nEn este programa se encontrar\u00e1 distintas cosas aprendidas hasta el momento:\n -Herencia\n-Encapsulamiento\n-M\u00e9todos\n-Clases\n-Ciclos\n-Arreglos\n-Matrices(sencillas de 3x3)\n-Condici\u00f3n\n-Excepciones\n\nEl juego se puede jugar de dos jugadores.\nEl juego se ejecuta en la terminal (/-_.)/");
        GatoM miau= new GatoM();
        miau.Juego();
    }
}