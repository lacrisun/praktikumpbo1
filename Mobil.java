public class Mobil {
    //Atribut
    public String merk;
    public String warna;
    public int tahun;
    public double harga;

    //Constructor 1 : Default
    public Mobil () {
        this.merk = "unknown";
        this.warna = "Putih";
        this.tahun = 2023;
        this.harga = 0.0;
    }

    //constructor 2 : dengan merk saja
    public Mobil (String merk) {
        this.merk = merk;
        this.warna = "Putih";
        this.tahun = 2023;
        this.harga = 0.0;
    }

    //method
    public void nyalakanMesin() {
        System.out.println("Mesin dinyalakan");
    }

    public void matikanMesin() {
        System.out.println("Mesin dimatikan");
    }
}