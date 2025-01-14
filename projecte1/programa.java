package projecte1;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();

        char opcio = ' ';
        String nomJugador;
        String idJugador;

        System.out.println("Quin és el nom del mjugador");
        nomJugador = in.nextLine();
        System.out.println("Introdueix el DNI");
        idJugador = in.nextLine();

        jugador nomObj=new jugador(nomJugador, idJugador);

       while(opcio != 'F'){ 
            System.out.println("Menu opció");
            System.out.println("1 - Marca GOL");
            System.out.println("2 - Reb Falta");
            System.out.println("3 - Comet Falta");
            System.out.println("4 - Xuta");
            System.out.println("5 - Xuta Porta");
            System.out.println("6 - Tarjeta Groga");
            System.out.println("7 - Tarjeta Vermella");
            System.out.println("F - Surtir del joc");
            System.out.println("Tria Opcio: ");
            opcio = in.nextLine().charAt(0);

            switch(opcio){
                case '1':
                    nomObj.augmentGol();
                    break;
                case '2':
                    nomObj.augmentRebudes();
                    break;
                case '3':
                    nomObj.augmentComeses();
                    break;
                case '4':
                    nomObj.augmentXuts();
                    break;
                case '5':
                    nomObj.augmentPorta();
                    break;
                case '6':
                    nomObj.augmentGrogues();
                    break;
                case '7':
                    nomObj.augmentVermelles();
                    break;
            }
            System.out.println(nomObj.toString());
       }    
    }
}
