package MenuManager;

/**
 * Class Salad
 * author : Wenjie
 * created: 10/12/2022
 */

public class Salad {
	String name;
	String description;
	int calories;

	//constructor
	public Salad(String name, String description, int calories) {
		this.name = name;
		this.description=description;
		this.calories=calories;
	}


	//setters and getters
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

