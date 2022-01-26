package pl.merkarol;

public class Solution {

    private int limit;

    public Solution(int limit) {
        this.limit = limit;
    }

    int solutionOfTask() {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        //Square of the sum of digits and call a recursive function that returns the square of digits
        return squares(sum) - returnSumOfTheSquares(0, 0);
    }

    int returnSumOfTheSquares(int numberToSquares, int sum) {
        if (numberToSquares < limit && numberToSquares >= 0) {
            numberToSquares++;
            int number = squares(numberToSquares);
            sum += returnSumOfTheSquares(numberToSquares, number);
        } else if (limit < 0) {
            throw new IllegalArgumentException("Limit must be a natural number!");
        }
        return sum;
    }

    public int squares(int x) {
        return x * x;
    }
}