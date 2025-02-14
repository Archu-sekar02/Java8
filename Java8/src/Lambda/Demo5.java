package Lambda;
@FunctionalInterface
interface E
{ 
	void m3();
	public static void m1()
	{
		System.out.println("hiii");
	}
	default void m2()
	{
		System.out.println("hello");
	}
}

public class Demo5 {

	public static void main(String[] args) {
		E.m1();
		E obj = null;
		obj.m2();
		
		

	}

}
