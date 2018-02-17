package ADTSet;

public class LinkedList {
	private int size;
	private Node head;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	public LinkedList(Node head) {
		this.head = new Node(head);
	}
	
	public void addToBeginning(Node next) {
		Node nodeToAdd = new Node (next);
		Node iterator = head;
		if (iterator == null) {
			head = nodeToAdd;
			size++;
		} else {
			iterator = iterator.getNext();
			head = nodeToAdd;
			head.setNext(iterator);
			size++;
		}
	}
	
	public void addToBeginning (String s) {
		Node nodeToAdd = new Node (s);
		Node iterator = head;
		if (iterator == null) {
			head = nodeToAdd;
			size++;
		} 
		else if (iterator.getNext() == null) {
			head.setNext(nodeToAdd);
			size++;
		}
		else
		{
			iterator = iterator.getNext();
			nodeToAdd.setNext(iterator);
			head.setNext(nodeToAdd);			
			size++;
		}
	}
	
	public boolean contains(String s) {
		Node iterator = head;
		for (int i = 0; i < size; i++) {
			if (iterator.getValue().equals(s)) {
				return true;
			}
			iterator = iterator.getNext();
		}
		return false;
	}
	
	public void writeList() {
		Node iterator = head;
		for (int i = 0; i < size; i++) {
			System.out.println(iterator.getValue());
			iterator = iterator.getNext();
		}
	}

	public int getSize() {
		return size;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.addToBeginning("A");
		test.addToBeginning("B");
		test.addToBeginning("C");
		test.addToBeginning("D");
		test.writeList();
		if (test.contains("Z")) {
			System.out.println("NICE");
		}
		else {
			System.out.println("NOT NICE");
		}
		
		
	}
}
