// HashSet

import java.util.HashSet;

public class JP39 {

	public static void main(String[] args) {
		HashSet<String> monitors = new HashSet<String>();
		
		monitors.add("Dell");
		monitors.add("IBM");
		monitors.add("Benq");
		
		System.out.println(monitors);
		
		System.out.println("Set size: " + monitors.size());
		
		System.out.println("Da li sadrzi Dell: " + monitors.contains("Dell"));
		
		System.out.println("Da li sadrzi Asus: " + monitors.contains("Asus"));
		
		for (String x : monitors) {
			System.out.println(x);
		}
		
		monitors.remove("Benq");
		System.out.println(monitors);
		
		monitors.clear();
		System.out.println(monitors);

	}

}


//Ovaj Java program koristi **`HashSet`**, kolekciju koja omogućava čuvanje jedinstvenih elemenata bez specifičnog redosleda. 
//Evo šta program radi, bez ispisivanja konkretnih rezultata:
//
//1. **Kreiranje `HashSet` objekta**:
//   - Program kreira objekat tipa **`HashSet`** koji čuva elemente tipa **`String`**. Ovaj `HashSet` će čuvati imena proizvođača monitora.
//
//2. **Dodavanje elemenata u `HashSet`**:
//   - Program dodaje nekoliko proizvođača monitora u `HashSet` koristeći metodu **`add()`**. 
//   Dodavanje elemenata u `HashSet` osigurava da su svi elementi jedinstveni (ne mogu postojati duplikati).
//
//3. **Dobijanje veličine `HashSet`**:
//   - Program prikazuje trenutni broj elemenata u skupu koristeći metodu **`size()`**.
//
//4. **Provera prisutnosti elemenata**:
//   - Program proverava da li `HashSet` sadrži određeni element (npr. "Dell" ili "Asus") pomoću metode **`contains()`**, 
//   koja vraća `true` ili `false` u zavisnosti od toga da li se element nalazi u skupu.
//
//5. **Iteracija kroz `HashSet`**:
//   - Program prolazi kroz sve elemente u `HashSet` koristeći **`for-each`** petlju. Elementi se prikazuju u neodređenom redosledu, 
//   jer `HashSet` ne garantuje redosled elemenata.
//
//6. **Uklanjanje elementa iz `HashSet`**:
//   - Program uklanja određeni element (npr. "Benq") iz skupa koristeći metodu **`remove()`**.
//
//7. **Brisanje svih elemenata iz `HashSet`**:
//   - Na kraju, `HashSet` se potpuno prazni korišćenjem metode **`clear()`**, koja uklanja sve elemente iz skupa.
//
//Program pokazuje osnovne operacije koje se mogu obaviti nad **`HashSet`** strukturom podataka: dodavanje elemenata, 
//provera prisutnosti, iteracija kroz skup, uklanjanje specifičnih elemenata, i kompletno brisanje skupa. `HashSet` je 
//efikasna struktura za skladištenje podataka kada su jedinstvenost i brz pristup elementima prioritet, 
//bez obzira na redosled umetanja.

















