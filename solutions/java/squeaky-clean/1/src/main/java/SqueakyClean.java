class SqueakyClean {

    public static String clean(String input) {

        StringBuilder result = new StringBuilder();
        boolean toUpper = false; // for camelCase after '-'

        for (char ch : input.toCharArray()) {

            // 1. Replace spaces with underscore
            if (ch == ' ') {
                result.append('_');
                continue;
            }

            // 2. Handle kebab-case (-)
            if (ch == '-') {
                toUpper = true;
                continue;
            }

            // 3. Convert leetspeak
            if (ch == '4') ch = 'a';
            else if (ch == '3') ch = 'e';
            else if (ch == '0') ch = 'o';
            else if (ch == '1') ch = 'l';
            else if (ch == '7') ch = 't';

            // 4. Apply camelCase (uppercase after '-')
            if (toUpper) {
                ch = Character.toUpperCase(ch);
                toUpper = false;
            }

            // 5. Append only valid characters (letters or underscore)
            if (Character.isLetter(ch) || ch == '_') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}