package persona;

public class programa {
    public static void main(String[] args) {
        //persona[] objectePerson = new persona[6];
        persona objectePersona = new persona("Abdul","445433X");


        System.out.println();
        // for(int i = 0; i < objectePerson.length;i++){
        //     objectePerson[i] = new persona();
        //     objectePerson[i].edat =i+18;

        //     System.out.println("L'edat de la persona: " + i + " és: " + objectePerson[i].edat);
        // }

        // objectePersona.setNom("Abdul");
        System.out.println("El nom és: " + objectePersona.getNom());

    }
}
