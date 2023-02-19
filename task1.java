
package dz2;

// 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш
public class task1 {

    public static void main(String[] args) {
        System.out.println(isPalindrom("klutetulk"));
        System.out.println(isPalindrom("klutetul23k"));
    }

    private static boolean isPalindrom(String word) {
        int size = word.length() - 1;
        for (int i = 0; i < size; i++) {
            if (word.charAt(i) != word.charAt(size - i)) {
                return false;
            }
        }
        return true;
    }
}
