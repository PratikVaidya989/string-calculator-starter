package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	 StringCalculator calculator = new StringCalculator();

    @Test
    void empty_string_should_return_0() throws Exception {
        assertEquals(0, calculator.add(""));
    }
    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        assertEquals(1, calculator.add("1"));
    }
    @Test
    public void addTwoNumberIsSumOfNumbers() throws Exception {
        assertEquals(3, calculator.add("1,2"));
    }
 
}
