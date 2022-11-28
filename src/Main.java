import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // println / print
        System.out.println("Hello world! New line is at the end of the print");
        System.out.print("No new line");
        System.out.print("\n <- new line \t <- tab \n");

        // Variables
        int number1 = 5;
        double number2 = 2.7;
        boolean isTrue = true;
        String sentence = "Band of the hawk";
        char singleChar = 'A';

        System.out.println(number2 + number1); // -> 7.7
        System.out.println("Now: " + number2 + number1); // -> Now: 2.75

        // usually used if we know how many iterations
        for (int i = 1; i < 5; i++) {
            System.out.println("Counting: " + i);
        }

        // usually used if we don't know how many iterations
        while (isTrue){
            if (number1 == 10){
                isTrue = false;
            }
            System.out.println("While loop " + number1);
            number1 ++;
        }

        // usually used if we don't know how many iterations, but we want at least one - even tho isTrue = false
        do {
            System.out.println("Do-while once");
        } while (isTrue);

        // user input:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please tell me an int: ");
        int userInt = scanner.nextInt();
        System.out.println("Your number is: " + userInt);
        // scanner.nextLine(), .nextBoolean, .nextDouble etc.

        // expressions
        if (isTrue == false && number1 > 10){
            System.out.println("Both conditions have to be true - AND logical operator.");
        } else if (!isTrue || number1 > 10) {
            System.out.println("Simplified first condition. At least one of them have to be true - OR logical operator.");
        } else {
            System.out.println("Everything else.");
        }

        // Array - used to store multiple values in a single variable
        // fixed size
        String[] names = new String[3];
        names[0] = "Griffith";
        names[1] = "Guts";
        names[2] = "Judeau";

        String[] names2 = {"Casca", "Pippin", "Corkus"};

        for (String name: names) {
            System.out.println(name);
        }
        for (String name: names2) {
            System.out.println(name);
        }

        /* Array List - a resizable array.
           Elements can be added and removed after compilation phase
           Store reference data types. */

        ArrayList<String> words = new ArrayList<>();
        words.add("test");
        words.add("place");
        words.add("hold");
        words.add("add");

        words.remove("test");

        System.out.println(words.get(0));

        for (String word : words) {
            System.out.println(word);
        }
        words.clear();


    }
}