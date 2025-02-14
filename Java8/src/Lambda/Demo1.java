package Lambda;

interface B
{
	int m2();
}
public class Demo1 {

	public static void main(String[] args) 
	{
		B obj =()->{int a=10;int b=7;int c= a+b;return c;};
		int x=obj.m2();
		System.out.println(x);
		
	}

}
