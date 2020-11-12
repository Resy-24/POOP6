package practica5;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class dMainCarro {
    
    public static void main(String[] args) {
        dCarro carro1 = new dCarro();
        carro1.setColor("Gris");
        carro1.setModelo("Vento");
        carro1.setPrecio(130000);
        carro1.setPlaca("HZP-M8956");
        System.out.println("Info carro 1: "+carro1.toString());
        
        dCarro carro2 = new dCarro("Blanco", 200000, "Spyder Lamborgini", "NFZ-N2212");
        System.out.println("Info carro 2: "+carro2.toString());
    }
}