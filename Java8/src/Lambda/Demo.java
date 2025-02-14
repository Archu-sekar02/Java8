package Lambda;

interface A
{
	void m1();
}

public class Demo 
{
	public static void main(String[] args)
	{
		A obj =()->System.out.println("hiii");
		obj.m1();
		
	}

}
