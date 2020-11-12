/**
 * Paquete practica 5
 */
package practica5;
/** 
 * Clase persona de la Práctica #5
 * @author Resendiz Cruz Rodrigo Daniel
 */
public class Persona {
    private String nombre;
    private String Apellidos;
    private Fecha fnacimiento;
    /**
     * constructor vacio de un objeto persona 
     */
    public Persona() {
    }
    /**
     * Constructor sobrecargado con nombre, apellidos y fecha de nacimiento del objeto persona
     * @param nombre
     * @param Apellidos
     * @param fnacimiento 
     */
    public Persona(String nombre, String Apellidos, Fecha fnacimiento) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.fnacimiento = fnacimiento;
    }
    /**
     * Constructor sobrecargado con nombre y apellidos del objeto persona
     * @param nombre
     * @param Apellidos 
     */
    public Persona(String nombre, String Apellidos) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.fnacimiento = new Fecha (3, 5, 2000);
    }
    
    /**
     * Getter que obtiene el nombre de la persona
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter que establece el nombre de la persona
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter que obtiene el Apellido de la persona
     * @return 
     */
    public String getApellidos() {
        return Apellidos;
    }
    /**
     * Setter que establece el Apellido de la persona
     * @param Apellidos 
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    /**
     * Getter que obtiene la fecha de nacimiento de la persona
     * @return 
     */
    public Fecha getFnacimiento() {
        return fnacimiento;
    }
    /**
     * Setter que establece la fecha de nacimiento de la persona
     * @param fnacimiento 
     */
    public void setFnacimiento(Fecha fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
    /**
     * clase que regresa al lugar solicitado la informacion de nuestra persona
     * @return 
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellidos=" + Apellidos + ", fnacimiento=" + fnacimiento + '}';
    }    
}
