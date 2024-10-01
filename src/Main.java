import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age?: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You are eligible for a paper wristband.");
            }
        } else

        {

            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Please re-enter a valid age.");
        }

        in.close();
    }
}