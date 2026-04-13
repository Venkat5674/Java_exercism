class DifferenceOfSquaresCalculator {

    // Calculates: (1 + 2 + ... + N)^2
    int computeSquareOfSumTo(int input) {
        int sum = (input * (input + 1)) / 2;
        return sum * sum;
    }

    // Calculates: 1^2 + 2^2 + ... + N^2
    int computeSumOfSquaresTo(int input) {
        return (input * (input + 1) * (2 * input + 1)) / 6;
    }

    // Calculates the final difference
    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}