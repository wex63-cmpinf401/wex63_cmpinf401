package wex63_MenuManager_v3;

/**
 * Class MenuItem
 * author : Wenjie
 * created: 11/28/2022
 */


public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;

	public MenuItem(String name, String desc, int cal,double price){
		this.name=name;
		this.description=desc;
		this.calories=cal;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.name+". "+this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}


}
