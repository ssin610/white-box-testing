/**
 * 
 */
package se254.a4.t2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import se254.a4.t1.Counter;

/**
 * Test class for Counter class which is aimed at identifying bugs
 * in the implementation of Counter
 * @author Saurabh Singh
 * @version 24/10/2020
 */
class CounterTest {

	/**
	 * Test method for {@link se254.a4.t1.Counter#increment()}.
	 * This test calls the increment method on a counter object
	 * and then checks to see if the counter value has increased by 1
	 */
	@Test
	void testIncrement() {
		Counter counter = new Counter();
		counter._ctr = 5;
		counter.increment();
		assertEquals(6, counter._ctr);
	}

	/**
	 * Test method for {@link se254.a4.t1.Counter#decrement()}.
	 * This test calls the decrement method on a counter object
	 * and then checks to see if the counter value has decreased by 1
	 */
	@Test
	void testDecrement() {
		Counter counter = new Counter();
		counter._ctr = 5;
		counter.decrement();
		assertEquals(4, counter._ctr);
	}

	/**
	 * Test method for {@link se254.a4.t1.Counter#reset()}.
	 * This test calls the reset method on a counter object
	 * and then checks to see if the counter value has reset to 0
	 */
	@Test
	void testReset() {
		Counter counter = new Counter();
		counter._ctr = 5;
		counter.reset();
		assertEquals(0, counter._ctr);
	}

	/**
	 * Test method for {@link se254.a4.t1.Counter#multiplyBy(int)}.
	 * This test calls the multiply method on a counter object
	 * and then checks to see if the counter has been multiplied
	 * by the correct amount
	 */
	@Test
	void testMultiplyBy() {
		Counter counter = new Counter();
		counter._ctr = 5;
		counter.multiplyBy(5);
		assertEquals(25, counter._ctr);
	}
}
