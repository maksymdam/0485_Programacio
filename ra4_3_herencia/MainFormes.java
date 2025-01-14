package ra4_3_herencia;

public class MainFormes {
    public static void main(String[] args) {
        //EXER 1 - 6
        Formes form1 = new Rodona("Rodonda punta", "negre", "vora fuixa", 3);
        Formes form2 = new Triangle("Triangle superior", "verd", "vora negre",8,8);
        Formes form3 = new Quadrat("Quadrat basel", "Groc", "vora vermella",8);

        //EXER 1
        System.out.println(form1.toString());
        System.out.println();
        System.out.println(form2.toString());
        System.out.println();
        System.out.println(form3.toString());

    }

}
