package MenuManager;

public class MenuTest {

	public static void main(String[] args) {
		//create Entree's objects
		Entree entree1= new Entree("entree1","entree1 description",125);
		Entree entree2= new Entree("entree2","entree2 description",100);
		
		//create Side's object
		Side side1 = new Side("side1","side1 description",20);
		
		//create Salad's objects
		Salad salad1= new Salad("salad1","salad1 description",50);
		Salad salad2= new Salad("salad2","salad2 description",60);
		
		//create Dessert's objects
		Dessert dessert1= new Dessert("dessert1","dessert1 description",120);
		
		//create Menu's objects
		Menu m1= new Menu("firstMenu",entree1,side1,salad1,dessert1);
		Menu m2= new Menu("secondMenu");
		m2.entree=entree2;
		m2.salad=salad2;


		m1.description();
		m1.totalCalories();

		
		System.out.println("-----------------");

		m2.description();
		m2.totalCalories();


	}

}
