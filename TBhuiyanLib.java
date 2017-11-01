//Tabassum Bhuiyan Period 2
public class TBhuiyanLib
{
	public static void main(String[] args)
	{
	}
	public static boolean isFibonacci (int check)
	{
		// Return true if in the Fibonacci sequence, false if not.
		int one = 0;
		int two = 1;
		int three = 0;

		while (three < check)
		{
			three = one + two;
			one = two;
			two = three;
		}
		if (three == check )
		{
			System.out.println(true);
		return true;
		}
		else 
		{
			System.out.println(false);
			return false;
		}
	}
	public static boolean cutOut(String word, String word2)
	{
		//Cut half of one word and join it with half of another word
		String s1 = word.substring(0,(word.length()/2));
		String s2 = word2.substring((word2.length()/2));
		System.out.println(s1 + s2);
		return false;
	}
	public static String dateStrstring(String date)
	{
		//If mm/dd/yyyy, return dd-mm-yyyy
		String mmString = date.substring(0, 2);
		String ddString = date.substring(3, 5);
		String yyyyString = date.substring(6, 10);
		{
			return ddString + " - " + mmString + " - " + yyyyString;
		}
	}
}