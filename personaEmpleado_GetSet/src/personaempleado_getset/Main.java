package personaempleado_getset;
/**
 * Programa que atraves de clases y metodos setter's y getter's muestra la información de un empleado.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.setNombre("Mengano");
        emp.setEdad(25);
        emp.setGenero("Masculino");
        emp.setSueldo(50000.0);
            //Imprimir en consola.
        emp.mostrarDatos();
        emp.mostrarSueldo();
    }
        
}
