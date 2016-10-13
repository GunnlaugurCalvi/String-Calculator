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
				if(toInt(n) <= 1000 && toInt(n) >= 0){			
					sum += Integer.parseInt(n);
				}
				if(toInt(n) < 0){
					negativeNum(numArr);
				}
			}
			return sum;
		}
		else
			return 1;
	} 
	private static int toInt(String text){
		return Integer.parseInt(text);
	}
	
	private static void negativeNum(String[] negNums){
		String neg = "";
		for(String n : negNums){
			if(toInt(n) < 0){
				neg += n + ",";
			}
		}
		if(!(negNums.equals(""))){
			throw new IllegalArgumentException("Negative not allowed:" + neg);
		}
	}
}