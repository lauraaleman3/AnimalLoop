import java.util.Scanner;

public class Madlib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageLimit = 18;
        System.out.println("what is your age");
        int age = Integer.parseInt(input.nextLine());
        if (age < ageLimit) {
            System.out.printf("Sorry you are to young\n");
            System.exit(0);
        } else {
            System.out.println("what is the name?");
            String name = input.nextLine();
            System.out.println("enter an adjective");
            String adjective = input.nextLine();
            System.out.println("Enter a noun");
            String nounOne = input.nextLine();
            System.out.println("enter another noun");
            String nounTwo = input.nextLine();
            System.out.println("Enter your name?");
            String yourName = input.nextLine();
            System.out.println("Enter a number ");
            int number = input.nextInt();
            System.out.printf("Dear %s\n", name);
            System.out.printf("You are %s and I want to be your %s! I want to go to the %s with you in %d days.\n",
                    adjective, nounOne, nounTwo, number);
            System.out.printf("Sincerely, %s\n", yourName);
        }
    }
}