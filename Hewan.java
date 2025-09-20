abstract class Hewan {

    String nama;
    public Hewan (String nama) {
        this.nama = nama;
    }

    //method abstract (wajib diimplementasikan oleh subclass)
    abstract void suara();
    //method biasa
    void info () {
        System.out.println("Nama hewan: " +nama);
    }
}
