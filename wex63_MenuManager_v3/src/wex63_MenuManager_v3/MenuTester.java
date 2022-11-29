package wex63_MenuManager_v3;

/**
 * Class MenuTester
 * author : Wenjie
 * created:  11/28/2022
 */


import java.util.ArrayList;

public class MenuTester {
	public static void main(String[] args) {

		//      MenuRandomize randomize = new MenuRandomize("data/entrees.txt", "data/sides.txt","data/salads.txt","data/desserts.txt");
		//
		//      Menu myMenu = randomize.randomMenu();
		//
		//      System.out.println(myMenu.description()+"\nTotal calories: "+ myMenu.totalCalories());



		MenuManager manager = new MenuManager("data/dishes.txt");
		ArrayList<Menu> menus = new ArrayList<>();

		//make menu randomly
		for (int i = 1; i <= 4; i++) {
			Menu myMenu = manager.randomMenu("Menu name" + i);
			System.out.println(myMenu.toString() + myMenu.description() +"\n"+"Total calories: " + myMenu.totalCalories()
			+ "\nTotal price: " + myMenu.totalPrice());
			System.out.println("--------------------------------");
			menus.add(myMenu);
		}

		//look for the menu with lowest and highest calories
		Menu menuLow = manager.minCaloriesMenu("Menu with Lowest Calories");
		Menu menuHigh = manager.maxCaloriesMenu("Menu with Highest Calories");

		System.out.println(menuLow.toString() + menuLow.description() +"\n"+"Total calories: "
				+ menuLow.totalCalories() + "\nTotal price: " + menuLow.totalPrice());
		System.out.println("--------------------------------");

		System.out.println(menuHigh.toString() + menuHigh.description() + "\n"+"Total calories: "
				+ menuHigh.totalCalories() + "\nTotal price: " + menuHigh.totalPrice());
		menus.add(menuLow);
		menus.add(menuHigh);

		//make random menus and lowest-calories/high-calories menus a txt file.
		FileManager.writeMenu("data/menusTest.txt", menus);


	}
}



