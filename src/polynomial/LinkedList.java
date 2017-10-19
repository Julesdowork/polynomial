package polynomial;

import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
 * @author Julian McNeill
 */
public class LinkedList
{
	private Node first;
	
	/**
	 * Constructs an empty linked list.
	 */
	public LinkedList()
	{
		first = null;
	}
	
	/**
	 * Returns the first element in the linked list.
	 * @return the first element in the linked list
	 */
	public Object getNode()
	{
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}
	
	/**
	 * Adds an element to the front of the linked list.
	 * @param element the element to add
	 */
	public void addFirst(Object element)
	{
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = first;
		first = newNode;
	}
	
	/**
	 * Removes the first element in the linked list.
	 * @return the removed element
	 */
	public Object removeFirst()
	{
		if (first == null)
			throw new NoSuchElementException();
		Object element = first.data;
		first = first.next;
		return element;
	}
	
	static class Node
	{
		public Object data;
		public Node next;
	}
}
