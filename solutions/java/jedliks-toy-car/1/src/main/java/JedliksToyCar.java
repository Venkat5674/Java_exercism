class JedliksToyCar {

    // Fields (data)
    private int distanceDriven;
    private int batteryPercentage;

    // Private constructor (optional but clean)
    public JedliksToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    // 1. Static method to create a new car
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    // 2. Display distance
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    // 3. Display battery
    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    // 4,5,6. Drive method
    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
}