package rizky.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10000";

        String contoh2 = "100.10";

        Integer contohInt = Integer.valueOf(contoh); // valueOf digunakan utk tipe data non primitif
        System.out.println(contohInt);

        int contohNonPrimitif = Integer.parseInt(contoh); // parseInt digunakan utk tipe data primitif
        System.out.println(contohNonPrimitif);

        Double contohDouble = Double.valueOf(contoh2);
        System.out.println(contohDouble);



    }
}
