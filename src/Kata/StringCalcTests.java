package Kata;

public class StringCalcTests {
	
	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		else if(numbers.contains(",")){
			String[] numArr = numbers.split(",");
			if(numArr.length > 2){
				throw new RuntimeException("I only take 2 numbers splitted by a comma!");
			}
			else
				return toInt(numArr[0]) + toInt(numArr[1]);
		}
		else
			return 1;
	} 

	private static int toInt(String text){
		return Integer.parseInt(text);
	}     
}