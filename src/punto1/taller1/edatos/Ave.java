package punto1.taller1.edatos;

public abstract class Ave extends AnimalesVertebrados {
    
    private String especie;
    
    public Ave(){}
    
    public Ave(String color, String especie){
        super(color,0);
        this.especie = especie;
    }
    
    
    
}
