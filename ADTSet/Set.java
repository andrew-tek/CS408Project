/* Andrew Tek
 * February 20, 2018
 * CS 408 Raheja
 */
package ADTSet;

public class Set {

	/*
	 * Combines and returns a new linked list that contains all nodes of list1
	 * and list 2 without any duplicates.
	 */
	public static LinkedList union(LinkedList list1, LinkedList list2) {
		LinkedList solution = new LinkedList();
		Node iterator = list1.getHead();
		for (int i = 0; i < list1.getSize(); i++) {
			solution.addToBeginning(iterator.getValue());
			iterator = iterator.getNext();
		}
		
		iterator = list2.getHead();
		for (int i = 0; i < list2.getSize(); i++) {
			if (!solution.contains(iterator.getValue())) {
				solution.addToBeginning(iterator.getValue());
			}
			iterator = iterator.getNext();
		}
		return solution;
	}
	/*
	 * Returns new linked list of nodes that are in both list1 and list 2
	 */
	public static LinkedList intersection(LinkedList list1, LinkedList list2) {
		LinkedList solution=  new LinkedList();
		Node iterator = list1.getHead();
		
		for (int i = 0; i < list1.getSize(); i++) {
			if (list2.contains(iterator.getValue())) {
				solution.addToBeginning(iterator.getValue());
			}
			iterator = iterator.getNext();
		}
		
		return solution;
	}
	/*
	 * Returns new linked list with only unique nodes from list1. Accomplished
	 * by traversing list1 and only adding it to the solution list if it is not
	 * in list2.
	 */
	public static LinkedList difference (LinkedList list1, LinkedList list2) {
		LinkedList solution = new LinkedList();
		Node iterator = list1.getHead();
		for (int i = 0; i < list1.getSize(); i++) {
			if (!list2.contains(iterator.getValue())) {
				solution.addToBeginning(iterator.getValue());
			}
			iterator = iterator.getNext();
		}
		
		return solution;
		}
	
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		list1.addToBeginning("A");
		list1.addToBeginning("B");
		list1.addToBeginning("C");
		list1.addToBeginning("D");
		list1.addToBeginning("E");
		
		list2.addToBeginning("C");
		list2.addToBeginning("E");
		list2.addToBeginning("F");
		list2.addToBeginning("D");
		
		LinkedList solution = difference(list1, list2);
		solution.writeList();

	}

}
