// Try... Catch... Finally

public class JP40 {

	public static void main(String[] args) {
		
		String[] monitors = {"Dell", "IBM", "Benq"};
		
		try {
			System.out.println(monitors[1]);
		}
		
		catch (Exception e) {
			System.out.println("Doslo je do greske");
			System.out.println(e);
		}
		
		finally {
			System.out.println("Ja se uvek izvrsavam");
		}
		
	}

}


//Ovaj Java program koristi **`try-catch-finally`** blok za obradu izuzetaka prilikom rada sa nizom podataka (`array`). 
//Evo šta program radi, bez ispisivanja konkretnih rezultata:
//
//1. **Definicija niza `monitors`**:
//   - Program definiše niz (`array`) **`monitors`** koji sadrži tri imena proizvođača monitora. Indeksi za pristup elementima 
//   ovog niza kreću se od 0 do 2.
//
//2. **Korišćenje `try` bloka**:
//   - Unutar **`try`** bloka, program pokušava da pristupi određenom elementu iz niza koristeći indeks. Ako sve prođe kako treba, 
//   kod unutar `try` bloka se izvršava bez problema.
//
//3. **Korišćenje `catch` bloka**:
//   - **`catch`** blok hvata bilo koji izuzetak (grešku) koji se može pojaviti tokom izvršavanja koda u `try` bloku. U ovom slučaju, 
//   program bi mogao naići na grešku, poput pokušaja pristupa elementu koji nije u nizu (npr. ako bi se koristio nepostojeći indeks).
//   - Ako dođe do greške, `catch` blok će obraditi izuzetak i izvršiti alternativni kod. U ovom slučaju, hvata se bilo koji 
//   opšti izuzetak korišćenjem `Exception` klase.
//
//4. **Korišćenje `finally` bloka**:
//   - **`finally`** blok sadrži kod koji se uvek izvršava, bez obzira na to da li je došlo do greške u `try` bloku ili ne. 
//   Ovaj blok se često koristi za oslobađanje resursa, čišćenje, ili završne akcije koje treba obaviti u svakom slučaju.
//
//Program demonstrira upotrebu Java strukture za rukovanje izuzecima, omogućavajući da se greške u kodu efikasno 
//hvataju i obrađuju, a da pritom ostale operacije budu sigurno završene. `finally` blok obezbeđuje da određeni kod uvek 
//bude izvršen, bez obzira na tok izvršenja.




















