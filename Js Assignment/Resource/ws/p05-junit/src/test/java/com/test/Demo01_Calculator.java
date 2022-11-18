package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.demo.Calculator;
import com.demo.MyException;

public class Demo01_Calculator {
	
	@Test
	public void shouldAdd2Num() {
		Calculator calc = new Calculator();

		int a = 45;
		int b = 21;
		int expectedVal = 66;
		
		int result = calc.add(a, b);
		
//		Assertions.assertTrue(result == expectedVal);
//		Assertions.assertEquals(expectedVal, result);
		Assertions.assertSame(expectedVal, result);
	}

	@Test
	public void shouldAdd3Num() {
		Calculator calc = new Calculator();

		int a = 45;
		int b = 21;
		int c = 21;
		int expectedVal = 87;
		
		int result = calc.add(a, b, c);
		
		Assertions.assertSame(expectedVal, result);
	}

	@Test
	public void shouldAdd5Num() {
		Calculator calc = new Calculator();

		int a = 45;
		int b = 21;
		int c = 21;
		int d = 11;
		int e = -11;
		int expectedVal = 87;
		
		int result = calc.add(a, b, c, d, e);
		
		Assertions.assertSame(expectedVal, result);
	}

	@Test
	public void shouldDiv4By2() throws MyException{
		Calculator calc = new Calculator();

		int a = 4;
		int b = 2;
		int expectedVal = 2;
		
		int result = calc.div(a, b);
		
		Assertions.assertSame(expectedVal, result);
	}

	@Test
	public void shouldNotDiv4By0() throws MyException {
		Calculator calc = new Calculator();

		int a = 4;
		int b = 0;
		
		
		Assertions.assertThrows(MyException.class, ()->{
			calc.div(a, b);
		});
		
	}

}
