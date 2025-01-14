package projecte1;

public class equip {
    int[] jugadors = new int[5];
    String nom;
    String logo;
    String localitat;
    int id;

    public equip(String nom,String logo,String localitat, int[] jugadors, int id){
        this.jugadors = jugadors;
        this.nom = nom;
        this.logo = logo;
        this.localitat = localitat;
        id = 0;
    }

    public int[] getJugador (){
        return jugadors;
    }

    public String getNom (){
        return nom;
    }

    public String getLogo(){
        return logo;
    }

    public String getLocalitat(){
        return localitat;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        String cadena = "";
        cadena = cadena + "\tNom de l'equip: " + nom + "\n";
        cadena = cadena + "\tLogo de l'equip: " + logo + "\n";
        cadena = cadena + "\tLocalitat de l'equip: " + localitat + "\n";
        cadena = cadena + "\tID de l'equip: " + id + "\n";
        return cadena;
    }
}
