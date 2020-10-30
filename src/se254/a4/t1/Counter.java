package se254.a4.t1;

public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++;
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--;
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0;
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier;
		_ctr = _ctr * _multiplier;
	}
}
