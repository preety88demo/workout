package practice;

public class Palindrome2 {

	public static void main(String[] args) {
	    
		
		String text = "malayalam";
		String strrev="";


		for(int i=text.length()-1;i>=0;i--)
	    {
	    strrev=strrev+text.charAt(i);
	    }
	if(strrev.equalsIgnoreCase(text))
		System.out.println("Entered string is palindrome");
               else
		System.out.println("Entered string is not a palindrome number ");           
	}


	}


