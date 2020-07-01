package epam;

import java.util.Arrays;
import java.util.List;

public class Average {
	public static void main(String args[])
	{
	    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9);
	    int n= integers.size();
		Integer sum = integers.stream()
	      .mapToInt(Integer::intValue)
	      .sum();
		double avg  = sum/n;
	    System.out.println("Average of a list of Integers:"+avg);
	}

}
