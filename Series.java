public class Series {
    //atribut
    public String judul;
    public int jumlahEpisode;
    public int tahunRilis;
    
    // constructor default
    public Series() {
        this.judul = "unknown";
        this.jumlahEpisode = 0;
        this.tahunRilis = 0;
    }
    
    //constructor 2 (dengan 3 parameter)
    public Series(String judul, int jumlahEpisode, int tahunRilis) {
        this.judul = judul;
        this.jumlahEpisode = jumlahEpisode;
        this.tahunRilis = tahunRilis;
    }
    
    //method 1 (tampilkan info basic)
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Jumlah Episode: " + jumlahEpisode);
        System.out.println("Tahun Rilis: " + (tahunRilis == 0 ? "Tidak diketahui" : tahunRilis));
        System.out.println("-------------------");
    }
    
    //method 2 (tampilkan info dengan kategori)
    public void tampilkanInfo(boolean showKategori) {
        tampilkanInfo();
        if (showKategori) {
            String kategori;
            if (jumlahEpisode <= 10) {
                kategori = "Mini Series";
            } else if (jumlahEpisode <= 16) {
                kategori = "Series Standar";
            } else {
                kategori = "Series Panjang";
            }
            System.out.println("Kategori: " + kategori);
            System.out.println("-------------------");
        }
    }
}