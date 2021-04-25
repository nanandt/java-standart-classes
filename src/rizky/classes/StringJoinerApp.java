package rizky.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("Bagas");
        joiner.add("Kuncoro");
        joiner.add("Semlehoy");

        String name =  joiner.toString();
        System.out.println(name);

    }
}
