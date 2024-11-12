//Switch statement

import java.util.Scanner; // uvoz Scanner klase

public class JP12 {

	public static void main(String[] args) {
		
		Scanner someObj = new Scanner(System.in); // Kreiranje objekta someObj- unos preko tast
		
		System.out.println("----------------------------------------");
		System.out.println("Menu: ");
		
		int choice = someObj.nextInt();
		System.out.println("Choice: " + choice);
		
		switch (choice) {
		case 1:
			System.out.println("Audio settings");
			break;
		case 2:
			System.out.println("Video settings");
			break;
		case 3:
			System.out.println("Controls");
			break;
		default:
			System.out.println("Game help");
			// u Java ne treba break:
			
		}
		
		someObj.close();
	}
}
		
		
//Ovaj program omogućava korisniku da unese broj koji odgovara određenoj opciji u meniju, koristeći `switch` strukturu 
//za selekciju i prikaz odgovarajućeg rezultata na osnovu korisnikovog izbora.
//
//Objašnjenje:
//1. **Kreiranje Scanner objekta**: 
//   - Program započinje kreiranjem objekta `someObj` klase `Scanner`, koji omogućava unos sa tastature.
//
//2. **Prikazivanje menija**:
//   - Prikazuju se linije koje obaveštavaju korisnika o unosu opcije iz menija.
//
//3. **Čitanje korisnikovog izbora**:
//   - Promenljiva `choice` čuva korisnikov unos, koji treba da bude broj. Korisnik unosi broj koji odgovara nekoj opciji iz menija.
//
//4. **Switch struktura**:
//   - `switch` struktura proverava vrednost promenljive `choice` i izvršava kod koji odgovara tom izboru:
//     - Ako je unos `1`, prikazuje se poruka `"Audio settings"`.
//     - Ako je unos `2`, prikazuje se poruka `"Video settings"`.
//     - Ako je unos `3`, prikazuje se poruka `"Controls"`.
//     - Za bilo koji drugi unos, izvršava se `default` blok koji prikazuje `"Game help"`.
//
//   - Svaki slučaj (`case`) završava se `break` naredbom, osim `default` bloka, jer je to poslednji deo u `switch` strukturi i nema potrebe 
//   za `break` naredbom u Javi.
//
//5. **Zatvaranje Scanner objekta**:
//   - Na kraju programa, `Scanner` objekat `someObj` se zatvara kako bi se oslobodili resursi.
//
//Ovaj program simulira jednostavan meni koji reaguje na korisnikov izbor i omogućava ispis različitih opcija u zavisnosti od unetog broja.














