package Lambda;

interface D
{
	int m4(int a);
}
public class Demo4 {

	public static void main(String[] args) 
	{
		D obj = (int a)->{return a;};
		int s=obj.m4(45);
		System.out.println(s);
	}

}
