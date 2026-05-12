class RaindropConverter {

    String convert(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Pling");
        }

        if (number % 5 == 0) {
            result.append("Plang");
        }

        if (number % 7 == 0) {
            result.append("Plong");
        }

        // If not divisible by 3, 5, or 7
        if (result.length() == 0) {
            return String.valueOf(number);
        }

        return result.toString();
    }
}