package Lambda;
interface Predicate<T> 
{
	boolean test(T t);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
}

 interface BiPredicate<T, U>
{
    boolean test(T t, U u);
}

interface Function<T, R> 
{
	    R apply(T t);
}

interface BiFunction<T, U, R>
{
    R apply(T t, U u);
}

interface Consumer<T>
{
    void accept(T t);
}

interface BiConsumer<T, U>
{
    void accept(T t, U u);
}

interface Supplier<T>
{
    T get();
}

public class Demo6
{
	public static void main(String[] args) 
	{
		Predicate<Integer> obj=(a)->{return (a<10);};
		boolean x=obj.test(15);
		System.out.println(x);
		
		BiPredicate<Integer,Integer> obj1=(a,b)->{return (a<b);};
		boolean y=obj1.test(15,10);
		System.out.println(y);
		
		Function<String,Boolean> FFF=(a)->{return a.equals("java");};
		boolean fff=FFF.apply("java");
		System.out.println(fff);
		
		
		BiFunction<String,String,Boolean> obj2=(a,b)->{return a.equals(b);};
		boolean z=obj2.apply("Java Program","Java Program");
		System.out.println(z);
		
		Consumer<Integer> CCC=(a)->System.out.println(a);
		CCC.accept(555);
		
		BiConsumer<Integer,Integer> obj5=(a,b)->{ int c=a+b;System.out.println(c);};
		obj5.accept(15,40);
		
		
		Supplier<Boolean> obj6=()->{int a=10,b=20;return a==b;};
		boolean d=obj6.get();
		System.out.println(d);			
	}		
}
