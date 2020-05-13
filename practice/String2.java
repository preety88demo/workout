package practice;

public class String2 {

	public static void main(String[] args) {

		String text = "You have no choice other than following me " ;
		String replacedtext = text.replaceAll("[^o]", "");
		System.out.println(replacedtext.length());
		
		
	}

}
