package ra4_3_herencia;

public class Quadrat extends Formes {
    
    private int costat;

    public Quadrat(String nom, String colorIntern, String colorVora,int costat){
        super(nom, colorIntern, colorVora);
        this.costat = costat;
    }

    public int getCostat(){
        return this.costat;
    }

    public void setCostat (int costat ){
        this.costat = costat;
    }

    public double areaQuadrat (int costat){
        return costat * costat;
    }

    public String toString(){
        return super.toString()+" \nEl costat és: " + costat + "\nArea Quadrat: " + areaQuadrat(costat);
    }
}
