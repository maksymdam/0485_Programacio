package ra4_3_herencia;

public class Formes {
    
    private String nom;
    private String colorIntern;
    private String colorVora;
    private int radi;
    private int base;
    private int alçada;
    private int costat;

    public Formes (String nom, String colorIntern,String colorVora){
        this.nom = nom;
        this.colorIntern = colorIntern;
        this.colorVora = colorVora;
    }

    //EXER 2
    public String getNom(){
        return this.nom;
    }

    public String setNom (String n ){
        return this.nom = n;
    }

    public String getColorIntern(){
        return this.colorIntern;
    }

    public String setColorIntern (String ci ){
        return this.colorIntern = ci;
    }

    public String getColorVora(){
        return this.colorVora;
    }

    public String setColorVora (String cv ){
        return this.colorVora = cv;
    }

    public String toString(){
        return "Nom: " + nom + " \nColor Intern: " + colorIntern + " \nColor Vora" + colorVora;
    }
}
