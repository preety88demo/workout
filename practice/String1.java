package practice;

public class String1 {

	public static void main(String[] args) {
String text = "You have no choice other than following me " ;
		
		char[] textary = text.toCharArray();
		int res = 0;
		
		for (int i = 0; i < textary.length; i++) {
			
			if (textary[i]=='o') {
				
				res++;
				
			}
			
		}
		
		System.out.println(res);
	}

	}


	


