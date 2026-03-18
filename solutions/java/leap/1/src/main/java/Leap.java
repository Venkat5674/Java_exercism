class Leap {

    boolean isLeapYear(int year) {
        boolean leap_year = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        return leap_year;
    }

}
