import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagramPalindrome {

    public static void main(String[] args) {
        int limit = 1000;
        ArrayList<Integer> primes = new ArrayList<>();
        // primes
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        System.out.println("primes:");
        System.out.println(primes);

        // palindromic primes
        ArrayList<Integer> palindromes = new ArrayList<>();
        for (int p : primes) {
            if (isPalindrome(p)) {
                palindromes.add(p);
            }
        }
        System.out.println("\npalindromic primes:");
        System.out.println(palindromes);

        // anagram pairs
        ArrayList<String> anagramPairs = new ArrayList<>();
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i + 1; j < primes.size(); j++) {
                if (areAnagrams(primes.get(i), primes.get(j))) {
                    anagramPairs.add(primes.get(i) + " " + primes.get(j));
                }
            }
        }
        System.out.println("\nanagram prime pairs:");
        for (String pair : anagramPairs) {
            System.out.println(pair);
        }
    }

    // prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // palindrome
    static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    // anagram
    static boolean areAnagrams(int a, int b) {
        char[] arr1 = Integer.toString(a).toCharArray();
        char[] arr2 = Integer.toString(b).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
