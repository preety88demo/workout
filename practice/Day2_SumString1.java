package practice;

public class Day2_SumString1 {

	public static void main(String[] args) {
		String text = "asdf1qwer9as8d7";
		char arr[] = text.toCharArray();
		int sum = 0;
		
		for (char c : arr) {
			
			if(Character.isDigit(c)== true) {
				
				sum+= Integer.parseInt(String.valueOf(c));
				
				
				
			}
		
		}
		
		System.out.println("sum of digits : "+ sum);

	}

}
