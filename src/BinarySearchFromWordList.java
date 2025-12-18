import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchFromWordList {

    public static void main(String[] args) {
        try {
            File file = new File("src/fruits.txt");
            Scanner fileReader = new Scanner(file);

            String line = "";
            if (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
            }
            fileReader.close();

            String[] words = line.split(",");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].trim().toLowerCase();
            }

            Arrays.sort(words);

            Scanner input = new Scanner(System.in);
            System.out.print("enter word for searc: ");
            String target = input.nextLine().toLowerCase();
            input.close();

            int index = binarySearch(words, target);
            if (index != -1) {
                System.out.println(target + " found");
            } else {
                System.out.println(target + " not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("wrong file");
        }
    }

    // binary search
    public static int binarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = target.compareTo(arr[mid]);
            if (comparison == 0) {
                return mid;
            }
            if (comparison > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}