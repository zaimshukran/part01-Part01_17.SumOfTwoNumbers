
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number: ");
        int input2 = Integer.parseInt(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (input1+input2));
    }
}
