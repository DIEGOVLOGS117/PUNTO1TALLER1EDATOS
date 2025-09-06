package punto1.taller1.edatos;

public class Bocachico extends Pez {

    public Bocachico() {
    }

    public Bocachico(boolean viveEnElMar, String color, int numeroDePatas) {
        super(viveEnElMar, color, numeroDePatas);
    }
    
    @Override
    public boolean isViveEnElMar() {
        return false;
    }

    @Override
    public void hacerMovimiento() {
        System.out.println("El Bocachico Nada En Aguas Dulces");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El Bocachico No Emite Sonidos, Pero Segun Pescadores Similar A Un Ronquido");
    }

    @Override
    public boolean tieneDientes() {
        return true;
    }
    
}
