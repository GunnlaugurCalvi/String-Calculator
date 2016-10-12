package Kata;

public class StringCalcTests {
	
	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		else if(numbers.contains(",")){
			String[] numArr = numbers.split(",");
			return toInt(numArr[0]) + toInt(numArr[1]);
		}
		else
			return 1;
	} 

	private static int toInt(String text){
		return Integer.parseInt(text);
	}     
}