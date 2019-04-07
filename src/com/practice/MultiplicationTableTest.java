package com.practice;
import org.junit.Test;

public class MultiplicationTableTest {
	
    @Test
	public void printMultiplicationOfPrimeTest()
	{
		MultiplicationTable mtTestInstance  = new MultiplicationTable();
		mtTestInstance.printMultiplicationOfPrime(10);
	}
	
	@Test(expected = Exception.class)
	public void printMultiplicationOfPrimeTestNegativeValue()
	{
		MultiplicationTable mtTestInstance  = new MultiplicationTable();
		mtTestInstance.printMultiplicationOfPrime(-3);
	}
	

}