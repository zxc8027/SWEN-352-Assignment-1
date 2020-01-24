/*
 * Tests the Inventory class.
 */

package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	private Inventory CuT;
	
	/*
	 * Sets up the test.
	 */
	protected void setUp() throws Exception {
		// Create the inventory. Used by all tests.
		this.CuT = new Inventory();
	}
	
	/*
	 * Tests the getChocolate method when unchanged.
	 */
	public void testGetChocolateUnchanged() {
		assertEquals("Default chocolate was incorrect.",15,this.CuT.getChocolate());
	}
	
	/*
	 * Tests the getCoffee method when unchanged.
	 */
	public void testGetCoffeeUnchanged() {
		assertEquals("Default coffee was incorrect.",15,this.CuT.getCoffee());
	}
	
	/*
	 * Tests the getMilk method when unchanged.
	 */
	public void testGetMilkUnchanged() {
		assertEquals("Default milk was incorrect.",15,this.CuT.getMilk());
	}
	/*
	 * Tests the getSugar method when unchanged.
	 */
	public void testGetSugarUnchanged() {
		assertEquals("Default sugar was incorrect.",15,this.CuT.getSugar());
	}

	/*
	 * Tests the toString method.
	 */
	public void testToString() {
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
}
