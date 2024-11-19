// Hash Map
import java.util.HashMap;

public class JP38 {

	public static void main(String[] args) {
		
		HashMap<String, String> people = new HashMap<String, String>();
		
		people.put("Alabama", "Monica");
		people.put("Arizona", "John");
		people.put("Idaho", "Samantha");
		
		
		
		System.out.println("Hash size: " + people.size());
		
		for (String x : people.keySet()) {
			System.out.println("Alabama: " + people.get("Alabama"));System.out.println("Pair: " + x + " ---> " +  people.get(x));
		}
		
		people.remove("Idaho");
		System.out.println(people);
		
		people.clear();
		System.out.println(people);
	}

}

//Ovaj Java program koristi **`HashMap`**, klasu koja omogućava čuvanje podataka u paru **ključ-vrednost**.
//Evo šta program radi, bez ispisivanja konkretnih rezultata:
//
//1. **Kreiranje `HashMap` objekta**:
//   - Program kreira objekat tipa **`HashMap`** koji koristi **`String`** vrednosti kao ključeve i vrednosti. 
//   U ovom slučaju, ključevi predstavljaju nazive država, a vrednosti imena osoba.
//
//2. **Dodavanje parova ključ-vrednost u `HashMap`**:
//   - U **`HashMap`** se dodaju tri para koristeći metodu **`put()`**. Svaki par se sastoji od naziva države (ključ) 
//   i imena osobe (vrednost).
//
//3. **Dobijanje veličine `HashMap`**:
//   - Program prikazuje broj parova koji su trenutno u **`HashMap`** koristeći metodu **`size()`**.
//
//4. **Iteracija kroz `HashMap`**:
//   - Program prolazi kroz sve ključeve u **`HashMap`** koristeći **`for-each`** petlju i metodu **`keySet()`**, 
//   koja vraća skup svih ključeva.
//   - Za svaki ključ, vrednost se dobija metodom **`get()`**. Tako se može prikazati svaki par ključ-vrednost.
//
//5. **Uklanjanje određenog para ključ-vrednost**:
//   - Jedan od parova (onaj sa ključem "Idaho") se uklanja iz **`HashMap`** pomoću metode **`remove()`**, 
//   koja briše zapis sa zadatim ključem.
//
//6. **Brisanje svih elemenata iz `HashMap`**:
//   - Na kraju, **`HashMap`** se potpuno prazni koristeći metodu **`clear()`**, koja uklanja sve parove ključ-vrednost iz mape.
//
//Program demonstrira osnovne operacije sa **`HashMap`** strukturom podataka: dodavanje, dobijanje vrednosti po ključu, 
//iteraciju kroz elemente, uklanjanje specifičnih parova, i kompletno brisanje sadržaja. **`HashMap`** je efikasna struktura 
//za skladištenje podataka koji se pretražuju po ključu, omogućavajući brz pristup, umetanje i brisanje podataka.


