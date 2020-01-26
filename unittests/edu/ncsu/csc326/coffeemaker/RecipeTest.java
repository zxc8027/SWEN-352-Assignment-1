/*
 * Tests the Recipe class
 */

package edu.ncsu.csc326.coffeemaker;

import java.util.concurrent.Callable;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class RecipeTest extends TestCase{

	private Recipe CuT;
	
	/*
	 * Asserts that a RecipeException was thrown.
	 */
	public static void assertRecipeException(Callable method) throws Exception{
		try {
			method.call();
		} catch (RecipeException exception) {
			
		} catch (Exception exception) {
			throw exception;
		}
	}
	
	/*
	 * Sets up the test.
	 */
	protected void setUp() throws Exception {
		//Create default recipe
		this.CuT = new Recipe();
	}
	
	/*
	 * Tests the getAmtChocolate method for default recipe
	 */
	public void testGetAmtChocolate() {
		assertEquals("Chocolate amt in default recipe was incorrect",0,this.CuT.getAmtChocolate());
	}
	
	/*
	 * Tests the getAmtCofee method for default recipe
	 */
	public void testGetAmtCofee() {
		assertEquals("Cofee amt in default recipe was incorrect",0,this.CuT.getAmtCoffee());
	}
	
	/*
	 * Tests the getAmtMilk method for default recipe
	 */
	public void testGetAmtMilk() {
		assertEquals("Milk amt in default recipe was incorrect",0,this.CuT.getAmtMilk());
	}
	
	/*
	 * Tests the getAmtSugar method for default recipe
	 */
	public void testGetAmtSugar() {
		assertEquals("Sugar amt in default recipe was incorrect",0,this.CuT.getAmtSugar());
	}
	
	/*
	 * Tests the getName method for default recipe
	 */
	public void testGetName() {
		assertEquals("Name of default recipe was incorrect","",this.CuT.getName());
	}
	
	/*
	 * Tests the getPrice method for default recipe
	 */
	public void testGetPrice() {
		assertEquals("Price of default recipe was incorrect",0,this.CuT.getPrice());
	}
	
	/*
	 * Tests the setAmtChocolate method with an empty string
	 */
	public void testSetAmtChocolateEmptyString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtChocolate("");
				return null;
			}
		});
		
		assertEquals("Chocolate amount was modified",0,this.CuT.getAmtChocolate());
	}
	
	/*
	 * Tests the setAmtChocolate method with a non-number string
	 */
	public void testSetAmtChocolateNonNumberString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtChocolate("T");
				return null;
			}
		});
		
		assertEquals("Chocolate amount was modified",0,this.CuT.getAmtChocolate());
	}
	
	/*
	 * Tests the setAmtChocolate method with a double string
	 */
	public void testSetAmtChocolateDouble() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtChocolate("1.2");
				return null;
			}
		});
		
		assertEquals("Chocolate amount was modified",0,this.CuT.getAmtChocolate());
	}
	
	/*
	 * Tests the setAmtChocolate method with a negative integer string
	 */
	public void testSetAmtChocolateNegative() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtChocolate("-1");
				return null;
			}
		});
		
		assertEquals("Chocolate amount was modified",0,this.CuT.getAmtChocolate());
	}
	
	/*
	 * Tests the setAmtChocolate method with zero string
	 */
	public void testSetAmtChocolateZero() throws Exception{
		CuT.setAmtChocolate("0");
		assertEquals("Chocolate amount was modified",0,this.CuT.getAmtChocolate());
	}
	
	/*
	 * Tests the setAmtChocolate method with positive string
	 */
	public void testSetAmtChocolatePositive() throws Exception{
		CuT.setAmtChocolate("1");
		assertEquals("Chocolate amount was modified",1,this.CuT.getAmtChocolate());
	}
	
	/*
	 * Tests the setAmtCoffee method with an empty string
	 */
	public void testSetAmtCoffeeEmptyString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtCoffee("");
				return null;
			}
		});
		
		assertEquals("Coffee amount was modified",0,this.CuT.getAmtCoffee());
	}
	
	/*
	 * Tests the setAmtCoffee method with a non-number string
	 */
	public void testSetAmtCoffeeNonNumberString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtCoffee("T");
				return null;
			}
		});
		
		assertEquals("Coffee amount was modified",0,this.CuT.getAmtCoffee());
	}
	
	/*
	 * Tests the setAmtChocolate method with a double string
	 */
	public void testSetAmtCoffeeDouble() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtCoffee("1.2");
				return null;
			}
		});
		
		assertEquals("Coffee amount was modified",0,this.CuT.getAmtCoffee());
	}
	
	/*
	 * Tests the setAmtChocolate method with a negative integer string
	 */
	public void testSetAmtCoffeeNegative() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtCoffee("-1");
				return null;
			}
		});
		
		assertEquals("Coffee amount was modified",0,this.CuT.getAmtCoffee());
	}
	
	/*
	 * Tests the setAmtChocolate method with zero string
	 */
	public void testSetAmtCoffeeZero() throws Exception{
		CuT.setAmtCoffee("0");
		assertEquals("Coffee amount was modified",0,this.CuT.getAmtCoffee());
	}
	
	/*
	 * Tests the setAmtChocolate method with positive string
	 */
	public void testSetAmtCoffee() throws Exception{
		CuT.setAmtCoffee("1");
		assertEquals("Coffee amount was modified",1,this.CuT.getAmtCoffee());
	}
	
	/*
	 * Tests the setAmtMilk method with an empty string
	 */
	public void testSetAmtMilkEmptyString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtMilk("");
				return null;
			}
		});
		
		assertEquals("Milk amount was modified",0,this.CuT.getAmtMilk());
	}
	
	/*
	 * Tests the setAmtMilk method with a non-number string
	 */
	public void testSetAmtMilkNonNumberString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtMilk("T");
				return null;
			}
		});
		
		assertEquals("Milk amount was modified",0,this.CuT.getAmtMilk());
	}
	
	/*
	 * Tests the setAmtMilk method with a double string
	 */
	public void testSetAmtMilkDouble() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtMilk("1.2");
				return null;
			}
		});
		
		assertEquals("Milk amount was modified",0,this.CuT.getAmtMilk());
	}
	
	/*
	 * Tests the setAmtMilk method with a negative integer string
	 */
	public void testSetAmtMilkNegative() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtMilk("-1");
				return null;
			}
		});
		
		assertEquals("Milk amount was modified",0,this.CuT.getAmtMilk());
	}
	
	/*
	 * Tests the setAmtMilk method with zero string
	 */
	public void testSetAmtMilkZero() throws Exception{
		CuT.setAmtMilk("0");
		assertEquals("Milk amount was modified",0,this.CuT.getAmtMilk());
	}
	
	/*
	 * Tests the setAmtMilk method with positive string
	 */
	public void testSetAmtMilkPositive() throws Exception{
		CuT.setAmtMilk("1");
		assertEquals("Milk amount was modified",1,this.CuT.getAmtMilk());
	}
	/*
	 * Tests the setAmtSugar method with an empty string
	 */
	public void testSetAmtSugarEmptyString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtSugar("");
				return null;
			}
		});
		
		assertEquals("Sugar amount was modified",0,this.CuT.getAmtSugar());
	}
	
	/*
	 * Tests the setAmtSugar method with a non-number string
	 */
	public void testSetAmtSugarNonNumberString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtSugar("T");
				return null;
			}
		});
		
		assertEquals("Sugar amount was modified",0,this.CuT.getAmtSugar());
	}
	
	/*
	 * Tests the setAmtSugar method with a double string
	 */
	public void testSetAmtSugarDouble() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtSugar("1.2");
				return null;
			}
		});
		
		assertEquals("Sugar amount was modified",0,this.CuT.getAmtSugar());
	}
	
	/*
	 * Tests the setAmtSugar method with a negative integer string
	 */
	public void testSetAmtSugarNegative() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setAmtSugar("-1");
				return null;
			}
		});
		
		assertEquals("Sugar amount was modified",0,this.CuT.getAmtSugar());
	}
	
	/*
	 * Tests the setAmtSugar method with zero string
	 */
	public void testSetAmtSugarZero() throws Exception{
		CuT.setAmtSugar("0");
		assertEquals("Sugar amount was modified",0,this.CuT.getAmtSugar());
	}
	
	/*
	 * Tests the setAmtSugar method with positive string
	 */
	public void testSetAmtSugarPositive() throws Exception{
		CuT.setAmtSugar("1");
		assertEquals("Sugar amount was modified",1,this.CuT.getAmtSugar());
	}
	
	/*
	 * Tests the setName method with null string
	 */
	public void testSetNameNull() {
		CuT.setName(null);
		assertTrue("Name was set to null",CuT.getName()!=null);
	}
	
	/*
	 * Tests the setName method with proper string
	 */
	public void testSetName() {
		CuT.setName("Regular");
		assertEquals("Name was modified","Regular",CuT.getName());
	}
	
	/*
	 * Tests the setPrice method with an empty string
	 */
	public void testSetPriceEmptyString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setPrice("");
				return null;
			}
		});
		
		assertEquals("Price was modified",0,this.CuT.getPrice());
	}
	
	/*
	 * Tests the setPrice method with a non-number string
	 */
	public void testSetPriceNonNumberString() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setPrice("T");
				return null;
			}
		});
		
		assertEquals("Price was modified",0,this.CuT.getPrice());
	}
	
	/*
	 * Tests the setPrice method with a double string
	 */
	public void testSetPrice() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setPrice("1.2");
				return null;
			}
		});
		
		assertEquals("Price was modified",0,this.CuT.getPrice());
	}
	
	/*
	 * Tests the setPrice method with a negative integer string
	 */
	public void testSetPriceNegative() throws Exception{
		Recipe CuT = this.CuT;
		assertRecipeException(new Callable() {
			@Override
			public Object call() throws Exception{
				CuT.setPrice("-1");
				return null;
			}
		});
		
		assertEquals("Price amount was modified",0,this.CuT.getPrice());
	}
	
	/*
	 * Tests the setPrice method with zero string
	 */
	public void testSetPriceZero() throws Exception{
		CuT.setPrice("0");
		assertEquals("Price amount was modified",0,this.CuT.getPrice());
	}
	
	/*
	 * Tests the setPrice method with positive string
	 */
	public void testSetPricePositive() throws Exception{
		CuT.setPrice("1");
		assertEquals("Price was modified",1,this.CuT.getPrice());
	}
	
	/*
	 * Tests the toString method
	 */
	public void testToString() {
		assertEquals("Recipe name was incorrect","",CuT.toString());
	}
	
	/*
	 * Tests equals method comparing CuT to itself
	 */
	public void testEqualsSameObject() {
		Recipe o = this.CuT;
		assertTrue("Objects not compared correctly",CuT.equals(o));
	}
	
	/*
	 * Tests equals method comparing CuT to object of different type
	 */
	public void testEqualsDifferentObjectType() {
		Inventory i = new Inventory();
		assertFalse("Objects not compared correctly",CuT.equals(i));
	}
	
	/*
	 * Tests equals method comparing to null
	 */
	public void testEqualsNull() {
		assertFalse("Objects not compared correctly",CuT.equals(null));
	}
	
	/*
	 * Tests equals method with CuT name different than recipe r name
	 */
	public void testEqualsDifferentName() {
		Recipe r = new Recipe();
		r.setName("Regular");
		CuT.setName("Cappuccino");
		
		assertFalse("Coffee objects not compared correctly",CuT.equals(r));
	}
	
	/*
	 * Tests equals method with CuT name same as recipe r name
	 */
	public void testEqualsSameName() {
		Recipe r = new Recipe();
		r.setName("Regular");
		CuT.setName("Regular");
		
		assertTrue("Coffee objects not compared correctly",CuT.equals(r));
	}
	
	/*
	 * Tests hashCode method with two recipes with same name
	 */
	public void testHashCodeSameNames() {
		Recipe r = new Recipe();
		r.setName("Regular");
		CuT.setName("Regular");
		
		assertEquals("Hash codes should be equal",r.hashCode(),CuT.hashCode());
	}
	
	/*
	 * Tests hashCode method with two recipes with different names
	 */
	public void testHashCodeDifferentNames() {
		Recipe r = new Recipe();
		r.setName("Regular");
		CuT.setName("Cappuccino");
		
		assertFalse("Hash codes should not be equal",r.hashCode()==CuT.hashCode());
	}
}
