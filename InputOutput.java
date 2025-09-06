import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Print per baris
        System.out.println("Hello World");
        System.out.println("Baris Kedua");

        // Print dalam satu baris
        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

        // Formatted output
        String nama = "Gusti";
        int umur = 19;
        double tinggi = 176.2;

        System.out.printf("Nama: %s, Umur: %d, Tinggi: %.1f cm%n", nama, umur, tinggi);

        // Input dengan scanner
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        // Input integer
        System.out.print("Masukkan umur: ");
        int umurAnda = scanner.nextInt();

        // Input double
        System.out.print("Masukkan tinggi badan: ");
        double tinggiBadan = scanner.nextDouble();
    }
}
