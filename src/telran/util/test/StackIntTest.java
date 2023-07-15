package telran.util.test;
import telran.interviews.StackInt;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackIntTest {
	
	@Test
	void popTest() {
		StackInt stack = new StackInt();
		assertThrowsExactly(NoSuchElementException.class, () -> stack.pop());
		stack.push(4);
		stack.push(3);
		assertEquals(3, stack.pop());
	}
	@Test
	void isEmptyTest() {
		StackInt stack = new StackInt();
		assertTrue(stack.isEmpty());
		stack.push(0);
		assertFalse(stack.isEmpty());
	}
	@Test
	void maxTest() {
		StackInt stack = new StackInt();
		assertThrowsExactly(NoSuchElementException.class, () -> stack.pop());
		stack.push(4);
		assertEquals(4, stack.max());
		stack.push(5);
		stack.push(6);
		assertEquals(6, stack.max());
		stack.pop();
		assertEquals(5, stack.max());
		stack.pop();
		stack.pop();
		assertThrowsExactly(NoSuchElementException.class, () -> stack.pop());
		}

}
