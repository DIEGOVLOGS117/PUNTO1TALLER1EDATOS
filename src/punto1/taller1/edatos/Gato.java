package punto1.taller1.edatos;

public class Gato extends Mamifero {
    
    public Gato (){}
    
    public Gato (String color) {
    super (color,4);
    }
    
    @Override
    public void hacerMovimiento(){
        System.out.println("El Gato Camina En Cuatro Patas");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("El Gato Hace Miauuuuuuuu");
    }
    
    @Override
    public boolean tieneDientes(){
        return true;
    }
    
}
