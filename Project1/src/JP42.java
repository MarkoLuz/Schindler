// Upis u fajl

import java.io.FileWriter;
import java.io.IOException;

public class JP42 {

	public static void main(String[] args) {

		try {
			FileWriter fileObj = new FileWriter("novifajl2.txt");
			fileObj.write("Ovo ce zavrsiti u fajlu \n");
			fileObj.write("Nesto novo");
			fileObj.close();
			System.out.println("Upis u fajl je izvrsen ");
		}
		
		catch (IOException fError) {
			System.out.println("Doslo je do greske ");
			System.out.println(fError);
		}
		
		finally {
			System.out.println("Finally se uvek izvrsi");
		}

	}

}

//Ovaj Java program koristi klasu `FileWriter` za kreiranje i upisivanje teksta u fajl. Evo opisa korak po korak:
//
//1. **Import biblioteke**: Na početku programa se uvozi klasa `FileWriter` i `IOException`, koje su deo standardne Java 
//biblioteke za rad sa fajlovima i rukovanje izuzecima.
//
//2. **Blok `try`**: Unutar bloka `try`, program pokušava da kreira novi fajl i upiše podatke u njega:
//   - Kreira se objekat `fileObj` koristeći klasu `FileWriter`, sa imenom fajla `"novifajl2.txt"`. Ako fajl sa tim imenom 
//   ne postoji, on će biti kreiran. Ako već postoji, 
//   stari sadržaj će biti prepisan.
//   - Metoda `write()` se koristi za upisivanje teksta u fajl. U ovom slučaju, prvo se upisuje tekst `"Ovo ce zavrsiti u fajlu \n"`,
//   sa `\n` koji predstavlja novi red.
//   - Zatim se upisuje još jedan red sa tekstom `"Nesto novo"`.
//   - Metoda `close()` zatvara fajl kako bi se osiguralo da su svi podaci pravilno upisani.
//
//3. **Ispis uspeha**: Ako je upisivanje teksta u fajl uspelo, ispisuje se poruka koja potvrđuje da je operacija bila uspešna.
//
//4. **Rukovanje greškama (`catch` blok)**: Ako dođe do greške tokom otvaranja ili pisanja u fajl (npr. ako fajl ne može da se 
//		kreira ili se desi neka druga IO greška), greška će biti uhvaćena u `catch` bloku i detalji greške će se ispisati na konzolu.
//
//5. **`finally` blok**: Bez obzira na ishod `try` bloka, `finally` blok će se uvek izvršiti. U ovom slučaju, koristi se za 
//ispisivanje poruke koja ukazuje da je `finally` blok izvršen. Ovaj blok može biti koristan za čišćenje resursa, iako ovde 
//nema specifičnih resursa koje treba zatvoriti jer je fajl već zatvoren unutar `try` bloka.
//
//Ovaj primer pokazuje kako se može koristiti `FileWriter` za rad sa fajlovima, kao i kako rukovati greškama i osigurati da 
//određeni kod bude uvek izvršen, bez obzira na uspešnost glavne operacije.





























