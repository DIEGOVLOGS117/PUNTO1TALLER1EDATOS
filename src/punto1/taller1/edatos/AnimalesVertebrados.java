package punto1.taller1.edatos;

public abstract class AnimalesVertebrados {

    protected String color;
    protected int numeroDePatas;
    
    public AnimalesVertebrados (){} // constructor vacio
    
    public AnimalesVertebrados (String color, int numeroDePatas){  // constructor cargado
        this.color = color;
        this.numeroDePatas = numeroDePatas;      
    }
    
    /* getters y setters */
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int numeroDePatas() {
        return numeroDePatas;
    }

    public void numeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    
    public abstract void hacerMovimiento();
    public abstract void hacerSonido();
    
    public void verificarPatas() {
    if(this.numeroDePatas > 0) {
        System.out.println("El Animal Tiene Patas");
    }else {
        System.out.println("El Animal No Tiene Patas");
    }
}  
    
}