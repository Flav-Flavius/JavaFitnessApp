package Activities;

public class RunningActivity extends Activity {
    private final static String RUNNING = "Running";
    private final static int BURNT_CALORIES_PER_KM = 150;
    private final static int STEPS_PER_KM = 1450;
    private int noOfKmRun = 0;
    public RunningActivity(String intensity) {
        super(intensity, RUNNING);
    }

    public String askAboutNumberOfKm() {
        return "How many km did you run today?";
    }

    public void withNoOfKm(int noOfKm) {
        this.noOfKmRun = noOfKm;
    }

    public String provideStatistics() {
        return "You have run " + noOfKmRun + "km, " + "burned " + calculateBurntCalories() + " calories, and made " + calculateTotalSteps() + " steps." ;
    }
    public int calculateBurntCalories() {
        int calories = this.noOfKmRun * BURNT_CALORIES_PER_KM;
        return calories;
    }
    public int calculateTotalSteps() {
        int steps = this.noOfKmRun * STEPS_PER_KM;
        return steps;
    }
}
