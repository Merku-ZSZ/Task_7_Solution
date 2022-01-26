package pl.merkarol;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.IllformedLocaleException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void squaresTest() {
        Solution solution = new Solution(10);
        assertEquals(4, solution.squares(2));
    }

    @Test
    void returnSumOfTheSquaresTest() {
        Solution solution = new Solution(10);
        int result = solution.returnSumOfTheSquares(0, 0);
        assertEquals(385, result);
    }

    @Test
    void solutionTaskTest() {
        Solution solution = new Solution(10);
        int result = solution.solutionOfTask();
        assertEquals(2640, result);
    }

    @Test
    void returnSumOfTheSquaresTest_but_limit_is_not_natural_number_should_throw_IllegalArgumentException() {
        Solution solution = new Solution(-20);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> solution.returnSumOfTheSquares(0, 0));
        String expectedMessage = "Limit must be";
        assertTrue(exception.getMessage().contains(expectedMessage));
    }
}