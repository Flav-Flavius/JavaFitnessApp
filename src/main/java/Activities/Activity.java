package Activities;

public class Activity {
    private final String intensity;
    private final String name;

    public Activity(String intensity, String name) {
        this.intensity = intensity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIntensity() {
        return intensity;
    }


}
