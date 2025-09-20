public class MainSeries {
    public static void main(String[] args) {
        System.out.println("=== DATA DRAMA SERIES ===");
        
        Series drama1 = new Series(); //obejct 1 (default constructor)
        Series drama2 = new Series("stranger Things", 34, 2016);  
        Series drama3 = new Series("The Summer I Turned Pretty", 26, 2022);  
        
        System.out.println("1. Info Basic:");
        drama1.tampilkanInfo(); //method tanpa parameter
        
        System.out.println("2. Info dengan parameter:");
        drama2.tampilkanInfo(false); //method dengan parameter boolean false
        
        System.out.println("4. Info dengan Kategori:");
        drama3.tampilkanInfo(true); // method dengan parameter boolean true
    }
}