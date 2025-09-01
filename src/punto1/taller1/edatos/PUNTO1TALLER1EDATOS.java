package punto1.taller1.edatos;

public class PUNTO1TALLER1EDATOS {

    public static void main(String[] args) {
        
        AnimalesVertebrados gatico = new Gato ("GRIS");
        
        gatico.hacerMovimiento();
        gatico.hacerSonido();
        System.out.println("El Gato Tiene Dientes?" + gatico.tieneDientes());
    }
    
}   

