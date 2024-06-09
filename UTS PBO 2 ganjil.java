import java.util.Scanner;

public class PalindromeChecker {
    // Method untuk memeriksa apakah sebuah string adalah palindrome
    public static boolean isPalindrome(String str) {
        // Menghapus semua spasi dan mengubah string ke huruf kecil
        str = str.replaceAll("\\s+", "").toLowerCase();
        int length = str.length();

        // Memeriksa string dari depan dan belakang
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan sebuah string: ");
        String input = scanner.nextLine();
        
        // Memeriksa apakah string adalah palindrome
        boolean result = isPalindrome(input);
        
        // Menampilkan hasil
        if (result) {
            System.out.println("String tersebut adalah palindrome.");
        } else {
            System.out.println("String tersebut bukan palindrome.");
        }

        scanner.close();
    }
}
