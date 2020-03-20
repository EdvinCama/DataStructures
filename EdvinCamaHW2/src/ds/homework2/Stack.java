package ds.homework2;

public class Stack<Item> {
	
	private Node<Item> top = null;
	private int length = 0;

	
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(Item item) {
		
		Node<Item> newNode = new Node<Item>();
		newNode.data = item;
		newNode.next = top;
		top = newNode;
		length ++;
	}
	
	public Item pop() {
		
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("The stack is empty.");
		}
		Item item = top.data;
		top = top.next;
		length --;
		
		return item;
	}
	
	
	
	
	
}
