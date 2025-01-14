package persona;

public class persona{
    private String nom;
    public String congnom;
    public String dni;
    public int edat;
    public int cmAltura;
    public int kgs;

    public persona(String nom, String dni){
        this.nom = nom;
        this.dni = dni;
    }

    public void setNom(String nombre){
        nom = nombre;
    }

    public String getNom(){
        return nom;
    }
}