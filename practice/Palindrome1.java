package practice;

public class Palindrome1 {


	public static void main(String[] args) {

		String text = "testleaf";
		
		StringBuffer stb = new StringBuffer(text);
		StringBuffer reverse = stb.reverse();
		String rev = reverse.toString();
		
		if(rev.equals(text)) {
			System.out.println("yes , Palindrome");
		}
		else
		{
			System.out.println("no , not a palindrome");
		}
		
		
	}

}
