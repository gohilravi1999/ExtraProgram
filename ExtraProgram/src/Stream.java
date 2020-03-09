import java.util.*;
import java.util.stream.Collectors;

public class Stream 
{

	public static List<String> filteredElement(List<String> name)
	{
		List<String> filtered = name.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList()); 
		
		return filtered;
	}
	
	public static List<Integer> sortElement(List<Integer> number)
	{
		List<Integer> sortElement = number.stream().sorted().collect(Collectors.toList());
		return sortElement;
	}
	
	
	public static List<Integer> squareOfElement(List<Integer> number)
	{
		List<Integer> squareOfElement = number.stream().map(i -> i*i).collect(Collectors.toList());
		return squareOfElement;
	}
	
	public static void main(String[] args) 
	{
	List<String> name = Arrays.asList("Ravi","","Gohil","");
	List<Integer> number = Arrays.asList(5,2,9,4,1);
		
	List<String> filteredList = filteredElement(name); 
	System.out.println("Filtered String is :"+filteredList);
	
	List<Integer> sortedList = sortElement(number); 
	System.out.println("Sorted Element is :"+sortedList);
	
	List<Integer> square = squareOfElement(number); 
	System.out.println("Square of Element is :"+square);
	
	System.out.println("Random Numbers are :");
	Random random = new Random();
	random.ints().limit(5).forEach(System.out::println);
	}

}
