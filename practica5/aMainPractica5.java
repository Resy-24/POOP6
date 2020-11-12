package practica5;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class aMainPractica5 {
    public static void main(String[] args) {
        aCirculo c1 = new aCirculo();
        aCirculo c2 = new aCirculo(6.0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("Perimetro del circulo 1 = "+c1.perimetro());
        System.out.println("Area del circulo 1 = "+c1.area());
        System.out.println("Perimetro del circulo 2 = "+c2.perimetro());
        System.out.println("Area del circulo 2 = "+c2.area());
        
        System.out.println("*********");
        c1.setRadio(9.0);
        System.out.println("Perimetro del circulo 1 = "+c1.perimetro());
        System.out.println("Area del circulo 1 = "+c1.area());
        
        System.out.println("*********");
        bPersona amigo= new bPersona();
        cfecha fNacimiento = new cfecha(3,4,2002);
        amigo.setNombre("Edgar");
        amigo.setApellido("Romero Martines");
        amigo.setfNacimiento(fNacimiento);
        
        System.out.println("Info de mi amigo: "+amigo.toString());
        System.out.println("Info de mi amigo: "+amigo);
        
        bPersona amigo2 = new bPersona("Raul", "Ayala Barbosa", new cfecha(20,4,1993));
        System.out.println("Info amigo 2: "+amigo2);
        
        bPersona amigo3 = new bPersona("Diego", "Pedraza Peralta");
        System.out.println("Info amigo 3: "+amigo3);
    }
}
