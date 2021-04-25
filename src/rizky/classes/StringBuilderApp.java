package rizky.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Hasan");
        builder.append(" ");
        builder.append("Sadily");

        String name = builder.toString();
        System.out.println(name);

        // menggunakan StringBuilder dpt menghemat memori

    }
}
