package punto1.taller1.edatos;

public class PUNTO1TALLER1EDATOS {

    public static void main(String[] args) {
        
    /* Instancia del gato*/    
    
    Gato gatico = new Gato("Negro", "Felidae", "Simon"); 
    System.out.println(" ------ Gato ------");
    System.out.println("Nombre: " + gatico.getNombre());
    System.out.println("Color: " + gatico.getColor());
    gatico.hacerMovimiento();
    gatico.hacerSonido();
    gatico.verificarPatas();
    System.out.println("Tiene Dientes?: " + (gatico.tieneDientes() ? "Si" : "No"));
    
    /* Instancia del perro*/       
        
    Perro perrito = new Perro("Dorado", 4, "Labrador", "Toby");
    System.out.println(" ------ Perro ------");
    System.out.println("Nombre: " + perrito.getNombre());
    System.out.println("Color: " + perrito.getColor());
    perrito.hacerMovimiento();
    perrito.hacerSonido();
    perrito.verificarPatas();
    System.out.println("Tiene Dientes?: " + (perrito.tieneDientes() ? "Si" : "No"));    
      
    /* Instancia del gallo*/  
    Gallo gallito = new Gallo("Rojo Con Blanco", "Ave de Corral", true);
    System.out.println(" ------ Gallo ------");
    System.out.println("Color: " + gallito.getColor());
    gallito.hacerMovimiento();
    gallito.hacerSonido();
    gallito.verificarPatas();
    System.out.println("Tiene Dientes?: " + (gallito.tieneDientes() ? "Si" : "No"));    
    
    /* Instancia del pato*/  
    Pato patico = new Pato("Blanco", "Anade Real", true);
    System.out.println(" ------ Pato ------");
    System.out.println("Color: " + patico.getColor());
    patico.hacerMovimiento();
    patico.hacerSonido();
    patico.verificarPatas();
    System.out.println("Tiene Dientes?: " + (patico.tieneDientes() ? "Si" : "No"));    
    
    /* Instancia del tiburon*/  
    Tiburon tiburoncito = new Tiburon(true, "Gris", 0);
    System.out.println(" ------ Tiburon ------");
    System.out.println("Color: " + tiburoncito.getColor());
    tiburoncito.hacerMovimiento();
    tiburoncito.hacerSonido();
    tiburoncito.verificarPatas();
    System.out.println("Tiene Dientes?: " + (tiburoncito.tieneDientes() ? "Si" : "No")); 
    
    /* Instancia del bocachico*/  
    Bocachico bocachiquito = new Bocachico(false, "Plateado", 0);
    System.out.println(" ------ Bocachico ------");
    System.out.println("Color: " + bocachiquito.getColor());
    bocachiquito.hacerMovimiento();
    bocachiquito.hacerSonido();
    bocachiquito.verificarPatas();
    System.out.println("Tiene Dientes?: " + (bocachiquito.tieneDientes() ? "Si" : "No"));
              
    }
    
}   