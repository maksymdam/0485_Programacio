package ra4_3_herencia;

public class Triangle extends Formes {
    private int base;
    private int alçada;

    public Triangle(String nom, String colorIntern, String colorVora,int base, int alçada){
        super(nom, colorIntern, colorVora);
        this.base = base;
        this.alçada = alçada;
    } 

    public int getBase(){
        return this.base;
    }

    public void setBase (int base ){
        this.base = base;
    }

    public int getAlçada(){
        return this.alçada;
    }

    public void setAlçada (int alçada ){
        this.alçada = alçada;
    }

    public double areaTriangle(int base, int alçada){
        return (base*alçada)/2;
    }

    public String toString(){
        return super.toString()+"\nLa base és: " + base + "\nL'alçada és: " + alçada + "\nL'Area del Triangle: " + areaTriangle(base, alçada);
    }
}
