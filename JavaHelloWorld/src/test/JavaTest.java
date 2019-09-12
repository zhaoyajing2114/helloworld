package test;
import static org.junit.Assert.assertTrue;

import junit.framework.*;

public class JavaTest {
	protected int value1,value2;
	protected void setUp() {
		value1=3;
		value2=2;
	}
	public void testAdd() {
		double result = value1+value2;
		assertTrue(result==6);
	}
}
