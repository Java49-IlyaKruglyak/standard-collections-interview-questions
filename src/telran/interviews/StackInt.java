package telran.interviews;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * 
 * All methods have to have the Complexity O[1]
 *
 */
public class StackInt {
	private LinkedList<Integer> elements = new LinkedList<>();
	private LinkedList<Integer> maxList = new LinkedList<>();
	/**
	 * 
	 * @param num
	 * adds num in the stack
	 */
	public void push(int newElement) {
		elements.add(newElement);
		if(maxList.isEmpty() || newElement >= maxList.getLast()) {
			maxList.add(newElement);
		}
	}
	/**
	 * 
	 * @return
	 * takes out and returns the top stack number
	 * in the case the stack is empty the exception of the class NoSuchElement should be thrown
	 */
	public int pop() {
		if(elements.isEmpty()) {
			throw new NoSuchElementException();
		}
		int res = elements.removeLast();
		if(res == maxList.getLast()) {
			maxList.removeLast();
		}
		return res;
	}
	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		
		return elements.isEmpty();
	}
	/**
	 * 
	 * @return maximal value existing in the stack
	 * throws NoSuchElementException in the case the stack is empty
	 */
	public int max() {
		if(maxList.isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return maxList.getLast();
	}
}
