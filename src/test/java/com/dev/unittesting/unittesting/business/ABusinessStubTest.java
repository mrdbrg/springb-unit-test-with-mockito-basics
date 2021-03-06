package com.dev.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dev.unittesting.unittesting.data.ADataService;

/*
 * A Stub implementation of the service will avoid having any code connecting to the database.
 * Unit testing should not be depending on anything outside of it.
 */

class ADataServiceStubBasic implements ADataService {
	
	@Override
	public int[] retrieveAllData() {
		return new int[] {1,2,3};
	}
	
}

class ADataServiceStubEmpty implements ADataService {
	
	@Override
	public int[] retrieveAllData() {
		return new int[] {};
	}
	
}

class ADataServiceStubOneValue implements ADataService {
	
	@Override
	public int[] retrieveAllData() {
		return new int[] {5};
	}
	
}

public class ABusinessStubTest {

	@Test
	public void calculateSumUsingADataService_basic() {
		ABusinessImpl aBusinessImpl = new ABusinessImpl();
		aBusinessImpl.setaDataService(new ADataServiceStubBasic());
		
		int actualResult = aBusinessImpl.calculateSumUsingDataService(); // new int[] {1,2,3}
		int expectedResult = 6;
		
		assertEquals(expectedResult, actualResult);		
	}
	
	
	@Test
	public void calculateSumUsingADataService_emptyArray() {
		ABusinessImpl aBusinessImpl = new ABusinessImpl();
		aBusinessImpl.setaDataService(new ADataServiceStubEmpty());
		
		int actualResult = aBusinessImpl.calculateSumUsingDataService(); // new int[] {}
		int expectedResult = 0;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSumUsingADataService_oneValue() {
		ABusinessImpl aBusinessImpl = new ABusinessImpl();
		aBusinessImpl.setaDataService(new ADataServiceStubOneValue());
		
		int actualResult = aBusinessImpl.calculateSumUsingDataService(); // new int[] {5}
		int expectedResult = 5;
		
		assertEquals(expectedResult, actualResult);
	}
	
}
