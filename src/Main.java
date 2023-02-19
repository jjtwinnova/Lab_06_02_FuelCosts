import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Declare variables
        Scanner in = new Scanner(System.in);
        double tank = 0;
        double mpg = 0;
        double price = 0;
        String trash;

        //Get Input and Error Check

        System.out.print("Enter the number of gallons in your tank: ");
        if (in.hasNextDouble()) {
            // OK safe to read in a double
            tank = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        } else {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("You said your tank was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);

        }

        System.out.print("Enter your fuel efficiency in MPG: ");
        if (in.hasNextDouble()) {
            // OK safe to read in a double
            mpg = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        } else {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("You said your mpg was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        System.out.print("Enter the price of gas per gallon: ");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            price = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("You said your price was: "  + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);

        }

        //Calculation and more values
        double distance = tank * mpg;
        double cPer100 = 100 / mpg * price;

        //Output
        System.out.println("You can travel " + distance + " miles, and it costs " + cPer100 + " per 100 miles.");

    }
}