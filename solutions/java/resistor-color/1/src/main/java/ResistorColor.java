import java.util.Arrays;

class ResistorColor {

    // Array containing the colors in order, where the index matches the color's value
    private final String[] colors = {
        "black", "brown", "red", "orange", "yellow", 
        "green", "blue", "violet", "grey", "white"
    };

    /**
     * Looks up the numerical value associated with a particular color band.
     * * @param color The name of the color as a String
     * @return The integer value associated with that color
     */
    int colorCode(String color) {
        // Convert the array to a List so we can easily find the index of the requested color
        return Arrays.asList(colors).indexOf(color);
    }

    /**
     * Lists the different band colors in their correct order.
     * * @return An array of strings containing all the colors
     */
    String[] colors() {
        return colors;
    }
}