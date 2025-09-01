package punto1.taller1.edatos;

public abstract class Ave extends AnimalesVertebrados {
    
    private String especie;
    
    public Ave(){}
    
    public Ave(String color, String especie){
        super(color,4);
        this.especie = especie;
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
    
    
    
}
