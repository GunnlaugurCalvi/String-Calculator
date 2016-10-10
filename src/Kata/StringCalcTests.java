package Kata;

public class StringCalcTests {
	
	public static int add(String numbers){
		if(numbers.equals(""))
			return 0;
		else if(numbers.contains(",")){
			String[] numArr = numbers.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		}
		else 
			return 1;
	}
	private static int toInt(String text){
		return Integer.parseInt(text);
	}
	
	
	
	
	
}
	
	
	/*public static void main(String[] args) {
		
		int Add(String numbers){
			String[] numArr = numbers.split(",");
			if(!(numArr.length > 2)){
				for(String n : numArr){
					Integer.parseInt(n);
				}
			}
			else{
				throw new RuntimeException("array length cant include more than one integer and a comma");
			}
			return;
		}
	}/*
