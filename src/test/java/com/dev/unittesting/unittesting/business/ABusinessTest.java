package com.dev.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ABusinessTest {

	@Test
	public void calculateSum_basic() {
		ABusinessImpl aBusinessImpl = new ABusinessImpl();
		
		int actualResult = aBusinessImpl.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		
		assertEquals(expectedResult, actualResult);		
	}
	
	@Test
	public void calculateSum_emptyArray() {
		ABusinessImpl aBusinessImpl = new ABusinessImpl();
		
		int actualResult = aBusinessImpl.calculateSum(new int[] {});
		int expectedResult = 0;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSum_oneValue() {
		ABusinessImpl aBusinessImpl = new ABusinessImpl();
		
		int actualResult = aBusinessImpl.calculateSum(new int[] {1});
		int expectedResult = 1;
		
		assertEquals(expectedResult, actualResult);
	}
	
}
