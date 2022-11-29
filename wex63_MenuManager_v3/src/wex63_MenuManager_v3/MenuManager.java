package wex63_MenuManager_v3;
/**
 * Class MenuManager
 * author : Wenjie
 * created:  11/28/2022
 */


import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	//constructor
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> listMenuItem=FileManager.readItems(dishesFile);
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();

		for(MenuItem item:listMenuItem){
			if(item instanceof Entree){
				entrees.add((Entree) item);
			}
			if(item instanceof Side){
				sides.add((Side) item);
			}if(item instanceof Salad){
				salads.add((Salad) item);
			}if(item instanceof Dessert){
				desserts.add((Dessert) item);
			}
		}
	}

	//methods
	public Menu randomMenu(String name){
		Random r = new Random();
		Menu m = new Menu();
		m.setName(name);
		m.setEntree(this.entrees.get(r.nextInt(0, entrees.size())));
		m.setSide(this.sides.get(r.nextInt(0,sides.size())));
		m.setSalad(this.salads.get(r.nextInt(0, salads.size())));
		m.setDessert(this.desserts.get(r.nextInt(0, desserts.size())));
		return m;

	}

	public Menu minCaloriesMenu(String name){
		Menu m=new Menu();
		m.setName(name);

		//look for the entree that has the lowest calories
		int minCalOfEntree=entrees.get(0).getCalories();
		int indexOfMinCal1=0;
		for(int i = 0;i<entrees.size();i++){
			if(entrees.get(i).getCalories()<minCalOfEntree){
				minCalOfEntree=entrees.get(i).getCalories();
				indexOfMinCal1=i;
			}
		}
		m.setEntree(entrees.get(indexOfMinCal1));

		//look for the side that has the lowest calories
		int minCalOfSide=sides.get(0).getCalories();
		int indexOfMinCal2=0;
		for(int i = 0;i<sides.size();i++){
			if(sides.get(i).getCalories()<minCalOfSide){
				minCalOfSide=sides.get(i).getCalories();
				indexOfMinCal2=i;
			}
		}
		m.setSide(sides.get(indexOfMinCal2));

		//look for the Salad that has the lowest calories
		int minCalOfSalad=sides.get(0).getCalories();
		int indexOfMinCal3=0;
		for(int i = 0;i<salads.size();i++){
			if(salads.get(i).getCalories()<minCalOfSalad){
				minCalOfSalad=salads.get(i).getCalories();
				indexOfMinCal3=i;
			}
		}
		m.setSalad(salads.get(indexOfMinCal3));

		//look for the dessert that has the lowest calories
		int minCalOfDessert=desserts.get(0).getCalories();
		int indexOfMinCal4=0;
		for(int i = 0;i<desserts.size();i++){
			if(desserts.get(i).getCalories()<minCalOfDessert){
				minCalOfDessert=desserts.get(i).getCalories();
				indexOfMinCal4=i;
			}
		}
		m.setDessert(desserts.get(indexOfMinCal4));

		return m;

	}

	public Menu maxCaloriesMenu(String name){
		Menu m=new Menu();
		m.setName(name);

		//look for the entree that has the lowest calories
		int maxCalOfEntree=entrees.get(0).getCalories();
		int indexOfMaxCal1=0;
		for(int i = 0;i<entrees.size();i++){
			if(entrees.get(i).getCalories()>maxCalOfEntree){
				maxCalOfEntree=entrees.get(i).getCalories();
				indexOfMaxCal1=i;
			}
		}
		m.setEntree(entrees.get(indexOfMaxCal1));

		//look for the side that has the lowest calories
		int maxCalOfSide=sides.get(0).getCalories();
		int indexOfMaxCal2=0;
		for(int i = 0;i<sides.size();i++){
			if(sides.get(i).getCalories()<maxCalOfSide){
				maxCalOfSide=sides.get(i).getCalories();
				indexOfMaxCal2=i;
			}
		}
		m.setSide(sides.get(indexOfMaxCal2));

		//look for the Salad that has the lowest calories
		int maxCalOfSalad=salads.get(0).getCalories();
		int indexOfMaxCal3=0;
		for(int i = 0;i<salads.size();i++){
			if(salads.get(i).getCalories()<maxCalOfSalad){
				maxCalOfSalad=salads.get(i).getCalories();
				indexOfMaxCal3=i;
			}
		}
		m.setSalad(salads.get(indexOfMaxCal3));

		//look for the dessert that has the lowest calories
		int maxCalOfDessert=desserts.get(0).getCalories();
		int indexOfMaxCal4=0;
		for(int i = 0;i<desserts.size();i++){
			if(desserts.get(i).getCalories()<maxCalOfDessert){
				maxCalOfDessert=desserts.get(i).getCalories();
				indexOfMaxCal4=i;
			}
		}
		m.setDessert(desserts.get(indexOfMaxCal4));

		return m;


	}



	//getters and setters
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
}

