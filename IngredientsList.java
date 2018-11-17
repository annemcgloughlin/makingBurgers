package makingBurgers;
import java.util.*;

public class IngredientsList {
	
	public LinkedList<Ingredient> ingredients;
	
	IngredientsList()
	{
		ingredients = new LinkedList<Ingredient>(); 
	}
	
	public void addIngredient(String toAdd, float price, LinkedList<Ingredient> ingredientsList)
	{
		Ingredient Misc = new Ingredient(toAdd, price);
		ingredients.add(Misc);
	}
	
	public void addCheese(){
		Ingredient Cheese = new Ingredient("Cheese", 0.5f);
		ingredients.add(Cheese);
	}
	
	public void addLettuce(){
		Ingredient Lettuce = new Ingredient("Lettuce", 0.2f);
		ingredients.add(Lettuce);
	}
	
	public void addTopBun(){
		Ingredient TopBun = new Ingredient("Top Bun", 0.25f);
		ingredients.add(TopBun);
	}
	
	public void addBottomBun(){
		Ingredient BottomBun = new Ingredient("Bottom Bun", 0.25f);
		ingredients.add(BottomBun);
	}
	
	public void addBeefPatty(){
		Ingredient MeatPatty = new Ingredient("Meat Patty", 2f);
		ingredients.add(MeatPatty);
	}
	
	public void addChickenPatty(){
		Ingredient ChickenPatty = new Ingredient("Chicken Patty", 2f);
		ingredients.add(ChickenPatty);
	}
	
	public void printList()
	{
		for(Ingredient ingredient: ingredients)
		{
			System.out.print(ingredient.ingredientType + ", ");
		}
	}

}
