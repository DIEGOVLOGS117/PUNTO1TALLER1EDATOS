package punto1.taller1.edatos;

public abstract class AnimalesVertebrados {
    
    protected String color;
    protected int numerodepatas;
    
    public AnimalesVertebrados (){}
    
    public AnimalesVertebrados (String color, int numerodepatas){
        this.color = color;
        this.numerodepatas = numerodepatas;      
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumerodepatas() {
        return numerodepatas;
    }

    public void setNumerodepatas(int numerodepatas) {
        this.numerodepatas = numerodepatas;
    }
    
    
}
