package MenuManager;

/**
 * Class Dessert
 * author : Wenjie
 * created: 10/12/2022
 */


public class Dessert {
	String name;
	String description;
	int calories;
	
	//constructor
	public Dessert(String name, String description, int calories) {
		this.name = name;
		this.description=description;
		this.calories=calories;
	}

	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.name+"."+this.description;
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

}
