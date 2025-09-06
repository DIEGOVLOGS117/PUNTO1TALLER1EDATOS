package punto1.taller1.edatos;

public class Gallo extends Ave{

    public Gallo() {
    }

    public Gallo(String color, String especie, boolean puedeVolar) {
        super(color, "Ave De Corral", puedeVolar);
    }
    
    @Override
    public boolean ispuedeVolar(){
        return true;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("El gallo hace: ¡Kikirikí!");
    }

    @Override
    public void hacerMovimiento() {
        System.out.println("El Gallo Camina Y Vuela Cortas Distancias");
    }
    
    @Override
    public boolean tieneDientes() {
    System.out.println("Los Gallos Tienen Pico");
    return false;
    }

}
