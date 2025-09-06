package punto1.taller1.edatos;

public class Pato extends Ave {

    public Pato() {
    }

    public Pato(String color, String especie, boolean puedeVolar) {
        super(color, "Anade Real", puedeVolar);
    }
    
    @Override
    public boolean ispuedeVolar(){
        return true;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("El Pato hace: ¡Cuac Cuac Cuac Cuac !");
    }

    @Override
    public void hacerMovimiento() {
        System.out.println("El Pato Camina, Nada Y Vuela");
    }
    
    @Override
    public boolean tieneDientes() {      
    System.out.println("El Pato Tiene Pico");    
    return false;  
    }

}
