package practice;

public class Day2_CaseCount1 {

	public static void main(String[] args) {
		String input = "Its Work from Home Not Work for Home";
		char arr[] = input.toCharArray();
		int numcount = 0 ,Lowcase = 0,upcase = 0 , spacecount = 0;
		for(char  c : arr)
		{
			//num
			if(c >= 48 & c <= 57)
			{
				 numcount = numcount + 1;
			}
			else  if(c>= 65 & c<= 90)
			{
				upcase = upcase + 1;
			}
			else if(c>=97 & c<= 122)
			{
				Lowcase = Lowcase + 1;
			}
			else if(c==32)
			{
				spacecount = spacecount + 1;
			}
		}
		
		System.out.println(numcount + " numcount");
		System.out.println(upcase + " upcase");
		System.out.println(Lowcase + " Lowcase");
		System.out.println(spacecount + " spacecount");
		
		
		
		

	}


	}


