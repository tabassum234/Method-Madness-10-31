
public class Runner 
{
	public static void main (String [] args)
	{
		LZouLib.sumUpTo(8);
		LZouLib.multiplicationTable(10);
		LZouLib.isPalindrome("1441");
		
		int check = 5;
		System.out.println(TBhuiyanLib.isFibonacci(check));
		String word2 = "cook";
		String word = "bold";
		System.out.println(TBhuiyanLib.cutOut(word, word2));
		String date = "10/13/2017";
		System.out.println(TBhuiyanLib.dateStrstring(date));
	}
}