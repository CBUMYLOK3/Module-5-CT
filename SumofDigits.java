import java.util.Scanner;

public class SumofDigits {
    public static int calculateSumOfDigits(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        } 
        
        else {
            return numbers[index] + calculateSumOfDigits(numbers, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int sum = calculateSumOfDigits(numbers, 0);

        System.out.print("Sum of the entered numbers is: " + sum);
    }
}