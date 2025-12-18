public class InsertionSort {
    public static void main(String[] args) {
        String[] words = {"hello","hi","ahoy","bro","sup"};

        for (int i = 1; i < words.length; i++) {
            String current = words[i];
            int j = i - 1;

            //shiftng elements that are greater than current to right
            while (j >= 0 && words[j].compareTo(current) > 0) {
                words[j + 1] = words[j];
                j--;
            }
            words[j + 1] = current;
        }

        System.out.println("sorted: " + java.util.Arrays.toString(words));
    }
}