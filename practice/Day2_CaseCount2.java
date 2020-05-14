package practice;

public class Day2_CaseCount2 {

	public static void main(String[] args) {
		String input = "Its Work from Home Not Work for Home";
		
		int num=0 ,upper=0 ,lower=0 ,space=0;
		char[] arr = input.toCharArray();
		
		for (char c : arr) {
			
			if (Character.isDigit(c)) {
				
				num=num+1;
			}
			
			else if(Character.isUpperCase(c)) {
				upper=upper+1;
			}
			else if (Character.isLowerCase(c)) {
				lower=lower+1;
			}
			 if (c == ' ') {
				
				space=space+1;
			}	
		}

		System.out.println("number count : "+ num);
		System.out.println("uppercase count : "+ upper);
		System.out.println("lowercase count : "+ lower);
		System.out.println("space count : "+ space);

		
		
	}

}
