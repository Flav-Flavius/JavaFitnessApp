package Activities;

public class SwimmingActivity extends Activity {
    private static final String SWIMMING = "Swimming";
    private static final int POOL_LENGTH = 50;
    private static final int BURNT_CALORIES_PER_POOL = 200;
    private int noOfPools = 0;
    public SwimmingActivity(String intensity ) {
        super(intensity, SWIMMING);
    }
    public String askAboutNumberOfPools() {
        return "How many swimming pools did you complete today ?";
    }
    public String provideSwimStatistics() {
        return "You have burnt " + getBurntCalories() + " calories in " + getSwimmingDistance() + " meters swam.";
    }

    public void withNoOfPools(int noOfPools) {
        this.noOfPools = noOfPools;
    }
    public int getBurntCalories() {
        int calories = BURNT_CALORIES_PER_POOL * this.noOfPools;
        return calories;
    }
    public int getSwimmingDistance () {
        int distance = POOL_LENGTH * this.noOfPools;
        return distance;
    }
}
