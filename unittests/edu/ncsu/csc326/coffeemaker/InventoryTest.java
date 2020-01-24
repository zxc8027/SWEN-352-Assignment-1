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
	
	/*
	 * Tests the setChocolate method with a positive integer.
	 */
	public void testSetChocolatePositiveInteger() {
		this.CuT.setChocolate(1);
		
		assertEquals("Modified chocolate was incorrect.",1,this.CuT.getChocolate());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setChocolate method with a negative integer.
	 */
	public void testSetChocolateNegativeInteger() {
		this.CuT.setChocolate(-1);
		
		assertEquals("Chocolate was modified.",15,this.CuT.getChocolate());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setChocolate method with zero.
	 */
	public void testSetChocolateZero() {
		this.CuT.setChocolate(0);
		
		assertEquals("Modified chocolate was incorrect.",0,this.CuT.getChocolate());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 0\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setCoffee method with a positive integer.
	 */
	public void testSetCoffeePositiveInteger() {
		this.CuT.setCoffee(1);
		
		assertEquals("Modified coffee was incorrect.",1,this.CuT.getCoffee());
		assertEquals("Inventory as string was incorrect.","Coffee: 1\nMilk: 15\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setCoffee method with a negative integer.
	 */
	public void testSetCoffeeNegativeInteger() {
		this.CuT.setCoffee(-1);
		
		assertEquals("Coffee was modified.",15,this.CuT.getCoffee());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setCoffee method with zero.
	 */
	public void testSetCoffeeZero() {
		this.CuT.setCoffee(0);
		
		assertEquals("Modified coffee was incorrect.",0,this.CuT.getCoffee());
		assertEquals("Inventory as string was incorrect.","Coffee: 0\nMilk: 15\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setMilk method with a positive integer.
	 */
	public void testSetMilkPositiveInteger() {
		this.CuT.setMilk(1);
		
		assertEquals("Modified milk was incorrect.",1,this.CuT.getMilk());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 1\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setMilk method with a negative integer.
	 */
	public void testSetMilkNegativeInteger() {
		this.CuT.setMilk(-1);
		
		assertEquals("Milk was modified.",15,this.CuT.getMilk());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setMilk method with zero.
	 */
	public void testSetMilkZero() {
		this.CuT.setMilk(0);
		
		assertEquals("Modified milk was incorrect.",0,this.CuT.getMilk());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 0\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setSugar method with a positive integer.
	 */
	public void testSetSugarPositiveInteger() {
		this.CuT.setSugar(1);
		
		assertEquals("Modified milk was incorrect.",1,this.CuT.getSugar());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 1\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setSugar method with a negative integer.
	 */
	public void testSetSugarNegativeInteger() {
		this.CuT.setSugar(-1);
		
		assertEquals("Milk was modified.",15,this.CuT.getSugar());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n",this.CuT.toString());
	}
	
	/*
	 * Tests the setSugar method with zero.
	 */
	public void testSetSugarZero() {
		this.CuT.setSugar(0);
		
		assertEquals("Modified milk was incorrect.",0,this.CuT.getSugar());
		assertEquals("Inventory as string was incorrect.","Coffee: 15\nMilk: 15\nSugar: 0\nChocolate: 15\n",this.CuT.toString());
	}
}
