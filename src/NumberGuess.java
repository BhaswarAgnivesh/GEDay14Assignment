import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a power of 2: ");
        int N = sc.nextInt();
        sc.nextLine();

        System.out.println("think between 0 and " + (N - 1));

        int low = 0;
        int high = N - 1;
        int ques = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            ques++;

            System.out.println("number = " + mid + "?");
            String guess = sc.nextLine().trim();

            if (guess.equalsIgnoreCase("y")) {
                System.out.println("correct number = " + mid);
                System.out.println("no of questions: " + ques);
                break;
            } else {
                System.out.println("is number greater than " + mid + "?");
                String higher = sc.nextLine().trim();

                if (higher.equalsIgnoreCase("y")) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        sc.close();
    }
}
