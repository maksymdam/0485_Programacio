package projecte1;

public class jugador {
    private int gols;
    private int rebudes;
    private int xuts;
    private int porta;
    private int comeses;
    private int gorgues;
    private int vermelles;
    private String nom;
    private int dotsal;
    private String dni;
    private String posicio;

    public jugador(String nom,String dni){
        this.nom = nom;
        this.dni = dni;
        rebudes = 0;
        comeses = 0;
        gols = 0;
        xuts = 0;
        porta = 0;
        gorgues = 0;
        vermelles = 0;
    }

    public String getNom(){
        return nom;
    }

    public String getDni(){
        return dni;
    }

    public int getRebudes(){
        return rebudes;
    }

    public void augmentRebudes (){
        rebudes++;
    }

    public int getComeses(){
        return comeses;
    }

    public void augmentComeses (){
        comeses++;
    }

    public int getGols(){
        return gols;
    }

    public void augmentGol (){
        gols++;
    }

    public int getXuts(){
        return xuts;
    }

    public void augmentXuts (){
        xuts++;
    }

    public int getPorta(){
        return porta;
    }

    public void augmentPorta (){
        porta++;
    }

    public int getGrogues(){
        return gorgues;
    }

    public void augmentGrogues (){
        gorgues++;
    }

    public int getVermelles(){
        return vermelles;
    }

    public void augmentVermelles (){
        vermelles++;
    }

    public String toString(){
        String cadena = "";
        cadena = "Nom del\" jugador: " + nom + "\n";
        cadena = cadena  + " DNI: " + dni + "\n";
        cadena = cadena + "\tGols: \t\t\t" + gols+ "\n";
        cadena = cadena + "\tFaltes Comeses: \t" + comeses+ "\n";
        cadena = cadena + "\tFaltes Rebudes: \t" + rebudes+ "\n";
        cadena = cadena + "\tXuts: \t\t\t" + xuts+ "\n";
        cadena = cadena + "\tXuts a Porta: \t\t" + porta+ "\n";
        cadena = cadena + "\tTargetes Grogues: \t" + gorgues+ "\n";
        cadena = cadena + "\tTargetes Vermelles: \t" + vermelles+ "\n";
        return cadena;
    }


}
