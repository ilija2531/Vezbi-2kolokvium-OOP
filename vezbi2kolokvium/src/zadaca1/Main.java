package zadaca1;


public class Main {

	public static void main(String[] args)   {
		
		Datoteka fajl = new Datoteka("C:\\Users\\ilija\\Desktop\\Java-OOP\\Moi vezbi\\Vezbi za 2 kolokvium\\vezbi2kolokvium\\src\\zadaca1\\tekst.txt");
		
		String zapis = "Ladies and gentleman";
		
		fajl.Zapisi(zapis);
		try {
			fajl.Citaj();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}

}
