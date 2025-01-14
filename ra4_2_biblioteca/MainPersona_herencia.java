package ra4_2_biblioteca;

public class MainPersona_herencia {
    public static void main(String[] args) {
        Persona person = new Persona("Maksym", 2006);
        Treballador treb = new Treballador("Gerard", 2001, "Profe", 3400);

        System.out.println(person.toString());
        System.out.println();
        System.out.println(treb.toString());
    }
}
