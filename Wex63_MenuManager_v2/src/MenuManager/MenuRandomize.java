package MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	 public ArrayList<Entree> entrees;
	    public ArrayList<Side> sides;
	    public ArrayList<Salad> salads;
	    public ArrayList<Dessert> desserts;

	    public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile){
	        this.entrees = FileManager.readEntrees(entreeFile);
	        this.sides = FileManager.readSides(sideFile);
	        this.salads=FileManager.readSalads(saladFile);
	        this.desserts=FileManager.readDesserts(dessertFile);
	    }
	    public Menu randomMenu(){
	        Random r = new Random();
	        Menu m = new Menu();
	        m.setEntree(this.entrees.get(r.nextInt(0,5)));
	        m.setSide(this.sides.get(r.nextInt(0,5)));
	        m.setSalad(this.salads.get(r.nextInt(0,5)));
	        m.setDessert(this.desserts.get(r.nextInt(0,5)));
	        return m;

	    }

}
