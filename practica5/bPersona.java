package practica5;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 * 
 */
public class bPersona {
    private String Nombre;
    private String Apellido;
    private cfecha fNacimiento;

    public bPersona() {
    }
    
    /**
     * Constructor que recibe 3 parametros
     * @param Nombre Es de tipo String y contiene el nombre de nuestra persona
     * @param Apellido Es de tipo String y contiene el apellido de nuestra persona
     * @param fNacimiento Es una fecha proporcionada por la clase fecha
     */
    public bPersona(String Nombre, String Apellido, cfecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * Cnstructor que recibe 2 parametros
     * @param Nombre es de tipo String y contiene el nombre de nuestra persona
     * @param Apellido es de tipo string y contiene el apellido de nuestra persona
     */
    public bPersona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = new cfecha(3,5,2000);
    }
    
    /**
     * metodo publico getNombre
     * @return retorna el nombre de nuestra persona
     */
    public String getNombre() {
        return Nombre;
    }
    
    /**
     * 
     * @param Nombre 
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /**
     * metodo publico getApellido
     * @return retorna el apellido de nuestra persona
     */
    public String getApellido() {
        return Apellido;
    }
    /**
     * metodo setApellido
     * @param Apellido Contiene el apellido de nuestra persona
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    /**
     * metodo cfecha
     * @return retorna una fecha de nacimiento de nuetra persona
     */
    public cfecha getfNacimiento() {
        return fNacimiento;
    }
    
    /**
     * metodo setfNacimiento
     * @param fNacimiento Asigan el valor de la fecha de nacimiento de nuestra persona a su respectiva variable
     */
    public void setfNacimiento(cfecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * metoso toString
     * @return retorna las variables y sus respectivos valores que contienen en mantala
     */
    @Override
    public String toString() {
        return "bPersona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fNacimiento=" + fNacimiento + '}';
    } 
}
