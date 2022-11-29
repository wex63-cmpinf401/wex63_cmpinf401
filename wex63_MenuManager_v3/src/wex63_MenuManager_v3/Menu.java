package wex63_MenuManager_v3;

/**
 * Class Menu
 * author : Wenjie
 * created: 10/12/2022
 */

public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}


	//constructor
	public Menu(String name) {
		this.name = name;
		this.entree=null;
		this.side=null;
		this.salad=null;
		this.dessert=null;

	}
	public Menu() {
	}
	public Menu(String name,Entree entree,Side side) {
		this.name = name;
		this.entree=entree;
		this.side=side;
		this.salad=null;
		this.dessert=null;


	}
	public Menu(String name,Entree entree,Side side,Salad salad,Dessert dessert) {
		this.name =name;
		this.entree=entree;
		this.side=side;
		this.salad=salad;
		this.dessert=dessert;
	} 


	//method Entree entries,Side side,Salad Salad ,Dessert dessert

	public int totalCalories() {
		int entreeC;
		int sideC;
		int saladC;
		int dessertC;

		if(entree==null) {
			entreeC = 0;
		}else{
			entreeC = entree.getCalories();
		}
		if(side==null) {
			sideC = 0;
		}else{
			sideC = side.getCalories();
		}
		if(salad==null) {
			saladC =0;
		}else{
			saladC =salad.getCalories();
		}
		if(dessert==null) {
			dessertC=0;
		}else{
			dessertC=dessert.getCalories();
		}
		int total = entreeC+sideC+saladC+dessertC;
		//System.out.println("Total Calories is "+total);
		return total;
	}
	public double totalPrice() {
		double entreeC;
		double sideC;
		double saladC;
		double dessertC;

		if(entree==null) {
			entreeC = 0;
		}else{
			entreeC = entree.getPrice();
		}
		if(side==null) {
			sideC = 0;
		}else{
			sideC = side.getPrice();
		}
		if(salad==null) {
			saladC =0;
		}else{
			saladC =salad.getPrice();
		}
		if(dessert==null) {
			dessertC=0;
		}else{
			dessertC=dessert.getPrice();
		}
		double total = entreeC+sideC+saladC+dessertC;
		//System.out.println("Total Calories is "+total);
		return total;
	}

	//method
	public String description() {
		String s = "";
		if (entree==null) {
			s += "Entree: N/A\n ";
		}else {
			s += "Entree: "+entree.getDescription()+"\n";
		}
		if (salad==null) {
			s+="Salad:N/A\n";
			//System.out.println("Salad: N/A ");
		}else {
			s+="Salad: "+salad.getDescription()+"\n";
			//System.out.println("Salad: "+salad.getDescription());
		}
		if (side==null) {
			s+="Side: N/A \n";
			//System.out.println("Side: N/A ");
		}else {
			s+="Side: "+side.getDescription()+"\n";
			//System.out.println("Side: "+side.getDescription());
		}
		if (dessert==null) {
			s+="Dessert: N/A \n";
			//System.out.println("Dessert: N/A ");
		}else {
			s+="Dessert: "+dessert.getDescription();
			//System.out.println("Dessert: "+dessert.getDescription());
		}
		return s;

	}

	@Override
	public String toString() {
		return "Menu{" +
				"name='" + name + '\'' +
				", entree=" + entree +
				", salad=" + salad +
				", side=" + side +
				", dessert=" + dessert +
				'}';
	}

}
