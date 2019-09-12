package test;

import static org.junit.Assert.*;

import org.junit.Test;

import zyj.calculate;

public class calculateTest {

	@Test
	public void testAdd() {
		assertEquals(6,new calculate().add(2.0, 4.0),1);
	}

	@Test
	public void testDelete() {
		assertEquals(10.0,new calculate().delete(20.0, 10.0),1);
	}

	@Test
	public void testMultiply() {
		assertEquals(20.0,new calculate().multiply(4.0, 5.0),1);
	}

	@Test
	public void testDevide() {
		assertEquals(4.0,new calculate().devide(32.0, 8.0),1);
	}
public static void main(String[] args) {
	calculateTest a = new calculateTest();
	a.testAdd();
	a.testDelete();
	a.testMultiply();
	a.testDevide();
}
}
