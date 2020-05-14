package practice;

public class Day2_SumString2 {

	public static void main(String[] args) {

		String s= "asdf1qwer9as8d7";
		
		// Convert String to Character
		char[] charArray=s.toCharArray();
		int sum=0;
		
		for(int i=0 ; i<charArray.length;i++) {
			if(charArray[i]>=48 && charArray[i]<=57) {
				sum=sum+Character.getNumericValue(charArray[i]);
				
			}
		}
		
		System.out.println("The sum of numbers in the given string is :"+sum);

	}

}