package Lambda;
interface C
{
	void m3(int b);
}
public class Demo3 
{
	public static void main(String[] args) 
	{
		C obj = (int c)->System.out.println(c);
		obj.m3(40);
		
	}
}
