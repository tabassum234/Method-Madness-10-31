//Lingli Zou
//MethodMadnessProject
public class LZouLib {
	public static void sumUpTo(int range) 
	{
		int sum=0;
		for(int x=0; x <= range; x++) 
		{
			sum += x;
		}
			System.out.println("The sum from 0 to " + range +" is equals to " + sum);
	}

	public static void multiplicationTable(int x)
	
	{ 		
		System.out.println("A Multiplication Table For");
		{
			
			for (int base=1; base<=x; base++)
			{
				System.out.print(base + "=");
				
			for (int range=1; range<=x; range++) {
				System.out.print(base*range + " ");
			}
			System.out.println(); 
			} 
		}
	}
	
	public static boolean isPalindrome(String string)
	{
		int beg=0;
		int end=string.length()-1;
		
		while(beg<end)
		{
			if(string.charAt(beg) != string.charAt(end))
			{
				System.out.print(string + " is not a palindrome");
				return false;
			}
		end --;
		beg ++;
		}
		System.out.print(string + " is a palindrome");
			return true;

	}
}