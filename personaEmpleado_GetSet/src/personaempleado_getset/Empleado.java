package personaempleado_getset;
/**
 * Clase 'empleado'; hereda propiedades de la clase 'persona'.
*/
public class Empleado extends personaEmpleado{
        //Declarar variables.
    private double sueldo;
        //Establecer y modificar sueldo.
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
        //Imprimir en consola.
    public void mostrarSueldo(){
        System.out.println("Sueldo: " + sueldo);
    }
}
