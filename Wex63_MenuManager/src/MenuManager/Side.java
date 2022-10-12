package MenuManager;

/**
 * Class Side
 * author : Wenjie
 * created: 10/12/2022
 */


public class Side {
	String name;
	String description;
	int calories;

	
	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
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


	//constructor
	public Side(String name, String description, int calories) {
		this.name = name;
		this.description=description;
		this.calories=calories;
	}

}
