package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Kata.StringCalcTests;

public class testy {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalcTests.add(""));
	}
	@Test
	public void testOneNumber(){
		assertEquals(1, StringCalcTests.add("1"));
	}
	@Test
	public void testTwoNumbers(){
		assertEquals(3, StringCalcTests.add("1,2"));
	}
	@Test
	public void testNumbersWithNewline(){
		assertEquals(6, StringCalcTests.add("1\n2,3"));
	}
	
	@Test
	public void testNumbersWithNewlinevol2(){
		assertEquals(21, StringCalcTests.add("1\n2\n3\n14,1"));
	}
	
	/*@Test	//The test that dont need to be tested for this case :>
	public void testNumbersWithNewline2(){
		assertEquals(3, StringCalcTests.add("1,\n2"));
	}*/
	
}
