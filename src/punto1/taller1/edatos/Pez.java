package punto1.taller1.edatos;

public abstract class Pez extends AnimalesVertebrados {
    
    protected boolean viveEnElMar;

    public Pez() {
    }

    public Pez(boolean viveEnElMar, String color, int numeroDePatas) {
        super(color, numeroDePatas);
        this.viveEnElMar = viveEnElMar;
    }

    public boolean isViveEnElMar() {
        return viveEnElMar;
    }  
    
}
