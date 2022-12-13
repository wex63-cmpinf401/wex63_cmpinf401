/**
 * Class MenuManagerGUI
 * @author : Wenjie
 * @created: 12/12/2022
 */


package wex63_MenuManager_final;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;





public class MenuManagerGUI {
	private JFrame mainWindow,childWindow;
	private JLabel lblEntree, lblSide, lblSalad,lblDessert,lblCreate,lblChildEntree, lblChildSide,
	lblChildSalad, lblChildDessert, lblCalories, lblPrice;
	private JComboBox jcboEntree, jcboSide, jcboSalad,jcboDessert;
	private JButton jbtCreate, jbtRandom,jbtMinimum, jbtMaximum,jbtDetails,jbtSave,jbtDelete;
	private JPanel panelBuild,panelGenerate,panelCreated,mainPanel;
	private MenuManager manager;
	private JList<String> menuList;
	private DefaultListModel<String> menuModel = new DefaultListModel<>();
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private JTextField txtFCalories,txtFPrice;
	private JTextArea txtEntree,txtSide,txtSalad,txtDessert;


	public static void main(String[] args) {
		MenuManagerGUI test = new MenuManagerGUI();
	}

	//constructor
	public MenuManagerGUI() {
		this.manager = new MenuManager("data/dishes.txt");
		buildMainWindow();
	}



