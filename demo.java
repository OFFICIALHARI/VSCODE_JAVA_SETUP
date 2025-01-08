import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers from input
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
