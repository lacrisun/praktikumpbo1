public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Tesla");

        System.out.println(mobil2.merk);

        Kalkulator calc = new Kalkulator();
        System.out.println(calc.tambah(5, 3));
        System.out.println(calc.tambah(5.5, 3.2));
        System.out.println(calc.tambah("Hello", "World"));
    }
}
