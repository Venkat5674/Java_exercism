class BirdWatcher {

    private int[] birdsPerDay;

    // Constructor
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    // 1. Last week's data
    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    // 2. Get today's count
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // 3. Increment today's count
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    // 4. Check if any day had zero birds
    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    // 5. Count birds for first N days
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);

        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }

        return sum;
    }

    // 6. Count busy days (>= 5 birds)
    public int getBusyDays() {
        int count = 0;

        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                count++;
            }
        }

        return count;
    }
}