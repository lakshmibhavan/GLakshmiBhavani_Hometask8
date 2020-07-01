package epam;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
	public static void main(String args[])
	{
	    List<String> memberNames = new ArrayList<>();
	    memberNames.add("Amitabh");
	    memberNames.add("automation");
	    memberNames.add("ace");
	    memberNames.add("doll");
	    memberNames.add("dog");
	    memberNames.add("ant");
	    memberNames.add("app");
	    memberNames.add("cat");
	    memberNames.stream().filter((s) -> s.startsWith("a"))
	    		            .filter((s) -> s.length()==3)
        .forEach(System.out::println);
	}

}
