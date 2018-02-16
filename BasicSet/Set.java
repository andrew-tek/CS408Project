package BasicSet;

import java.util.LinkedList;
import java.util.List;

public class Set {
	
	public static List<String> union(List <String> list1, List <String> list2) {
		List <String> solutionSet = new LinkedList<String>();
		for (String str : list1) {
			solutionSet.add(str);
		}
		for (String str : list2) {
			if (!solutionSet.contains(str)) {
				solutionSet.add(str);
			}
		}
		return solutionSet;
	}
	
	public static List<String> intersect (List <String> list1, List <String> list2) {
		List <String> solutionSet = new LinkedList<String>();
		
		
		return solutionSet;
	}

	public static void main(String[] args) {
		List <String> listA = new LinkedList<String>();
		List <String> listB = new LinkedList<String>();
		
		List <String> solution = new LinkedList<String>();
		
		listA.add("a");
		listA.add("b");
		listA.add("c");
		
		listB.add("a");
		listB.add("c");
		listB.add("d");
		
		solution = union(listA, listB);
		
		for (String str : solution) {
			System.out.println(str);
		}
		

	}

}
