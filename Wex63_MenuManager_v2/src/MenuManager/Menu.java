package MenuManager;

/**
 * Class Menu
 * author : Wenjie
 * created: 10/12/2022
 */

public class Menu {
	String name;
	Entree entree;
	Salad salad;
	Side side;
	Dessert dessert;

	//setters ad getters
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
	
	
	
	
	//constructors

	public Menu() {
		
	}
	public Menu(String name) {
		this.name = name;
		this.entree=null;
		this.side=null;
		this.salad=null;
		this.dessert=null;
		
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
	
	
	//method 
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
		}else {
			s+="Salad: "+salad.getDescription()+"\n";
		}
		if (side==null) {
			s+="Side: N/A \n";
		}else {
			s+="Side: "+side.getDescription()+"\n";
		}
		if (dessert==null) {
			s+="Dessert: N/A \n";
		}else {
			s+="Dessert: "+dessert.getDescription();
		}
		return s;
		
		
		
		
	}
	
	

}

