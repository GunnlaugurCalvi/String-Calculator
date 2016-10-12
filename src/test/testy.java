package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import Kata.StringCalcTests;

public class testy {
	
	@Test
	public void testEmptyString(){
		assertEquals(0, StringCalcTests.add(""));
	}
	/*@Test
	public void testOneNumber(){
		assertEquals(1, StringCalcTests.add("1"));
	}
	@Test
	public void testTwoNumber(){
		assertEquals(3, StringCalcTests.add("1, 2"));
	}*/
}
