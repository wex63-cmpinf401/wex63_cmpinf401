package MenuManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
public static ArrayList<Entree> readEntrees(String fileName){
	ArrayList<Entree> entrees=new ArrayList<Entree>();
	try{
		FileReader fr =new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);

		String line =null;
		while ((line=br.readLine())!=null){
			String [] temp=line.split("@@");
			if(temp.length==3){
				Entree e=new Entree(temp[0],temp[1],Integer.parseInt(temp[2]));
				entrees.add(e);
			}
			else{
				System.out.println("One of the rows in your dataset is missing values");
			}
		}
		br.close();
		fr.close();
	}
	catch(FileNotFoundException fnfe){
		fnfe.printStackTrace();
	}
	catch(Exception ioe){
		ioe.printStackTrace();
	}

	//save to another file?
	return entrees;
	}
	
	
	public static ArrayList<Side> readSides(String fileName){
		ArrayList<Side> sides=new ArrayList<Side>();
		try{
			FileReader fr =new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);

			String line =null;
			while ((line=br.readLine())!=null){
				String [] temp=line.split("@@");
				if(temp.length==3){
					Side s=new Side(temp[0],temp[1],Integer.parseInt(temp[2]));
					sides.add(s);
				}
				else{
					System.out.println("One of the rows in your dataset is missing values");
				}
			}
			br.close();
			fr.close();
		}
		catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch(Exception ioe){
			ioe.printStackTrace();
		}

		//save to another file?
		
		return sides;
	}

	public static ArrayList<Salad> readSalads(String fileName){
		ArrayList<Salad> salads=new ArrayList<Salad>();
		try{
			FileReader fr =new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);

			String line =null;
			while ((line=br.readLine())!=null){
				String [] temp=line.split("@@");
				if(temp.length==3){
					Salad s=new Salad(temp[0],temp[1],Integer.parseInt(temp[2]));
					salads.add(s);
				}
				else{
					System.out.println("One of the rows in your dataset is missing values");
				}
			}
			br.close();
			fr.close();
		}
		catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch(Exception ioe){
			ioe.printStackTrace();
		}

		//save to another file?

		return salads;
	}

	public static ArrayList<Dessert> readDesserts(String fileName){
		ArrayList<Dessert> desserts=new ArrayList<Dessert>();
		try{
			FileReader fr =new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);

			String line =null;
			while ((line=br.readLine())!=null){
				String [] temp=line.split("@@");
				if(temp.length==3){
					Dessert d=new Dessert(temp[0],temp[1],Integer.parseInt(temp[2]));
					desserts.add(d);
				}
				else{
					System.out.println("One of the rows in your dataset is missing values");
				}
			}
			br.close();
			fr.close();
		}
		catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch(Exception ioe){
			ioe.printStackTrace();
		}

		//save to another file?

		return desserts;
	}


}
