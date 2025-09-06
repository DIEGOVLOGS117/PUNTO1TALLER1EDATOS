package punto1.taller1.edatos;

public class Gato extends Mamifero {
    
    public Gato (){}
    
    public Gato (String color, String raza, String nombre) {
    super (color,4,raza,nombre);
    }
    
    @Override
    public void hacerMovimiento(){
        System.out.println("El Gato Camina En Cuatro Patas, Camina Y Salta ");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("El Gato Hace ¡Miauuuuuuuu!"); 
    }
    
    @Override
    public boolean tieneDientes(){
        return true;
    }
    
}