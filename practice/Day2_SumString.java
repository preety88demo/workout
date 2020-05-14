package practice;

public class Day2_SumString {

	public static void main(String[] args) {
		
		String s ="asdf1qwer9as8d7";
		int sum = 0;
        for(int i = 0; i < s.length() ; i++){
            if( Character.isDigit(s.charAt(i)) ){
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(sum);
    }
	}


