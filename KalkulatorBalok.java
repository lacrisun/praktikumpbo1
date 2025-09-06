import java.util.Scanner;

public class KalkulatorBalok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("##### KALKULATOR BANGUN RUANG #####");
        System.out.print("Panjang Balok (cm) : ");
        double panjang = sc.nextDouble();
        System.out.print("Lebar Balok (cm) : ");
        double lebar = sc.nextDouble();
        System.out.print("Tinggi Balok (cm) : ");
        double tinggi = sc.nextDouble();

        // Menghitung keliling balok (K = 4 * (p + l + t);)
        double kelilingBalok = 4 * (panjang + lebar + tinggi);

        // Menghitung luas permukaan balok (L = 2 * ((p * l) + (p * t) + (l * t));)
        double luasBalok = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        // Menghitung volume balok (V = p * l * t)
        double volumeBalok = panjang * lebar * tinggi;

        // Menampilkan output
        System.out.printf("## Informasi Balok ##%nPanjang : %.1f cm%nLebar : %.1f cm%nTinggi : %.1f cm%n", panjang, lebar, tinggi);

        System.out.println("Keliling Balok : " + kelilingBalok + " cm");
        System.out.println("Luas Balok : " + luasBalok + " cm\u00B2");
        System.out.println("Volume Balok : " + volumeBalok + " cm\u00B3");
    }
}
