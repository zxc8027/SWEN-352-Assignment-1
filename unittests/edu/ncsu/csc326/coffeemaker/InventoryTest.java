/*
 * Tests the Inventory class.
 */

package edu.ncsu.csc326.coffeemaker;

import java.util.concurrent.Callable;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	private Inventory CuT;
	
	/*
	 * Asserts that an InventoryException was thrown.
	 */
	public static void assertInventoryException(Callable method) throws Exception {
		try {
			method.call();
		} catch (InventoryException exception) {
			
		} catch (Exception exception) {
			throw exception;
		}
	}
	
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
	
	/*
	 * Tests the addChocolate method with an empty string.
	 */
	public void testAddChocolateEmptyString() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addChocolate("");
				return null;
			}
		});
		
		assertEquals("Chocolate was modified.",15,this.CuT.getChocolate());
	}
	
	/*
	 * Tests the addChocolate method with a non-number string.
	 */
	public void testAddChocolateNonNumberString() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addChocolate("Test");
				return null;
			}
		});
		
		assertEquals("Chocolate was modified.",15,this.CuT.getChocolate());
	}
	
	/*
	 * Tests the addChocolate method with a float string.
	 */
	public void testAddChocolateFloat() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addChocolate("3.2");
				return null;
			}
		});
		
		assertEquals("Chocolate was modified.",15,this.CuT.getChocolate());
	}
	
	/*
	 * Tests the addChocolate method with a negative integer string.
	 */
	public void testAddChocolateNegativeInteger() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addChocolate("-1");
				return null;
			}
		});
		
		assertEquals("Chocolate was modified.",15,this.CuT.getChocolate());
	}
	
	/*
	 * Tests the addChocolate method with a zero string.
	 */
	public void testAddChocolateZero() throws Exception {
		CuT.addChocolate("0");
		assertEquals("Chocolate was modified.",15,this.CuT.getChocolate());
	}

	/*
	 * Tests the addChocolate method with a positive integer string.
	 */
	public void testAddChocolatePositiveInteger() throws Exception {
		CuT.addChocolate("1");
		assertEquals("Chocolate wasn't changed correctly.",16,this.CuT.getChocolate());
	}

	/*
	 * Tests the addCoffee method with an empty string.
	 */
	public void testAddCoffeeEmptyString() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addCoffee("");
				return null;
			}
		});
		
		assertEquals("Coffee was modified.",15,this.CuT.getCoffee());
	}
	
	/*
	 * Tests the addCoffee method with a non-number string.
	 */
	public void testAddCoffeeNonNumberString() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addCoffee("Test");
				return null;
			}
		});
		
		assertEquals("Coffee was modified.",15,this.CuT.getCoffee());
	}
	
	/*
	 * Tests the addCoffee method with a float string.
	 */
	public void testAddCoffeeFloat() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addCoffee("3.2");
				return null;
			}
		});
		
		assertEquals("Coffee was modified.",15,this.CuT.getCoffee());
	}
	
	/*
	 * Tests the addCoffee method with a negative integer string.
	 */
	public void testAddCoffeeNegativeInteger() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addCoffee("-1");
				return null;
			}
		});
		
		assertEquals("Coffee was modified.",15,this.CuT.getCoffee());
	}
	
	/*
	 * Tests the addCoffee method with a zero string.
	 */
	public void testAddCoffeeZero() throws Exception {
		CuT.addCoffee("0");
		assertEquals("Coffee was modified.",15,this.CuT.getCoffee());
	}

	/*
	 * Tests the addCoffee method with a positive integer string.
	 */
	public void testAddCoffeePositiveInteger() throws Exception {
		CuT.addCoffee("1");
		assertEquals("Coffee wasn't changed correctly.",16,this.CuT.getCoffee());
	}

	/*
	 * Tests the addMilk method with an empty string.
	 */
	public void testAddMilkEmptyString() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addMilk("");
				return null;
			}
		});
		
		assertEquals("Milk was modified.",15,this.CuT.getMilk());
	}
	
	/*
	 * Tests the addMilk method with a non-number string.
	 */
	public void testAddMilkNonNumberString() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addMilk("Test");
				return null;
			}
		});
		
		assertEquals("Milk was modified.",15,this.CuT.getMilk());
	}
	
	/*
	 * Tests the addMilk method with a float string.
	 */
	public void testAddMilkFloat() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addMilk("3.2");
				return null;
			}
		});
		
		assertEquals("Milk was modified.",15,this.CuT.getMilk());
	}
	
	/*
	 * Tests the addMilk method with a negative integer string.
	 */
	public void testAddMilkNegativeInteger() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addMilk("-1");
				return null;
			}
		});
		
		assertEquals("Milk was modified.",15,this.CuT.getMilk());
	}
	
	/*
	 * Tests the addMilk method with a zero string.
	 */
	public void testAddMilkZero() throws Exception {
		CuT.addMilk("0");
		assertEquals("Milk was modified.",15,this.CuT.getMilk());
	}

	/*
	 * Tests the addMilk method with a positive integer string.
	 */
	public void testAddMilkPositiveInteger() throws Exception {
		CuT.addMilk("1");
		assertEquals("Milk wasn't changed correctly.",16,this.CuT.getMilk());
	}
	
	/*
	 * Tests the addSugar method with an empty string.
	 */
	public void testAddSugarEmptyString() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addSugar("");
				return null;
			}
		});
		
		assertEquals("Sugar was modified.",15,this.CuT.getSugar());
	}
	
	/*
	 * Tests the addSugar method with a non-number string.
	 */
	public void testAddSugarNonNumberString() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addSugar("Test");
				return null;
			}
		});
		
		assertEquals("Sugar was modified.",15,this.CuT.getSugar());
	}
	
	/*
	 * Tests the addSugar method with a float string.
	 */
	public void testAddSugarFloat() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addSugar("3.2");
				return null;
			}
		});
		
		assertEquals("Sugar was modified.",15,this.CuT.getSugar());
	}
	
	/*
	 * Tests the addSugar method with a negative integer string.
	 */
	public void testAddSugarNegativeInteger() throws Exception {
		Inventory CuT = this.CuT;
		assertInventoryException(new Callable() {
			@Override
			public Object call() throws Exception {
				CuT.addSugar("-1");
				return null;
			}
		});
		
		assertEquals("Sugar was modified.",15,this.CuT.getSugar());
	}
	
	/*
	 * Tests the addSugar method with a zero string.
	 */
	public void testAddSugarZero() throws Exception {
		CuT.addSugar("0");
		assertEquals("Sugar was modified.",15,this.CuT.getSugar());
	}

	/*
	 * Tests the addSugar method with a positive integer string.
	 */
	public void testAddSugarPositiveInteger() throws Exception {
		CuT.addSugar("1");
		assertEquals("Sugar wasn't changed correctly.",16,this.CuT.getSugar());
	}
}
