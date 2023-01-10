package zadaca1;
import java.io.*;

public class Datoteka {
	
	public String filename;
	FileInputStream in;
	FileOutputStream out;
	
	
	public Datoteka (String filename) {
		this.filename = filename;
		
		
	}
	public void Zapisi(String zapis)    {
		
		try {
			BufferedWriter writer = new BufferedWriter(
					 new FileWriter(filename));
			writer.write(zapis);
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public void Citaj()   {
		
		try {
			BufferedReader reader = new BufferedReader(
			   new FileReader(filename));
			String s;
			while((s = reader.readLine()) != null) {
			System.out.println(s);
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
