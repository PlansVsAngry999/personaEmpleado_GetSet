package personaempleado_getset;
/**
 * Clase 'persona'.
 */
public class personaEmpleado {
        //Declarar variables.
    private String nombre;
    private int edad;
    private String genero;
        //Establecer y modificar nombre.
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
        //Establecer y modificar edad.
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
        //Establecer y modificar genero.
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
        //Imprimir en consola.
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }
}
