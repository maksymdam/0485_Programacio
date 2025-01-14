package ra4_2_biblioteca;

public class Biblioteca {

    private Llibre[] biblio = new Llibre[50];

    public void afegirLlibre(Llibre llibre){

        int lloc = espaiBuit();
        if(lloc >= 0){
            biblio[lloc] = llibre;
        } else {
            System.out.println("No hi ha lloc a la biblioteca");
        }
    }
    
    public void infoBiblio(){
        int contador = 0;
        String informacio = " ";
        for (int i = 0; i < biblio.length;i++){
            if(biblio[i] != null){
                contador++;
                informacio = "Posició: " +i+" Llibre: " + biblio[i].getTitol();
            }
        }
    }

    private int espaiBuit(){
        for(int i = 0; i < biblio.length;i++){
            if(biblio[i] == null) 
            return i;
        }
        return -1;
    }
}
