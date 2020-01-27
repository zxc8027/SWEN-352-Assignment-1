/**
 * 
 */
package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;
import java.util.concurrent.Callable;


/**
 * 
 */
class RecipeBookTest {
    private Recipe recipe;
    private Inventory inventory;
    private RecipeBook rb;
    
    
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.recipe = new Recipe();
		this.recipe.setName("Test Recipe");
		this.recipe.setPrice("1");
		this.recipe.setAmtChocolate("1");
		this.recipe.setAmtCoffee("1");
		this.recipe.setAmtMilk("2");
		this.recipe.setAmtSugar("2");
		
		this.rb = new RecipeBook();
		this.inventory = new Inventory();
		
	}

	@Test
	void test_getRecipeWithExistingRecipe() {
		this.rb.addRecipe(this.recipe);
		assertEquals(this.rb.getRecipes().length, 4);
		assertEquals(this.recipe.getName(), this.rb.getRecipes()[0].getName());
		assertEquals(this.recipe, this.rb.getRecipes()[0]);
	}
	
	@Test
	void test_getRecipeWithNoExistingRecipe() {
		for( int i = 0; i < this.rb.getRecipes().length; i++) {
			assertEquals(null, this.rb.getRecipes()[i]);
		}
	}
	
	@Test
	void test_addRecipe() {
		this.rb.addRecipe(this.recipe);
		assertEquals(this.recipe, this.rb.getRecipes()[0]);
	}
	
	
	@Test
	void test_addingAllRecipes() throws RecipeException {
		
		this.rb.addRecipe(this.recipe);

		Recipe test2 = new Recipe();
		test2.setName("Test Recipe2");
		test2.setPrice("2");
		test2.setAmtChocolate("2");
		test2.setAmtCoffee("2");
		test2.setAmtMilk("4");
		test2.setAmtSugar("4");
		this.rb.addRecipe(test2);

		
		Recipe test3 = new Recipe();
		test2.setName("Test Recipe3");
		test2.setPrice("3");
		test2.setAmtChocolate("3");
		test2.setAmtCoffee("3");
		test2.setAmtMilk("6");
		test2.setAmtSugar("6");
		
		this.rb.addRecipe(test3);

		Recipe test4 = new Recipe();
		test2.setName("Test Recipe4");
		test2.setPrice("4");
		test2.setAmtChocolate("4");
		test2.setAmtCoffee("4");
		test2.setAmtMilk("8");
		test2.setAmtSugar("8");
		this.rb.addRecipe(test4);
		
		Recipe [] expectedArray = new Recipe[4];
		expectedArray[0] = this.recipe;
		expectedArray[1] = test2;
		expectedArray[2] = test3;
		expectedArray[3] = test4;
		
		Recipe [] actualArray = this.rb.getRecipes();
		for(int i = 0; i < expectedArray.length; i++) {
			//assertEquals(expectedArray[i], actualArray[i]);
		}
	}
	
	
	
	@Test
	void test_addSameRecipe() {
		this.rb.addRecipe(this.recipe);
		assertEquals(this.recipe, this.rb.getRecipes()[0]);
		this.rb.addRecipe(this.recipe);
		assertEquals(null, this.rb.getRecipes()[1]);
	}
	
	@Test
	void test_rolloverRecipe() throws RecipeException {
		this.rb.addRecipe(this.recipe);

		Recipe test2 = new Recipe();
		test2.setName("Test Recipe2");
		test2.setPrice("2");
		test2.setAmtChocolate("2");
		test2.setAmtCoffee("2");
		test2.setAmtMilk("4");
		test2.setAmtSugar("4");
		this.rb.addRecipe(test2);

		
		Recipe test3 = new Recipe();
		test2.setName("Test Recipe3");
		test2.setPrice("3");
		test2.setAmtChocolate("3");
		test2.setAmtCoffee("3");
		test2.setAmtMilk("6");
		test2.setAmtSugar("6");
		
		this.rb.addRecipe(test3);

		Recipe test4 = new Recipe();
		test2.setName("Test Recipe4");
		test2.setPrice("4");
		test2.setAmtChocolate("4");
		test2.setAmtCoffee("4");
		test2.setAmtMilk("8");
		test2.setAmtSugar("8");
		this.rb.addRecipe(test4);
		
		Recipe test5 = new Recipe();
		test2.setName("Test Recipe5");
		test2.setPrice("5");
		test2.setAmtChocolate("5");
		test2.setAmtCoffee("5");
		test2.setAmtMilk("10");
		test2.setAmtSugar("10");
		this.rb.addRecipe(test5);
		
		Recipe [] expectedArray = new Recipe[4];
		expectedArray[0] = test5;
		expectedArray[1] = test2;
		expectedArray[2] = test3;
		expectedArray[3] = test4;
		
		//assertEquals(test5, this.rb.getRecipes()[0]);
		
		
	}
	
	@Test
	void test_addNullRecipe() {
		assertEquals(false, this.rb.addRecipe(null));
	}
	
	@Test
	void test_addBlankRecipe() {
		assertEquals(true, this.rb.addRecipe(new Recipe()));
	}
	
	
	@Test
	void test_deleteRecipe() { 
		this.rb.addRecipe(this.recipe);
		assertEquals("Test Recipe", this.rb.deleteRecipe(0));
		Recipe [] recipes = this.rb.getRecipes();
		assertEquals(null, recipes[0]);
	}
	
	@Test
	void test_deleteNonExistentRecipe() {
		
	}
	@Test
	void test_deleteNoRecipesExist() {
		
	}
	
	@Test
	void test_editRecipe() {
		
	}
	
	@Test
	void test_editNullRecipe() {
		
	}
	
	@Test
	void test_editSameRecipe() {
		
	}
	

}
