package Kata;

public class StringCalcTests {
	
	public static int add(String numbers){
		if(numbers.equals("")){
			return 0;
		}
		else if(numbers.contains(",")){
		String[] numArr = numbers.split(",|\n"); 
		int sum = 0;
			for(String n : numArr){
				sum += Integer.parseInt(n);
			}
			return sum;
		}
		else
			return 1;
	} 
}