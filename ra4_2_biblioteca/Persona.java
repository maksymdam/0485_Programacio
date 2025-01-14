package ra4_2_biblioteca;

public class Persona {
    
    private String nom;
    private int anyneixement;

    public Persona(String nom, int any){
        this.nom = nom;
        this.anyneixement = any;
    }

    public String toString(){
        return nom + "\n" + anyneixement;
    }
}
