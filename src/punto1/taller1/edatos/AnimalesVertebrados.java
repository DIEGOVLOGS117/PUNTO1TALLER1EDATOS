package punto1.taller1.edatos;

public abstract class AnimalesVertebrados { // clase abstracta ya que no se podra instanciar 

    protected String color;      // atributos privados para que mis clases hijas accedan a mis atributos 
    protected int numeroDePatas;
    
    public AnimalesVertebrados (){} // constructor vacio
    
    public AnimalesVertebrados (String color, int numeroDePatas){  // constructor cargado
        this.color = color;
        this.numeroDePatas = numeroDePatas;      
    }
    
    /* Getters y Setters */

    public String getColor() {  
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    
    public abstract void hacerMovimiento(); /* metodos abstractos */
    public abstract void hacerSonido();
    public abstract boolean tieneDientes();
    
    public void verificarPatas() { /* Metodo validacion de verificador de patas*/
    if(this.numeroDePatas > 0) {
        System.out.println("El Animal Tiene Patas");
    }else {
        System.out.println("El Animal No Tiene Patas");
    }
}  
    
    @Override  /* Override */
    public String toString() {
        return "El animal es de color " + color + " y tiene " + numeroDePatas + " patas.";
    }
    
}