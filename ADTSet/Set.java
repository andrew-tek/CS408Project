package ADTSet;

public class Set {

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
