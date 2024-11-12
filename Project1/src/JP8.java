//Unos preko tastature:

import java.util.Scanner;

public class JP8 {

	public static void main(String[] args) {
		
		Scanner someObj = new Scanner(System.in);
		
		System.out.println("----------------------------");
		System.out.println("Enter IP: ");
		
		String ip = someObj.nextLine();
		
		System.out.println("IP: " + ip);
		
		someObj.close();
		
	}

}



//Objašnjenje korak po korak:
//1. **Import Scanner klase**: `import java.util.Scanner;` omogućava korišćenje `Scanner` klase koja služi za čitanje unosa sa tastature.
//
//2. **Kreiranje Scanner objekta**: `Scanner someObj = new Scanner(System.in);` pravi novi `Scanner` objekat nazvan `someObj`,
//koji omogućava čitanje korisnikovog unosa sa standardnog ulaza (`System.in`).
//
//3. **Prikazivanje poruka**: Program prikazuje liniju i zatim traži od korisnika da unese IP adresu kroz poruku `"Enter IP: "`.
//
//4. **Čitanje unosa**: `String ip = someObj.nextLine();` uzima korisnikov unos kao string i skladišti ga u promenljivu `ip`.
//
//5. **Prikaz unosa**: `System.out.println("IP: " + ip);` prikazuje unetu IP adresu na ekranu.
//
//6. **Zatvaranje Scanner-a**: `someObj.close();` zatvara `Scanner` objekat kako bi se oslobodili resursi.
//
//Ovaj program je jednostavan primer za unos i prikaz podataka.





