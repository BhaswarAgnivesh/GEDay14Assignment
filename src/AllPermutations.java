public class AllPermutations {
    public static void main(String[] args) {
        permutation("123", "");
    }

    private static void permutation(String s, String result) {
        if (s.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            permutation(remaining, result + current);
        }
    }
}