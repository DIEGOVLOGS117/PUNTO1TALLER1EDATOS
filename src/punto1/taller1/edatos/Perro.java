package punto1.taller1.edatos;

public class Perro extends Mamifero {

    public Perro(String color, int numeroDePatas, String raza, String nombre) {
        super(color, 4, raza, nombre);
        
    }
    
    @Override
    public void hacerMovimiento() {
        System.out.println("El Perro Corre, Camina Y Salta ");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("El Perro Hace Guau Guau Guau Guau!");
    }

    @Override
    public boolean tieneDientes() {
        return true;
    }
      
}