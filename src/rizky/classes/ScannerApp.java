package rizky.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine(); // mengambil tipe data string

        System.out.print("Umur : ");
        Integer age = scanner.nextInt(); // mengambil tipe data integer

        System.out.println("Hello " + name + " Umur anda adalah " + age + " Tahun");

    }

}
