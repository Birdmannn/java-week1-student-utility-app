import java.util.Scanner;

public class StudentUtilityApp {
    public static void main(String[] args) {
        runMenu();
    }

    // The Student Utility App
    public static void runMenu() {
        System.out.println("========== STUDENT UTILITY APP ===========");
        System.out.println("\n");
        System.out.println("What would you like to do?\n");

        Scanner in = new Scanner(System.in);
        int index;
        do {
            printOptions();
            System.out.print("\n Input? ");

            while (true) {
                index = in.nextInt();
                // The index must be a specified range. Handle out of bounds gracefully
                if (index > 0 && index <= 5)
                    break;
                System.out.println("\nInvalid Input. Please input a number between 1 to 5.");
                System.out.print("Input? ");
            }
            try {
                processInput(index);
            } catch (Exception e) {
                System.out.print("An exception occurred whilst processing input.");
                e.printStackTrace();
            }
            System.out.println();
            if (index != 5)
                System.out.println("Choose options:");
        } while (index != 5);

        System.out.println("Thank you for using the app.");
    }

    // A helper method that prints out all the options in the menu
    public static void printOptions() {
        System.out.println("    1. Add two numbers.");
        System.out.println("    2. Check if a number is EVEN or ODD.");
        System.out.println("    3. Print numbers from 1 to N.");
        System.out.println("    4. Display day of the week.");
        System.out.println("    5. Exit.");
    }

    // The core method that handles all options in the menu
    public static void processInput(int index) {
        Scanner in = new Scanner(System.in);
        switch (index) {
            case 1 -> {
                System.out.println("Enter two numbers separated by a space");
                System.out.print("? ");
                String value = in.nextLine();
                System.out.println();
                addTwoNumbers(value);
            }
            case 2 -> {
                System.out.print("Enter a number? ");
                int value = in.nextInt();
                System.out.println();
                evenOrOdd(value);
            }
            case 3 -> {
                System.out.println("Enter two numbers separated by a space");
                System.out.print("? ");
                String value = in.nextLine();
                System.out.println();
                processRange(value);
            }
            case 4 -> {
                System.out.println("Please enter a number between 1 - 7");
                int value = in.nextInt();
                System.out.println();
                processDayOfTheWeek(value);
            }
        }
    }

    // Adds two numbers from a string. Parses the string into two integer values
    public static void addTwoNumbers(String numbers) {
        String[] values = numbers.split(" ");
        assert values.length >= 2 : "Input length is < 2";
        int num1 = Integer.parseInt(values[0]);
        int num2 = Integer.parseInt(values[1]);
        // We disregard any other values gotten in the array
        System.out.printf("The sum of %d and %d is %d", num1, num2, num1 + num2);
        System.out.println();
    }

    // Takes in an integer and prints if that integer is EVEN or ODD
    public static void evenOrOdd(int value) {
        String str = value % 2 == 0 ? "EVEN" : "ODD";
        System.out.println(value + " is an " + str + " number.");
    }

    //  Parses the string into two integer values, and prints out the corresponding range of values
    public static void processRange(String numbers) {
        String[] values = numbers.split(" ");
        assert values.length >= 2 : "Input length is < 2";
        int start = Integer.parseInt(values[0]);
        int end = Integer.parseInt(values[1]);

        for (int i = start; i < end; i++)
            System.out.print(i + ", ");
        System.out.println(end);
    }

    // Processes the day of the week based on the corresponding input argument
    public static void processDayOfTheWeek(int val) {
        String day = switch (val) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(day);
    }
}