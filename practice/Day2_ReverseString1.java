package practice;

public class Day2_ReverseString1 {

	public static void main(String[] args) {
		String input = "When the world realise its own mistake, corona will dissolve automatically";
		String[] splitInput = input.split(" ");
		
		for (int i = 0; i < splitInput.length; i++) 
		{
			if(i%2 != 0)
			{
				StringBuffer buffer = new StringBuffer(splitInput[i]);
				splitInput[i] = buffer.reverse().toString();
				System.out.println(splitInput[i]);
			}

		}
		
		   for (int i = 0; i < splitInput.length; i++) 
		   
		   { 
		  System.out.print(splitInput[i]+" "); 
		   
	       }	
		
}		

	}


