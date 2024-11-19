// Citanje fajlova

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JP43 {

		public static void main(String[] args) {

			try {
				File fileObj = new File("novifajl2.txt");
				Scanner readFile = new Scanner(fileObj);
				
				while (readFile.hasNextLine()) {
					System.out.println(readFile.nextLine());
				}
				
				readFile.close();
			}
			
			catch (java.io.FileNotFoundException e) {
				System.out.println("Fajl ne postoji ");
				System.out.println(e);
			}
			
			finally {
				System.out.println("-------------------------");
				System.out.println("Ja se uvek izvrsavam ");
				System.out.println("------------------------- ");
			}

	}

}
