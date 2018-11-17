package makingBurgers;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IngredientsList Burger1 = new IngredientsList();
		IngredientsList Burger2 = new IngredientsList();
		IngredientsList Burger3 = new IngredientsList();
		IngredientsList Burger4 = new IngredientsList();
		Burger1 = orderBeefBurger();
		Burger2 = orderCheeseBurger();
		Burger3 = orderChickenBurger();
		Burger4 = orderMonsterBurger();
		
		System.out.print("Beef Burgers contain: ");
		Burger1.printList();
		System.out.println();
		
		System.out.print("Cheese Burgers contain: ");
		Burger2.printList();
		System.out.println();
		
		System.out.print("Chicken Burgers contain: ");
		Burger3.printList();
		System.out.println();
		
		System.out.print("Monster Burgers contain: ");
		Burger4.printList();
		System.out.println();
	}
	
	public static IngredientsList orderBeefBurger()
	{
		IngredientsList newBurger = new IngredientsList();
		newBurger.addBottomBun();
		newBurger.addBeefPatty();
		newBurger.addTopBun();
		return newBurger;
	}
	
	public static IngredientsList orderCheeseBurger()
	{
		IngredientsList newBurger = new IngredientsList();
		newBurger.addBottomBun();
		newBurger.addBeefPatty();
		newBurger.addCheese();
		newBurger.addTopBun();
		return newBurger;
	}
	
	public static IngredientsList orderChickenBurger()
	{
		IngredientsList newBurger = new IngredientsList();
		newBurger.addBottomBun();
		newBurger.addChickenPatty();
		newBurger.addLettuce();
		newBurger.addTopBun();
		return newBurger;
	}
	
	public static IngredientsList orderMonsterBurger()
	{
		IngredientsList newBurger = new IngredientsList();
		newBurger.addBottomBun();
		newBurger.addBeefPatty();
		newBurger.addChickenPatty();
		newBurger.addCheese();
		newBurger.addLettuce();
		newBurger.addTopBun();
		return newBurger;
	}

}
