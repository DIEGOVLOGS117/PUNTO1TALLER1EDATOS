package punto1.taller1.edatos;

public abstract class Ave extends AnimalesVertebrados {
    
    private String especie; /* Declaracion de atributos */
    private boolean puedeVolar;
             
    public Ave(){} // constructor vacio
    
    public Ave(String color, String especie, boolean puedeVolar){ // constructor cargado
        super(color,2);
        this.especie = especie;
        this.puedeVolar = puedeVolar;
    }

    public Ave(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public boolean ispuedeVolar(){ // metodo de poder volar o no
        return true;
    }
    
    @Override
    public boolean tieneDientes() { 
        System.out.println("Las Aves Tienen Pico");
        return false;
    }
 
}