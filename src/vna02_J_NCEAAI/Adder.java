package vna02_J_NCEAAI;

import java.util.concurrent.atomic.AtomicInteger;

final class Adder {
	
	private final AtomicInteger a = new AtomicInteger(); 
	private final AtomicInteger b = new AtomicInteger();
	
	public int getSum() {
		// Check for overflow 
		return a.get() + b.get();
	}
	
	public void setValues(int a, int b) { 
		this.a.set(a);
		this.b.set(b);
	} 
	
}
