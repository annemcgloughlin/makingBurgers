package makingBurgers;

public class Ingredient 
{
	String ingredientType = new String();
	float price;
	Ingredient next;
	
	Ingredient(String ingred, float myPrice)
	{
		ingredientType = ingred;
		price = myPrice;
		next = null;
	}
	

}