	/**
	 * This is a method for building the main Window
	 * param args Unused.
	 * @return nothing
	 */
	private void buildMainWindow() {
		//create a the mainWindow frame
		mainWindow = new JFrame("Menu Manager");
		mainWindow.setBounds(500, 100, 700, 500);
		mainWindow.setLayout(null);
		mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//-------------------------------------------

		//create mainPanel
		this.mainPanel=new JPanel();
		this.mainPanel.setLayout(null);
		this.mainPanel.setBounds(mainWindow.getX(), mainWindow.getY(), mainWindow.getWidth(), mainWindow.getHeight());
		this.mainWindow.setContentPane(mainPanel);
		//-------------------------------------------
		//create a panel for "Build your own Menu"
		this.panelBuild=new JPanel();
		this.panelBuild.setBounds(10,10, 350,250);
		this.panelBuild.setLayout(null);
		Border blackline=BorderFactory.createLineBorder(Color.black);
		TitledBorder title1 = BorderFactory.createTitledBorder("Build your own Menu");
		this.panelBuild.setBorder(title1);
		this.mainPanel.add(panelBuild);

		//create labels for p1
		this.lblEntree = new JLabel("Entree");
		this.lblEntree.setBounds(panelBuild.getX()+10,panelBuild.getY()+20,50,20);
		this.panelBuild.add(lblEntree);

		this.lblSide = new JLabel("Side");
		this.lblSide.setBounds(panelBuild.getX()+10,panelBuild.getY()+55,50,20);
		this.panelBuild.add(lblSide);	

		this.lblSalad = new JLabel("Salad");
		this.lblSalad.setBounds(panelBuild.getX()+10,panelBuild.getY()+90,50,20);
		this.panelBuild.add(lblSalad);		

		this.lblDessert = new JLabel("Dessert");
		this.lblDessert.setBounds(panelBuild.getX()+10,panelBuild.getY()+125,50,20);
		this.panelBuild.add(lblDessert);

		//create combobox for p1
		//Entree combobox
		this.jcboEntree = new JComboBox();
		this.jcboEntree.setBounds(lblEntree.getX()+90, lblEntree.getY(),200,20);
		//add the name of Entree in the box
		for(int i=0;i<manager.getEntrees().size();i++) {
			jcboEntree.addItem(manager.getEntrees().get(i));
		}
		this.jcboEntree.addItem("null");
		this.panelBuild.add(jcboEntree);

		//Side combobox
		this.jcboSide = new JComboBox();
		this.jcboSide.setBounds(lblSide.getX()+90, lblSide.getY(),200,20);
		//add the name of Side in the box
		for(int i=0;i<manager.getSides().size();i++) {
			jcboSide.addItem(manager.getSides().get(i));
		}	
		this.jcboSide.addItem("null");
		this.panelBuild.add(jcboSide);

		//Salad combobox
		this.jcboSalad = new JComboBox();
		this.jcboSalad.setBounds(lblSalad.getX()+90, lblSalad.getY(),200,20);
		//add the name of Salad in the box
		for(int i=0;i<manager.getSalads().size();i++) {
			jcboSalad.addItem(manager.getSalads().get(i));
		}	
		this.jcboSalad.addItem("null");
		this.panelBuild.add(jcboSalad);

		//Dessert combobox
		this.jcboDessert = new JComboBox();
		this.jcboDessert.setBounds(lblDessert.getX()+90, lblDessert.getY(),200,20);
		//add the name of Dessert in the box
		this.jcboDessert.addItem("null");
		for(int i=0;i<manager.getDesserts().size();i++) {
			jcboDessert.addItem(manager.getDesserts().get(i));
		}	
		this.panelBuild.add(jcboDessert);

		//create a button for p1
		this.jbtCreate = new JButton("Create Menu with these dishes");
		this.jbtCreate.setBounds(panelBuild.getX()+10,panelBuild.getY()+180,280,20);
		this.panelBuild.add(jbtCreate);


		//-------------------------------------------
		//create a panel for "Or generate a Menu"
		this.panelGenerate=new JPanel();
		this.panelGenerate.setLayout(null);
		this.panelGenerate.setBounds(10,260, 350,200);
		BorderFactory.createLineBorder(Color.black);
		TitledBorder title2 = BorderFactory.createTitledBorder("Or generate a Menu");
		this.panelGenerate.setBorder(title2);
		this.mainPanel.add(panelGenerate);		

		//create buttons for panel2
		this.jbtRandom = new JButton("Generate a Random Menu");
		this.jbtRandom.setBounds(40,30,280,30);
		this.panelGenerate.add(jbtRandom);

		this.jbtMinimum = new JButton("Generate a Minimum Calories Menu");
		this.jbtMinimum.setBounds(jbtRandom.getX(),jbtRandom.getY()+jbtRandom.getHeight()+20,jbtRandom.getWidth(),jbtRandom.getHeight());
		this.panelGenerate.add(jbtMinimum);

		this.jbtMaximum = new JButton("Generate a Maximum Calories Menu");
		this.jbtMaximum.setBounds(jbtRandom.getX(),jbtRandom.getY()+2*jbtRandom.getHeight()+40,jbtRandom.getWidth(),jbtRandom.getHeight());
		this.panelGenerate.add(jbtMaximum);



		//-------------------------------------------
		//make a label for"Created Menu"
		this.lblCreate = new JLabel("Created Menu");
		this.lblCreate.setBounds(380,20,180,10);
		this.mainPanel.add(lblCreate);

		//create a panel for "Created Menu"
		this.panelCreated=new JPanel();
		this.panelCreated.setLayout(null);
		this.panelCreated.setBorder(BorderFactory.createTitledBorder(""));
		this.panelCreated.setBounds(panelBuild.getWidth()+30,panelBuild.getY()+30,panelBuild.getWidth()-40,panelBuild.getHeight()+130);
		this.mainPanel.add(panelCreated);

		//create menuList in p3
		this.menuList = new JList(menuModel);
		this.menuList.setBounds(10,10,panelCreated.getWidth()-20,panelCreated.getHeight()-20);
		this.menuList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.menuList.setVisibleRowCount(12);
		//this.menuList.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelCreated.add(menuList);


		//create buttons for"Details","Delete all","Save to file"
		this.jbtDetails=new JButton("Details");
		this.jbtDetails.setBounds(panelCreated.getX(),panelCreated.getY()+panelCreated.getHeight()+13,80,20);
		this.jbtDelete=new JButton("Delete all");
		this.jbtDelete.setBounds(jbtDetails.getX()+115,jbtDetails.getY(),80,20);		
		this.jbtSave=new JButton("Save to file");
		this.jbtSave.setBounds(jbtDetails.getX()+229,jbtDetails.getY(),80,20);
		mainPanel.add(jbtDetails);
		mainPanel.add(jbtDelete);
		mainPanel.add(jbtSave);

		//------------------------------------------
		//add ActionListener for the button of"Create Menu with these dishes"
		jbtCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String createInput = JOptionPane.showInputDialog("Please enter a name for menu: ");
				if(createInput==null||createInput.equals("")) {
					JOptionPane.showMessageDialog(null,"It cannnot be null");
					return;
				}
				Entree entree = jcboEntree.getSelectedItem()=="null"?null: (Entree) jcboEntree.getSelectedItem();
				Side side = jcboSide.getSelectedItem()=="null"?null: (Side) jcboSide.getSelectedItem();
				Salad salad = jcboSalad.getSelectedItem()=="null"?null: (Salad) jcboSalad.getSelectedItem();
				Dessert dessert = jcboDessert.getSelectedItem()=="null"?null: (Dessert) jcboDessert.getSelectedItem();
				Menu menu = new Menu(createInput,entree,side,salad,dessert);
				menus.add(menu);
				menuModel.addElement(menu.getName());
				menuList.setModel(menuModel);
			}
		});

		//add ActionListener for the button of"Generate a random Menu"
		jbtRandom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String randomInput = JOptionPane.showInputDialog("Please enter a name for menu: ");
				if(randomInput==null||randomInput.equals("")) {
					JOptionPane.showMessageDialog(null, "It cannnot be null");
					return;
				}
				Menu menu = manager.randomMenu(randomInput);
				menus.add(menu);
				menuModel.addElement(menu.getName());
				menuList.setModel(menuModel);
			}
		});


		//add ActionListeners and ActionHandlers to the button of "Generate a Minimum Calories Menu" 
		jbtMinimum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Menu menu = manager.minCaloriesMenu("Menu with Minimum Calories");
				menus.add(menu);
				menuModel.addElement(menu.getName());
				menuList.setModel(menuModel);
			}
		});


		//add ActionListeners and ActionHandlers to the button of "Generate a Maximum Calories Menu"

		jbtMaximum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Menu menu = manager.maxCaloriesMenu("Menu with Maximum Calories");
				menus.add(menu);
				menuModel.addElement(menu.getName());
				menuList.setModel(menuModel);
			}
		});

		//add ActionListeners and ActionHandlers to the button of Details
		jbtDetails.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int curIndex = menuList.getSelectedIndex();
				if(curIndex == -1) {
					JOptionPane.showMessageDialog(null, "Invalid. You have to choose a menu to see the details.");
					return;
				}
				Menu curMenu = menus.get(curIndex);
				createChildWindow(curMenu);
			}
		});


		//add ActionListeners and ActionHandlers to the button of Delete all
		jbtDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menus.removeAll(menus);
				menuModel.removeAllElements();
				menuList.setModel(menuModel);
			}
		});


		//  Add ActionListeners and ActionHandlers to the button of "Save to file"
		jbtSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(menus.size()==0) {
					JOptionPane.showMessageDialog(null, "Invalid. There is no menu created.");
					return;
				}
				//write files
				FileManager.writeMenu("data/menus.txt", menus);
				JOptionPane.showMessageDialog(null, "Saved Successfully!");
			}
		});


		mainWindow.setVisible(true);

	}

	/**
	 * This method is for creating a new child Window for the button "details" in the mainWindow.
	 * param args Unused.
	 * @return nothing.
	 */
	public void createChildWindow(Menu menu) {
		this.childWindow=new JFrame("Menu: "+menu.getName());
		childWindow.setLayout(null);
		childWindow.setBounds(500, 180, 700, 680);

		//create the label and  the text area for the Entree
		lblChildEntree = new JLabel("Entree");
		lblChildEntree.setBounds(40,30,jcboEntree.getWidth()+30,jcboSide.getHeight());
		String entreeString = "";
		txtEntree = new JTextArea();
		//this is for checking the situation for null
		if(menu.getEntree()!=null) {
			entreeString = menu.getEntree().getName()+"\n"+menu.getEntree().getDescription()
					+".\nCalories: "+menu.getEntree().getCalories()+"\nPrice:$ "+menu.getEntree().getPrice();}
		else {entreeString = "N/A";}

		txtEntree = new JTextArea(entreeString);
		txtEntree.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtEntree.setLineWrap(true);
		txtEntree.setWrapStyleWord(true);
		txtEntree.setBounds(lblChildEntree.getX()+lblChildEntree.getWidth()-10,lblChildEntree.getY(),
				childWindow.getWidth()-lblChildEntree.getWidth()-120,jbtRandom.getHeight()*2+50);
		txtEntree.setEditable(false);
		childWindow.getContentPane().add(lblChildEntree);
		childWindow.getContentPane().add(txtEntree);


		//create the label and  the text area for the Side
		lblChildSide = new JLabel("Side");
		lblChildSide.setBounds(lblChildEntree.getX(),txtEntree.getY()+txtEntree.getHeight()+20,
				lblChildEntree.getWidth(),lblChildEntree.getHeight());

		txtSide = new JTextArea();
		String sideString="";
		//this is for checking the situation for null
		if(menu.getSide()!=null) {
			sideString = menu.getSide().getName()+"\n"+menu.getSide().getDescription()
					+".\nCalories: "+menu.getSide().getCalories()+"\nPrice:$ "+menu.getSide().getPrice();}
		else{sideString="N/A";}
		txtSide = new JTextArea(sideString);
		txtSide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtSide.setLineWrap(true);
		txtSide.setWrapStyleWord(true);
		txtSide.setBounds(txtEntree.getX(),lblChildSide.getY(),txtEntree.getWidth(),txtEntree.getHeight());
		txtSide.setEditable(false);
		childWindow.getContentPane().add(lblChildSide);
		childWindow.getContentPane().add(txtSide);

		//create the label and the text area for the Salad
		lblChildSalad = new JLabel("Salad");
		lblChildSalad.setBounds(lblChildSide.getX(),lblChildSide.getY()+txtSide.getHeight()+20,
				lblChildSide.getWidth(),lblChildSide.getHeight());

		txtSalad = new JTextArea();
		String saladString="";
		//this is for checking the situation for null
		if(menu.getSalad()!=null) {
			saladString = menu.getSalad().getName()+"\n"+menu.getSalad().getDescription()
					+".\nCalories: "+menu.getSalad().getCalories()+"\nPrice:$ "+menu.getSalad().getPrice();}
		else{saladString="N/A";}
		txtSalad = new JTextArea(saladString);
		txtSalad.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtSalad.setLineWrap(true);
		txtSalad.setWrapStyleWord(true);
		txtSalad.setBounds(txtSide.getX(),lblChildSalad.getY(),txtSide.getWidth(),txtSide.getHeight());
		txtSalad.setEditable(false);
		childWindow.getContentPane().add(lblChildSalad);
		childWindow.getContentPane().add(txtSalad);

		//create the label and the text area for the Dessert
		lblChildDessert = new JLabel("Dessert");
		lblChildDessert.setBounds(lblChildSalad.getX(),lblChildSalad.getY()+txtSalad.getHeight()+20,
				lblChildSalad.getWidth(),lblChildSalad.getHeight());
		txtDessert = new JTextArea();
		String dessertString="";
		//this is for checking the situation for null
		if(menu.getDessert()!=null) {
			dessertString = menu.getDessert().getName()+"\n"+menu.getDessert().getDescription()
					+".\nCalories: "+menu.getDessert().getCalories()+"\nPrice:$ "+menu.getDessert().getPrice();}
		else {dessertString="N/A";}
		txtDessert = new JTextArea(dessertString);
		txtDessert.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtDessert.setLineWrap(true);
		txtDessert.setWrapStyleWord(true);
		txtDessert.setBounds(txtSalad.getX(),lblChildDessert.getY(),txtSalad.getWidth(),txtSalad.getHeight());
		txtDessert.setEditable(false);
		childWindow.getContentPane().add(lblChildDessert);
		childWindow.getContentPane().add(txtDessert);


		//Create the label and text field for total calories
		lblCalories = new JLabel("Total calories:");
		lblCalories.setBounds(lblChildEntree.getX(),txtDessert.getY()+txtDessert.getHeight()+20
				,lblChildEntree.getWidth(),lblChildEntree.getHeight());

		String cal = String.valueOf(menu.totalCalories());
		txtFCalories = new JTextField(cal);

		txtFCalories.setBounds(txtDessert.getX(),lblCalories.getY(),lblCalories.getWidth()-150,jbtCreate.getHeight());
		txtFCalories.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtFCalories.setEditable(false);
		childWindow.getContentPane().add(lblCalories);
		childWindow.getContentPane().add(txtFCalories);

		//Create the label and text field for total price
		lblPrice = new JLabel("Total Price: $");
		lblPrice.setBounds(lblCalories.getX(),lblCalories.getY()+lblCalories.getHeight()+20
				,lblCalories.getWidth(),lblCalories.getHeight());

		String price = String.valueOf(menu.totalPrice());
		txtFPrice = new JTextField(price);
		txtFPrice.setBounds(txtDessert.getX(),lblPrice.getY(),lblPrice.getWidth()-150,jbtCreate.getHeight());
		txtFPrice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtFPrice.setEditable(false);
		childWindow.getContentPane().add(lblPrice);
		childWindow.getContentPane().add(txtFPrice);

		childWindow.setVisible(true);

	}




}





