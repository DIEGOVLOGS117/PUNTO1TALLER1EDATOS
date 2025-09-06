package punto1.taller1.edatos;

public abstract class Mamifero extends AnimalesVertebrados {
    
    protected String raza;
    protected String nombre;
    
    public Mamifero(){}
    
    public Mamifero (String color, int numeroDePatas, String raza, String nombre) {
    super(color,4);
    this.raza = raza;
    this.nombre = nombre;
}

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", nombre=" + nombre + '}';
    }
     
}