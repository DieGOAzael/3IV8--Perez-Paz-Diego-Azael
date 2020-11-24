import javax.swing.JOptionPane;
//clase para el sueldo de un empleado
public class Sueldo{
private String Nombre_Emp,Puesto;
private String ID;

//constructor
public Sueldo(){

}
//acceder a los datos
public Sueldo(String Nombre_Emp, String Puesto, String ID){
    this.Nombre_Emp=Nombre_Emp;
    this.Puesto =Puesto;
    this.ID=ID;

} 
//get y set
public String getNombre_Emp(){
    Nombre_Emp=JOptionPane.showInputDialog("Bienvenido, por favor ingrese su Nombre");
    return Nombre_Emp;
}
//enviar o establece
public void setNombre_Emp(String Nombre_Emp){
    this.Nombre_Emp=Nombre_Emp;
}

public String getPuesto(){
    Puesto = JOptionPane.showInputDialog("Para acceder ingrese su Puesto");
    return Puesto;
}
//enviar o establece
public void setPuesto(String Puesto){
    this.Puesto=Puesto;
}
public String getID(){
    ID=JOptionPane.showInputDialog("Ahora ingrese su ID porfavor");
    return ID;
}
//enviar o establece
public void setID(String ID){
    this.ID=ID;
}
}