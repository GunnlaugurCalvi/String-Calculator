package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class testy {
	
	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumber(){
		assertEquals(3, Calculator.add("1, 2"));
	}
}