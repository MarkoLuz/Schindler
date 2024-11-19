// Kreiranje fajla u Java

import java.io.File;
import java.io.IOException;

public class JP41 {

	public static void main(String[] args) {
		
		File fileObj = new File("externalfile.txt");
		
		try {
			if (fileObj.createNewFile()) {
				System.out.println("File created: " + fileObj.getName());
			}
			else {
				System.out.println("File with that name exists");
			}

		}
		catch (IOException fError) {
			System.out.println(fError);
		}
	
		finally {
			System.out.println("Ja cu uvek da se izvrsavam");
		}
	}
}

//Ovaj Java program koristi klasu `File` iz Java biblioteke za kreiranje nove datoteke u sistemu. Evo šta radi korak po korak:
//
//1. **Import biblioteke**: Na početku, program uvozi neophodne klase, `File` i `IOException`, koje su potrebne za rad sa datotekama u Javi.
//
//2. **Kreiranje objekta `File`**: Unutar `main` metode, stvara se objekat `fileObj` klase `File`, koristeći naziv 
//datoteke `"externalfile.txt"`. 
//Ovaj objekat predstavlja referencu na datoteku sa tim imenom.
//
//3. **Blok `try`**: U okviru `try` bloka, poziva se metoda `createNewFile()` na objektu `fileObj`. 
//Ova metoda pokušava da kreira novu datoteku:
//   - Ako datoteka sa tim imenom ne postoji, biće kreirana, i program će signalizirati da je datoteka uspešno kreirana.
//   - Ako datoteka već postoji, program će to prijaviti bez kreiranja nove datoteke.
//
//4. **Rukovanje greškama**: Ako dođe do greške tokom kreiranja datoteke (npr. ako sistem nema 
//		dozvolu za kreiranje datoteke na određenoj lokaciji), greška će biti uhvaćena i obrađena u `catch` bloku, 
//gde će se ispisati detalji greške.
//
//5. **`finally` blok**: Bez obzira da li je kreiranje datoteke uspelo ili je došlo do greške, `finally` 
//blok će se uvek izvršiti. Ovaj blok se često koristi za čišćenje resursa ili izvođenje akcija koje treba izvršiti uvek, 
//kao što je zatvaranje fajlova ili prikazivanje poruke.
//
//Ovaj program služi kao primer rukovanja fajlovima i kako koristiti blokove `try`, `catch`, i `finally` 
//za obradu izuzetaka i osiguravanje da se određene akcije izvrše bez obzira na uspešnost koda.



















