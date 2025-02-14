package stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class Ex_1 {

	
		public static void main(String[] args)
		{
			List<Integer> obj=new ArrayList<>();
			obj.add(3);
			obj.add(5);
			obj.add(7);
			obj.add(7);
			obj.add(18);
			
			obj.stream().filter((x)->x>4).forEach(x->System.out.println(x));
			
			List<String> ab=Arrays.asList("javat","C","go","c++","javaSc");
			
			
			  ab.forEach((X)->System.out.println(X));
			 
			 
			List<String>cd= ab.stream().filter((A)->A.length()==2).collect(Collectors.toList());
			 System.out.println(cd);

			ab.stream().filter((z)->z.startsWith("j")).forEach((X)->System.out.println(X));	
			
			System.out.println("-------------------------------------------------------------");
			
			//AllMatch()
			
			List<Integer>str=Arrays.asList(2,4,80,6,90,12);
			
			boolean match=str.stream().allMatch((M)->M%2==0);
			//AllMatch() method is java streams is used to check if all elements in the stream
			System.out.println(match);
			
			System.out.println("-------------------------------------------------------------");
			
			//anyMatch()
			List<Integer> AB =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			boolean anymatch=AB.stream().anyMatch(x ->x==10);
			System.out.println(anymatch);
			//anyMatch() is used to check the element is present or not
			
			System.out.println("-------------------------------------------------------------");
			
			//count()
			List<Integer> BC =Arrays.asList(10,20,30,40);
			long lo=BC.stream().count();
			System.out.println(lo);
			//count() is used to count the number of element present in list
			
			System.out.println("-------------------------------------------------------------");
			
			//nonMatch()
			List<Integer>GH=Arrays.asList(101,121,131,141,151,161,171);
			boolean nonmatch=GH.stream().noneMatch(X->X%2==0);
			System.out.println(nonmatch);
			
			System.out.println("-------------------------------------------------------------");
			
			

			//distinct()
			List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
			 numbers.stream().distinct().forEach(x->System.out.println(x));
			//distinctNumbers.forEach(b->System.out.println(b));
			//System.out.println(distinctNumbers);
			//it will remove the duplicate value in the list
			
			System.out.println("-------------------------------------------------------------");
			
			//toArray()
			List<Integer> numb = Arrays.asList(1, 2, 6, 3, 7, 4, 5);
			
			Object[] an=numb.stream().toArray();
			System.out.println(Arrays.toString(an));
			//it will convert the list into object class array and print the array using Arrays.tostring
			
			System.out.println("-------------------------------------------------------------");

			//raneClosed()
			IntStream number=IntStream.rangeClosed(1,100);
			number.filter(P->P%2==0).forEach(X->System.out.println(X));
			//It will take the number 1 to 100 using filter condition % 2 is equal to 0 means it will print the value
			
			System.out.println("---------------------------------");

			System.out.println("-------------------------------------------------------------");

			//skip()
			
			List<Integer> sk=Arrays.asList(10,20,30,40,50,60,70,80);
			sk.stream().skip(3).forEach(X ->System.out.println(X));
			//It will skip first 3 elements and print remaining elements
			System.out.println("---------------------------------");
			
			System.out.println("-------------------------------------------------------------");

			//limit()
					List<Integer>EF=Arrays.asList(10,12,13,14,15,16,17);
					EF.stream().limit(3).forEach(X->System.out.println(X));
					//it will print the 3 elements in the List
					
					System.out.println("-------------------------------------------------------------");
					
			//sort()
			List names = Arrays.asList("Reflection","Collection","Streamr","Streama");
			names.stream().sorted().forEach(N->System.out.println(N));   
					
		}

		

	}

