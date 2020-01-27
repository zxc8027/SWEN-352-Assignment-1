package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;


public class RecipeBookTest extends TestCase {
	private Recipe recipe;
    private RecipeBook rb;

	protected void setUp() throws Exception {
		super.setUp();
		this.recipe = new Recipe();
		this.recipe.setName("Test Recipe");
		this.recipe.setPrice("1");
		this.recipe.setAmtChocolate("1");
		this.recipe.setAmtCoffee("1");
		this.recipe.setAmtMilk("2");
		this.recipe.setAmtSugar("2");
		
		this.rb = new RecipeBook();
	}

	public void test_getRecipeWithExistingRecipe() {
		this.rb.addRecipe(this.recipe);
		assertEquals(this.rb.getRecipes().length, 4);
		assertEquals(this.recipe.getName(), this.rb.getRecipes()[0].getName());
		assertEquals(this.recipe, this.rb.getRecipes()[0]);
	}
	
	public void test_getRecipeWithNoExistingRecipe() {
		for( int i = 0; i < this.rb.getRecipes().length; i++) {
			assertEquals(null, this.rb.getRecipes()[i]);
		}
	}
	
	
	public void test_addRecipe() {
		this.rb.addRecipe(this.recipe);
		assertEquals(this.recipe, this.rb.getRecipes()[0]);
	}
	
	
	
	public void test_addingAllRecipes() throws Exception {
		
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
		test3.setName("Test Recipe3");
		test3.setPrice("3");
		test3.setAmtChocolate("3");
		test3.setAmtCoffee("3");
		test3.setAmtMilk("6");
		test3.setAmtSugar("6");
		this.rb.addRecipe(test3);

		Recipe test4 = new Recipe();
		test4.setName("Test Recipe4");
		test4.setPrice("4");
		test4.setAmtChocolate("4");
		test4.setAmtCoffee("4");
		test4.setAmtMilk("8");
		test4.setAmtSugar("8");
		this.rb.addRecipe(test4);
		
		Recipe [] expectedArray = new Recipe[4];
		expectedArray[0] = this.recipe;
		expectedArray[1] = test2;
		expectedArray[2] = test3;
		expectedArray[3] = test4;

		
		Recipe [] actualArray = this.rb.getRecipes();
		for(int i = 0; i < expectedArray.length; i++) {
			assertEquals(expectedArray[i], actualArray[i]);
		}
	}
	
	public void test_addSameRecipe() {
		this.rb.addRecipe(this.recipe);
		assertEquals(this.recipe, this.rb.getRecipes()[0]);
		this.rb.addRecipe(this.recipe);
		assertEquals(null, this.rb.getRecipes()[1]);
	}
	
	
	public void test_rolloverRecipe() throws Exception {
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
		test3.setName("Test Recipe3");
		test3.setPrice("3");
		test3.setAmtChocolate("3");
		test3.setAmtCoffee("3");
		test3.setAmtMilk("6");
		test3.setAmtSugar("6");
		
		this.rb.addRecipe(test3);

		Recipe test4 = new Recipe();
		test4.setName("Test Recipe4");
		test4.setPrice("4");
		test4.setAmtChocolate("4");
		test4.setAmtCoffee("4");
		test4.setAmtMilk("8");
		test4.setAmtSugar("8");
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
		expectedArray[0] = this.recipe;
		expectedArray[1] = test2;
		expectedArray[2] = test3;
		expectedArray[3] = test4;
		
		Recipe [] actualArray = this.rb.getRecipes();
		for(int i = 0; i < expectedArray.length; i++) {
			assertEquals(expectedArray[i], actualArray[i]);
		}		
	}
	
	
	public void test_addNullRecipe() {
		assertEquals(false, this.rb.addRecipe(null));
	}
	
	
	public void test_addBlankRecipe() {
		assertEquals(true, this.rb.addRecipe(new Recipe()));
	}
	
	
	
	public void test_deleteRecipe() { 
		this.rb.addRecipe(this.recipe);
		assertEquals("Test Recipe", this.rb.deleteRecipe(0));
		Recipe [] recipes = this.rb.getRecipes();
		assertEquals(null, recipes[0]);
	}
	

	
	public void test_deleteNoRecipesExist() {
		assertEquals(null, this.rb.deleteRecipe(0));
	}
	
	
	public void test_editRecipe() throws Exception {
		assertEquals(true, this.rb.addRecipe(this.recipe));
		this.recipe.setAmtChocolate("10");
		assertEquals("Test Recipe", this.rb.editRecipe(0, this.recipe));
		assertEquals(this.recipe.getName(), this.rb.getRecipes()[0].getName());
	}
	
	
	public void test_editNullRecipe() {
		assertEquals(null, this.rb.editRecipe(0, this.recipe));
	}


}
