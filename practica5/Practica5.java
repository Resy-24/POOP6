/**
 * Paquete Práctica 5
 */
package practica5;
/**
 *
 * @author Resendiz Cruz Rodrigo Daniel
 */
public class Practica5 {
    public static void main(String[] args) {
        /**
         * creamos dos circulos e imprimimos sus datos
         */
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6.0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("Perimetro de c1:"+c1.perimetro());
        System.out.println("Area de c1: "+c1.area());
        System.out.println("Perimetro de c2:"+c2.perimetro());
        System.out.println("Area de c2: "+c2.area());
        System.out.println("********************************");
        c1.setRadio(9.0);
        System.out.println("Perimetro de c1:"+c1.perimetro());
        System.out.println("Area de c1: "+c1.area());
        
        System.out.println("*******************2");
        /**
         * Creamos tres personas e imprimimos sus datos
         */
        Persona amigo = new Persona();
        Fecha fNacimiento = new Fecha(3, 4, 2002);
        amigo.setNombre("Edgar");
        amigo.setApellidos("Romero Martines");
        amigo.setFnacimiento(fNacimiento);
        System.out.println("Info de mi amigo: "+amigo.toString());
        System.out.println("Info de mi fren: "+amigo);
        System.out.println("fecha de nacimento: "+amigo.getFnacimiento());
        
        Persona amigo2 = new Persona ("Raul", "Ayala Barbosa", new Fecha(20, 4, 1993));
        System.out.println("Info de amigo2: "+amigo2);
        
        Persona amigo3 = new Persona("Diego", "Pedraza Peralta");
        System.out.println("Info amiwo 3: "+amigo3);
    } 
}
