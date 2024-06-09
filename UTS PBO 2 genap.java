import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    // Method untuk memeriksa apakah dua string adalah anagram
    public static boolean isAnagram(String str1, String str2) {
        // Menghapus semua spasi dan mengubah string ke huruf kecil
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        
        // Jika panjang kedua string tidak sama, bukan anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Mengubah string ke array karakter dan mengurutkan array tersebut
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Memeriksa apakah array karakter yang diurutkan sama
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan string pertama: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Masukkan string kedua: ");
        String str2 = scanner.nextLine();
        
        // Memeriksa apakah kedua string adalah anagram
        boolean result = isAnagram(str1, str2);
        
        // Menampilkan hasil
        if (result) {
            System.out.println("Kedua string tersebut adalah anagram.");
        } else {
            System.out.println("Kedua string tersebut bukan anagram.");
        }

        scanner.close();
    }
}
