import Activities.RunningActivity;
import Activities.SwimmingActivity;

import java.util.Scanner;


public class Main {
    public static final String APP_NAME = "FitnessApp";
    public static final String APP_LABEL = "- = " + APP_NAME + " = -";

    private static final Display display = new Display();

    private static Scanner in;

    public static void main(String[] args) {
        Person user = greetUser();
        in = authenticateUser(user);
        if (in == null)
            return;
        display.showActivityMenu();
        String userAnswer = interrogateUser(in);
        chooseActivity(userAnswer);
        display.showAdditionalActivityMenu();
        userAnswer = interrogateUser(in);
        while (userAnswer.equalsIgnoreCase("yes")) {
            display.showActivityMenu();
            userAnswer = interrogateUser(in);
            chooseActivity(userAnswer);
            display.showAdditionalActivityMenu();
            userAnswer = interrogateUser(in);
       //     if (userAnswer.equalsIgnoreCase("no")) {
       //         break;
        //    }
        }
        display.goodbyeMessage();
    }


    private static String interrogateUser(Scanner scanner) {
        return scanner.nextLine();
    }

    private static void chooseActivity(String activity) {
        switch (activity) {
            case "1": {
                SwimmingActivity swimming = new SwimmingActivity("light");
                display.printChosenActivity(swimming);
                display.printMessage(swimming.askAboutNumberOfPools());
                String userInput = interrogateUser(in);
                int noOfPools = Integer.parseInt(userInput);
                swimming.withNoOfPools(noOfPools);
                display.printMessage(swimming.provideSwimStatistics());
                break;
            }
            case "2": {
                RunningActivity running = new RunningActivity("light");
                display.printChosenActivity(running);
                display.printMessage(running.askAboutNumberOfKm());
                String userInput = interrogateUser(in);
                int noOfKm = Integer.parseInt(userInput);
                running.withNoOfKm(noOfKm);
                display.printMessage(running.provideStatistics());
                break;
            }
            case "3": {
                System.out.println("You have chosen Dancing from the FitnessApp menu.");
                break;
            }
            case "4": {
                System.out.println("You have chosen Cycling from the FitnessApp menu.");
                System.out.println("What type of Cycling would you like to do?");
                System.out.println("1. Outdoor Cycling");
                System.out.println("2. Indoor Cycling");
                System.out.println("3. Spinning Cycling");
                System.out.println("4. Soul  Cycling");
                break;
            }
            case "5": {
                System.out.println("You have chosen Fitness from the FitnessApp menu.");
                break;
            }
            case "6": {
                System.out.println("You have chosen Yoga from the FitnessApp menu.");
                break;
            }
            default:
                System.out.println("Sorry I don't understand your choice.");
        }
    }


    private static Scanner authenticateUser(Person user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your PIN number: ");
        String pinCode = interrogateUser(scanner);
        if (!user.getPinCode().equals(pinCode)) {
            System.out.println("Wrong pin");
            return null;
        }
        System.out.println("Successfully logged in. ");
        return scanner;
    }

    private static Person greetUser() {
        display.printAppName();
        Scanner scanner = new Scanner(System.in);
        display.askUserForName();
        String name = interrogateUser(scanner);
        Person user = new Person(name, "Cenuse", "other", "186000000001", "9999", "5444");
        display.greetKnownUser(user);
        return user;
    }


}
