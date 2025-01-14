package ra4_3_herencia;

public class Rodona extends Formes {
    
    private int radi;
    

    public Rodona (String nom, String colorIntern, String colorVora,int radi){
        super(nom, colorIntern, colorVora);
        this.radi = radi;
    }

    public int getRadi(){
        return this.radi;
    }

    public void setRadi (int radi ){
        this.radi = radi;
    }

    public double areaRadi (int radi){
        return 3.14 * (radi*radi);
    }

    public String toString(){
        return super.toString()+"\nEl radi és: " + radi + " \nArea Radi: " + areaRadi(radi);
    }
}
