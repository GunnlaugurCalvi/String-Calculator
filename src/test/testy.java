package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
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
	

	@Test 
	public void testBigNumbers(){
		assertEquals(2, StringCalcTests.add("1001,2"));
	}
	@Test 
	public void testBigNumbersvol(){
		assertEquals(999, StringCalcTests.add("1337,999"));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testNegativeNumber(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Negative not allowed:-1");
		StringCalcTests.add("-1,2");
	}
	@Test
	public void testNegativeNumbers(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Negative not allowed:-4,-5");
		StringCalcTests.add("2,-4,3,-5");
	}
	@Test
	public void testNegativeNumbersvol2(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Negative not allowed:-1");
		StringCalcTests.add("-1,2");
	}
	@Test
	public void testIfSupportDelimiter() {
		assertEquals(3, StringCalcTests.add("//;\n1;2"));
	}
	@Test
	public void testIfSupportDelimitervol2() {
		assertEquals(98, StringCalcTests.add("//;\n53;23;3;19"));
	}
	@Test
	public void testDelimiterWithNegatives() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Negative not allowed:-2,-69");
		StringCalcTests.add("//;\n-2;7\n-69\n4");
	}
}
