import javax.swing.JOptionPane;
public class Devolver extends Biblioteca{
    private int ej1, ej2, ej3, ejp1, ejp2, ejp3;
    public Devolver(){

    }
    public Devolver(String l1, String l2, String l3, String lb, int ej1, int ej2, int ej3, int ejp1, int ejp2, int ejp3){
        super(l1, l2, l3, lb);
        this.ej1=ej1;
        this.ej2=ej2;
        this.ej3=ej3;
        this.ejp1=ejp1;
        this.ejp2=ejp2;
        this.ejp3=ejp3;
    }
    public void PrintDevueltos(){
        int libro;
        JOptionPane.showMessageDialog(null, "Escoja el libro que quiera devolver");
        libro=Integer.parseInt(JOptionPane.showInputDialog("\n1. "+getl1()+" \n2. "+getl2()+" \n3. "+getl3()));
        switch(libro){
            case 1:
                JOptionPane.showMessageDialog(null, "El libro "+getl1()+" de librer\u00edas Go "+getlb()+" tiene una disponibilidad de "+ej1+" ejemplares, con "+ejp1+" prestados");
                ej1=ej1+1;
                ejp1=ejp1-1;
                JOptionPane.showMessageDialog(null, "Por el momento tenemos "+ej1+" ejemplares y "+ejp1+" prestados");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El libro "+getl2()+" de librer\u00edas Go "+getlb()+" tiene una disponibilidad de "+ej2+" ejemplares, con "+ejp2+" prestados");
                ej2=ej2+1;
                ejp2=ejp2;
                JOptionPane.showMessageDialog(null, "Por el momento tenemos "+ej2+" ejemplares y "+ejp2+" prestados");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El libro "+getl3()+" de librer\u00edas Go "+getlb()+" tiene una disponibilidad de "+ej3+" ejemplares, con "+ejp3+" prestados");
                ej3=ej3+1;
                ejp3=ejp3-1;
                JOptionPane.showMessageDialog(null, "Por el momento tenemos "+ej3+" ejemplares y "+ejp3+" prestados");
                break;
                default:
                JOptionPane.showMessageDialog(null, "-----");
        }
    }
}