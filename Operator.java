public class Operator {
    public static void main(String[] args) {

        int a = 6, b = 7;

        // 1. Operasi Aritmatika
        System.out.println("a + b = " + (a + b)); // Penjumlahan : 13
        System.out.println("a - b = " + (a - b)); // Pengurangan : -1
        System.out.println("a * b = " + (a * b)); // Perkalian : 42
        System.out.println("a / b = " + (a / b)); // Pembagian : 0
        System.out.println("a % b = " + (a % b)); // Modulus : 6

        System.out.println("++a = " + (++a)); // Pre-increment : 7
        System.out.println("b-- = " + (b--)); // Post-decrement : 7, b = 6


        // 2. Operasi Perbandingan
        int c = 4, d = 1;
        System.out.println("c == d : " + (c == d)); // false
        System.out.println("c != d = " + (c != d)); // true
        System.out.println("c > d = " + (c > d)); // true
        System.out.println("c < d = " + (c < d)); // false
        System.out.println("c >= d = " + (c >= d)); // true
        System.out.println("c <= d = " + (c <= d)); // false


        // 3. Operasi Logika
        boolean p = true, q = false;

        System.out.println("p && q : " + (p && q)); // AND : false
        System.out.println("p || q : " + (p || q)); // OR : true
        System.out.println("!p : " + (!p));         // NOT : false

        // Short-circuit evaluation
        int e = 5, f = 0;
        boolean result = (f != 0) && (e / f > 2);   // Tidak error karena short-circuit
        System.out.println("Hasil : " + result);    // false


        // 4. Operator Assignment
        int num = 10;

        num += 5; // num = num + 5; // 15
        num -= 3; // num = num - 3; // 12
        num *= 2; // num = num * 2; // 24
        num /= 4; // num = num / 4; // 6
        num %= 4; // num = num % 4; // 2
        System.out.println("Hasil akhir : " + num); // 2


        // 5. Operator Ternary
        int score = 85;
        String grade = (score >= 80) ? "A" : (score >= 70) ? "B" : "C";
        System.out.println("Nilai : " + grade);

        // Penggunaan untuk mencari nilai maximum
        int max = (10 > 5) ? 10 : 5;
        System.out.println("Maximum : " + max);

        // 6. Operator Bitwise
        int g = 12; // 1100 dalam biner
        int h = 10; // 1010 dalam biner

        System.out.println("g & h = " + (g & h));   // AND : 8 (1000)
        System.out.println("g | h = " + (g | h));   // OR : 14 (1110)
        System.out.println("g ^ h = " + (g ^ h));   // XOR : 6 (0110)
        System.out.println("~g = " + (~g));         // NOT : -13
        System.out.println("g << 2 = " + (g << 2)); // Left shift : 48
        System.out.println("g >> 2 = " + (g >> 2)); // Right shift : 3
    }
}
