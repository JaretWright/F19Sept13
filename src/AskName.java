import java.util.Scanner;

public class AskName {
    public static void main(String[] args)
    {
        //when defining a variable, you first enter the data
        //type (for example Scanner or String) followed by
        //the objects' name.  Below, keyboard and name are used
        Scanner keyboard = new Scanner(System.in);
        String  name;

        System.out.printf("Enter name: ");
        name = keyboard.nextLine();

        System.out.printf("Hello %s%n", name);
    }
}
