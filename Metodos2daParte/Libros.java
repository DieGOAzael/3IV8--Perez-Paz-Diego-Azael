import javax.swing.JOptionPane;
public class Libros{
    public void Opciones(){
        char letra;
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Pr\u00e9stamo de libro 2. Devoluci\u00f3n de un libro"));
        switch(opcion){
            case 1:
                do{
                    PLibros p=new PLibros("\nLa Divina Comedia; Poema de Dante Alighieri", "\nLas batallas en el desierto; Jos\u00e9 Emilio Pacheco", "\nLa Celestina; Fernando de Rojas", "\nLibrerias Go", 5, 3, 0, 1, 0, 4);
                    p.PrintLibros();
                    letra=JOptionPane.showInputDialog("Si desea hacer otro prestamo digite <s> si no dele click en cancelar").charAt(0);
                }while(letra=='s');
                break;
            case 2:
                do{
                    Devolver devolver=new Devolver("\nLa Divina Comedia; Poema de Dante Alighieri", "\nLas batallas en el desierto; Jos\u00e9 Emilio Pacheco", "\nLa Celestina; Fernando de Rojas", "\nLibrerias Go", 5, 3, 0, 1, 0, 4);
                    devolver.PrintDevueltos();
                    letra=JOptionPane.showInputDialog("Si desea hacer otra devolucion digite <s> si no dele click en cancelar").charAt(0);
                }while(letra=='s');
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vuelva pronto");
        }
    }
    
}