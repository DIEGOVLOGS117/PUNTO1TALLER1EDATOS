package punto1.taller1.edatos;

public class Tiburon extends Pez {

    public Tiburon() {
    }

    public Tiburon(boolean viveEnElMar, String color, int numeroDePatas) {
        super(viveEnElMar, color, numeroDePatas);
    }
    
    @Override
    public void hacerMovimiento() {
        System.out.println("El Tiburo Nada En El Mar");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("El Tiburon No Hace Sonido Se Caracteriza Por Ser Un Pez Silencioso" ); 
    }
    
    @Override
    public boolean tieneDientes() {
        return true;
    }
 
}
