package com.teamcity.demo;

import junit.framework.TestCase;

public class CarTest extends TestCase {

	public void testCar() {
//		fail("Not yet implemented");
	}

	public void testToString() {
		Car car = new Car("BMW", "X5"); 
		String carString = car.toString();
		String expected = "Brand: 'BMW', Model: 'X5'" ; 
		assertEquals(expected, carString);
	}

	public void testGetBrand() {
//		fail("Not yet implemented");
	}

	public void testSetBrand() {
//		fail("Not yet implemented");
	}

	public void testGetModel() {
//		fail("Not yet implemented");
	}

	public void testSetModel() {
//		fail("Not yet implemented");
	}

}
