package myhelpers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	void addNumbersTest1() {
		int actual = calculator.addNumbers(5, 2);
		int expected = 7;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void addNumbersTest2() {		
		int actual = calculator.addNumbers(10, 2);
		int expected = 12;
		
		assertEquals(expected, actual);
	}

}
