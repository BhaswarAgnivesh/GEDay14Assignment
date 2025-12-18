public class Prime {
    public static void main(String[] args) {
        System.out.println("prime numbers between 0 and 1000:");
        for (int i = 2; i <= 1000; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}