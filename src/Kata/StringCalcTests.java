package Kata;

public class StringCalcTests {
	
	public static int add(String numbers){
		
		String[] numArr = numbers.split(",|\n"); 
		if(numbers.equals("")){
			return 0;
		}
		else if(numbers.contains(",")){
		int sum = 0;
			for(String n : numArr){
				if(toInt(n) <= 1000){
					sum += Integer.parseInt(n);
				}
			}
			//negativeNum(numArr);
			return sum;
		}
		else
			return 1;
	} 
	private static int toInt(String text){
		return Integer.parseInt(text);
	}
	
	/*public static void negativeNum(String[] negNums){
		String neg = "";
		for(String n : negNums){
			if(toInt(n) < 0){
				neg += negNums + ",";
			}
		}
		if(!negNums.equals("")){
			throw new IllegalArgumentException("Negatives not allowed:" + neg);
		}
	}*/
}