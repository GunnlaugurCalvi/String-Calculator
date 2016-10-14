package Kata;

public class StringCalcTests {
	
	public static int add(String numbers){
		
		String deliString = numbers;
		String delimiter = ",|\n";		

		if(numbers.equals("")){
			return 0;
		}

		if(numbers.startsWith("//")){
			int deliIndex = numbers.indexOf("//") + 2;
			delimiter = numbers.substring(deliIndex, deliIndex + 1);
			deliString = numbers.substring(numbers.indexOf("\n") + 1);
		}
		String[] delimiterArr = deliString.split(delimiter + "|\n");
		return getSum(delimiterArr);
		
	} 
	private static int toInt(String text){
		return Integer.parseInt(text);
	}
	private static int getSum(String[] getNumbers){
		int sum = 0;
		for(String n : getNumbers){
			if(toInt(n) <= 1000 && toInt(n) >= 0){			
				sum += toInt(n);
			}
			if(toInt(n) < 0){
				negativeNum(getNumbers);
			}
		}
		return sum;		
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