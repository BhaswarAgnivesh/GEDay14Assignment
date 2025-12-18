import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = sc.nextLine();

        System.out.println("Enter your full name:");
        String fullName = sc.nextLine();

        System.out.println("Enter your mobile number (10 digits):");
        String mobile = sc.nextLine();

        // Base message
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please, let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";

        // 1) Replace <<name>> with first name
        message = message.replaceAll("<<name>>", firstName);

        // 2) Replace <<full name>> with full name
        message = message.replaceAll("<<full name>>", fullName);

        // 3) Replace phone pattern 91-xxxxxxxxxx with your number
        //   Here "\\b91-\\d{10}\\b" matches "91-" + 10 digits
        message = message.replaceAll("91-\\d{10}", "91-" + mobile);

        // 4) Replace date in format dd/MM/yyyy
        //   "\\d{2}/\\d{2}/\\d{4}" matches any date like 01/01/2016
        String currentDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        message = message.replaceAll("\\d{2}/\\d{2}/\\d{4}", currentDate);

        // Print the modified message
        System.out.println("\nModified Message:");
        System.out.println(message);

        sc.close();
    }
}
