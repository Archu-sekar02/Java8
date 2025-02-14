package Lambda;

interface A
{
	void a1();
}

public class Demo 
{
	public static void main(String[] args)
	{
		A obj =()->System.out.println("hiii");
		obj.a1();
		
	}

}
