import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double average = (num1 + num2) / 2;
        System.out.println("Average of " + num1 + " and " + num2 + " is " + average); 
        scanner.close();
    }
}
