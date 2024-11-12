public class JP5 {

    public static void main(String[] args) {
        int someNumber = 10; // Pocetna tacka

        float someFloat = someNumber; // Auto conversion

        System.out.println(someNumber);
        System.out.println(someFloat);

        System.out.println("-"); // Dodata ispravna sintaksa

        // "Manual" Conversion
        double someDouble = 3.14;
        int newIntFromDouble = (int) someDouble;
        float newFloatFromInt = (float) newIntFromDouble;

        System.out.println(someDouble);
        System.out.println(newIntFromDouble);
        System.out.println(newFloatFromInt);
    }
}

//U ovom kodu, someNumber se automatski konvertuje iz int u float,
//a zatim se prikazuju rezultati. Zatim, someDouble se manuelno konvertuje u int,
//a zatim u float, i takođe se prikazuju rezultati tih konverzija.











