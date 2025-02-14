package methodReference;
interface X
{
	void m1();
}
public class A 
{
	static void m2()
	{
		System.out.println("hiiiiiii");
	}
	public static void main(String[] args) 
	{
		X obj = A::m2;
		obj.m1();
		
	}

}
