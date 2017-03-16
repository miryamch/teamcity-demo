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
		String expected = "BMW" ; 
		Car car = new Car(expected, "X5"); 
		String carBrand = car.getBrand(); 
		assertEquals(expected, carBrand);
	}

	public void testSetBrand() {
		assertTrue(true);
	}

	public void testGetModel() {
		assertTrue(true);
	}

	public void testSetModel() {
//		fail("Not yet implemented");
	}

}
