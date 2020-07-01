package epam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Question3 {
	private static boolean isCaseSensitivePalindrome(String str)
	{
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	private static boolean isCaseInSensitivePalindrome(String str)
	{
		return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	}
	public static void main(String args[])
	{
	    List<String> memberNames = new ArrayList<>();
	    memberNames.add("hello");
	    memberNames.add("racar");
	    memberNames.add("done");
	    memberNames.add("Tenet");
	    memberNames.add("Rotor");
	    memberNames.add("mom");
	    memberNames.add("dad");
	    memberNames.add("bomb");

	    List<String> palindromes1 = filterStrings(memberNames,str->isCaseSensitivePalindrome(str));
	    System.out.println(palindromes1);
	    List<String> palindromes2 = filterStrings(memberNames,str->isCaseInSensitivePalindrome(str));
	System.out.println(palindromes2);
	}
	public static <E> List<E> filterStrings(List<E> list,Predicate<E> predicate)
	{
	List<E> result = new ArrayList<>();
	for(E element:list)
	if(predicate.test(element))
	result.add(element);
	return result;

}
}