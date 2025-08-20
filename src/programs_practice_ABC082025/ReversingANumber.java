package programs_practice_ABC082025;

public class ReversingANumber 
{
	public static void main(String[] args) 
	{
		int a = 1234;
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		System.out.println(sb.reverse());
	}
}
