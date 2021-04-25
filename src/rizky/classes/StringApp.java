package rizky.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Muhamad Fatikhurrizky";
        String lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Muhamad"));
        System.out.println(name.endsWith("Fatikhurrizky"));

        String[] names = name.split(" ");
        for(var value:names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(3));

        char[] chars = name.toCharArray();
    }
}
