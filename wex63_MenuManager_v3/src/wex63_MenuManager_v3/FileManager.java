package wex63_MenuManager_v3;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> list=new ArrayList<MenuItem>();
		try{
			FileReader fr =new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);

			String line =null;
			while ((line=br.readLine())!=null){
				String [] temp=line.split("@@");
				if(temp.length==5){
					if(temp[1].equals("entree")){
						Entree e=new Entree(temp[0],temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]));
						list.add(e);
					}
					if(temp[1].equals("side")){
						Side s=new Side(temp[0],temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]));
						list.add(s);
					}
					if(temp[1].equals("salad")){
						Salad sa=new Salad(temp[0],temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]));
						list.add(sa);
					}
					if(temp[1].equals("dessert")){
						Dessert d=new Dessert(temp[0],temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]));
						list.add(d);
					}
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
		return list;
	}

	public static void writeMenu( String fileName, ArrayList<Menu> menus ){
		try {
			File fl = new File(fileName);
			fl.delete();
			FileWriter	 fw=new FileWriter(fileName,true);
			BufferedWriter bw=new BufferedWriter(fw);
			int totalCal=0;
			double totalPrice=0;
			for(int i=0;i<menus.size();i++) {
				totalCal=totalCal+menus.get(i).totalCalories();
				totalPrice=totalPrice+menus.get(i).totalPrice();
				bw.write(menus.get(i).toString()+"Total price is:"+totalPrice+".Total Calories is:"+totalCal+"\n");
			}
			bw.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}


//
//	public static ArrayList<Entree> readEntrees(String fileName){
//
//
//		ArrayList<Entree> entrees=new ArrayList<Entree>();
//		try{
//			FileReader fr =new FileReader(fileName);
//			BufferedReader br=new BufferedReader(fr);
//
//			String line =null;
//			while ((line=br.readLine())!=null){
//				String [] temp=line.split("@@");
//				if(temp.length==3){
//					Entree e=new Entree(temp[0],temp[1],Integer.parseInt(temp[2]));
//					entrees.add(e);
//				}
//				else{
//					System.out.println("One of the rows in your dataset is missing values");
//				}
//			}
//			br.close();
//			fr.close();
//		}
//		catch(FileNotFoundException fnfe){
//			fnfe.printStackTrace();
//		}
//		catch(Exception ioe){
//			ioe.printStackTrace();
//		}
//
//		//save to another file?
//		return entrees;
//	}
//
//
//	public static ArrayList<Side> readSides(String fileName){
//		ArrayList<Side> sides=new ArrayList<Side>();
//		try{
//			FileReader fr =new FileReader(fileName);
//			BufferedReader br=new BufferedReader(fr);
//
//			String line =null;
//			while ((line=br.readLine())!=null){
//				String [] temp=line.split("@@");
//				if(temp.length==3){
//					Side s=new Side(temp[0],temp[1],Integer.parseInt(temp[2]));
//					sides.add(s);
//				}
//				else{
//					System.out.println("One of the rows in your dataset is missing values");
//				}
//			}
//			br.close();
//			fr.close();
//		}
//		catch(FileNotFoundException fnfe){
//			fnfe.printStackTrace();
//		}
//		catch(Exception ioe){
//			ioe.printStackTrace();
//		}
//
//		//save to another file?
//
//		return sides;
//	}
//
//	public static ArrayList<Salad> readSalads(String fileName){
//		ArrayList<Salad> salads=new ArrayList<Salad>();
//		try{
//			FileReader fr =new FileReader(fileName);
//			BufferedReader br=new BufferedReader(fr);
//
//			String line =null;
//			while ((line=br.readLine())!=null){
//				String [] temp=line.split("@@");
//				if(temp.length==3){
//					Salad s=new Salad(temp[0],temp[1],Integer.parseInt(temp[2]));
//					salads.add(s);
//				}
//				else{
//					System.out.println("One of the rows in your dataset is missing values");
//				}
//			}
//			br.close();
//			fr.close();
//		}
//		catch(FileNotFoundException fnfe){
//			fnfe.printStackTrace();
//		}
//		catch(Exception ioe){
//			ioe.printStackTrace();
//		}
//
//		//save to another file?
//
//		return salads;
//	}
//
//	public static ArrayList<Dessert> readDesserts(String fileName){
//		ArrayList<Dessert> desserts=new ArrayList<Dessert>();
//		try{
//			FileReader fr =new FileReader(fileName);
//			BufferedReader br=new BufferedReader(fr);
//
//			String line =null;
//			while ((line=br.readLine())!=null){
//				String [] temp=line.split("@@");
//				if(temp.length==3){
//					Dessert d=new Dessert(temp[0],temp[1],Integer.parseInt(temp[2]));
//					desserts.add(d);
//				}
//				else{
//					System.out.println("One of the rows in your dataset is missing values");
//				}
//			}
//			br.close();
//			fr.close();
//		}
//		catch(FileNotFoundException fnfe){
//			fnfe.printStackTrace();
//		}
//		catch(Exception ioe){
//			ioe.printStackTrace();
//		}
//
//		//save to another file?
//
//		return desserts;
//
//	}





