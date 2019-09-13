import java.util.Scanner;

public class NameDisplay {
    public static void main(String[] args) {

        //1. need a tool (or object) to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //2. Prompt the user and store the user inputs
        System.out.printf("Enter a colour: ");
        String colour = keyboard.nextLine();

        //3. need to display the user input
        System.out.printf("The %s fox jumped through the %s. He was %n",colour,"meadow");
        System.out.printf("travelling at %d kph.",50);
    }
}
