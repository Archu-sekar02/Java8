package methodReference;
interface Y
{
	void m1();
}
public class B {

	void m2()
	{
		System.out.println("hellooo");
	}
	public static void main(String[] args) 
	{
		B obj1 = new B();
		Y obj = obj1::m2;
		obj.m1();
	}
}
