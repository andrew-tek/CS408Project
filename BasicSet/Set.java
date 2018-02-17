/* Andrew Tek
 * February 20, 2018
 * CS 408 Raheja
 */
package BasicSet;

import java.util.LinkedList;
import java.util.List;

public class Set {
	
	/*
	 * Combines and returns a new linked list that contains all nodes of list1
	 * and list 2 without any duplicates.
     */
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
	
	/*
	 * Returns new linked list of nodes that are in both list1 and list 2
	 */
	public static List<String> intersect (List <String> list1, List <String> list2) {
		List <String> solutionSet = new LinkedList<String>();
		for (String str : list1) {
			if (list2.contains(str)) {
				solutionSet.add(str);
			}
		}
		return solutionSet;
	}

	/*
	 * Returns new linked list with only unique nodes from list1. Accomplished
	 * by traversing list1 and only adding it to the solution list if it is not
	 * in list2.
	 */
	public static List <String> difference(List <String> list1, List <String> list2) {
		List <String> solutionSet = new LinkedList<String>();
		for (String str : list1) {
			if (!list2.contains(str)) {
				solutionSet.add(str);
			}
		}
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
		
		solution = difference(listA, listB);
		
		for (String str : solution) {
			System.out.println(str);
		}
		

	}

}
