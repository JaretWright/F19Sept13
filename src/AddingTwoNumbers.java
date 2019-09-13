import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args)
    {
        //this defines 2 variables called number1 and number2 that
        //have enough space in memory to hold integers (whole numbers)
        int number1, number2;

        //create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //Prompt the user to enter 2 numbers
        System.out.printf("Enter the first number: ");
        number1 = keyboard.nextInt();

        System.out.printf("Enter the second number: ");
        number2 = keyboard.nextInt();


    }
}
