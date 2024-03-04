import Activities.Activity;

public class Display {
    public   void printAppName() {
        System.out.println(Main.APP_LABEL);
    }

    public void askUserForName() {
        System.out.println("What is your name ?");
    }

    public void greetKnownUser(Person user) {
        System.out.println("Welcome to the " + Main.APP_NAME + " " + user.getFullName() + "  !");
    }

    public void showActivityMenu() {
        System.out.println("What would you like to do today?");
        System.out.println("1. Swimming");
        System.out.println("2. Running");
        System.out.println("3. Dancing");
        System.out.println("4. Cycling");
        System.out.println("5. Fitness");
        System.out.println("6. Yoga");
    }
    public void showAdditionalActivityMenu() {
        System.out.println("Would you like to add additional activities?");
        System.out.println("Yes");
        System.out.println("No");
    }

    public void printChosenActivity(Activity activity) {
        System.out.println("You have chosen " + activity.getName() + " from the FitnessApp menu.");
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
    public void goodbyeMessage() {
        System.out.println("Bye, come back tomorrow.");
    }
}
