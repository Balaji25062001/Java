package classsix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class AssignmentTwo {
	 
		public static void main(String[] args) {
			
			readFromFile();
			char startsWith = args[0].charAt(0);
			String newFileName = "countries_" + Character.toString(startsWith) + ".csv";
	 
			writeToFile(newFileName, startsWith);
			
		}
		
		public static void readFromFile() {
			
			Map<String, String> countryMap = new HashMap<String, String>();		
			
			try {
				File file = new File("D:\\OutputFiles\\countries.csv");
				FileReader fr = new FileReader(file);
				
				BufferedReader br = new BufferedReader(fr);
				String line = "";
				
				while((line = br.readLine()) != null) {
					String[] country_capital = line.split(",");
					countryMap.put(country_capital[0], country_capital[1]);
				}
				br.close();
				fr.close();
				
				System.out.println("Countries and Capitals");
				for(Map.Entry<String, String> entry : countryMap.entrySet()) {
					System.out.println(entry.getKey() + " - " + entry.getValue()) ;
				}
				
				System.out.println("****************************************");
			} catch(FileNotFoundException e) {
				System.out.println("File doesn't exists");
			}
			catch(IOException e) {
				System.out.println("IOException while reading the content");
			}
			
		}
		public static void writeToFile(String newFileName, char countryNameBeginingWith) {
			FileWriter fw;
			try {
				
				String filePath = "D:\\OutputFiles\\" + newFileName;
				File file = new File(filePath);
				
				fw = new FileWriter(file, true);
				
				BufferedWriter bw = new BufferedWriter(fw);
				
				String[] countries_capitals = {"Serbia,Belgrade", "India,NewDelhi", "Sweden,Stockholm", "SaudiArabia,Riyadh"};
				
				boolean check = false;
				for(String all : countries_capitals) {
					String[] content = all.split(",");
						if(content[0].charAt(0) == countryNameBeginingWith) {
							check = true;
							bw.append(content[0] + "," + content[1] + "\n");
						}
				}
				bw.close();
				if(!check) {
					System.out.println("No contents to write");
				} else {
					System.out.println("Contents written successfully");
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("File doesn't exists");
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

}
