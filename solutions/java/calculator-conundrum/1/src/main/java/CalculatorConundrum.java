class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation)
            throws IllegalOperationException {

        // 1. Null check
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        // 2. Empty check
        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        int result;

        try {
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;

                case "*":
                    result = operand1 * operand2;
                    break;

                case "/":
                    result = operand1 / operand2; // ⚠️ may throw ArithmeticException
                    break;

                default:
                    throw new IllegalOperationException(
                        "Operation '" + operation + "' does not exist"
                    );
            }

        } catch (ArithmeticException e) {
            // 3. Convert to custom exception with cause
            throw new IllegalOperationException(
                "Division by zero is not allowed", e
            );
        }

        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}