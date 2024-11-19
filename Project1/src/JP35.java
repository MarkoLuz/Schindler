// ArrayList - ForLoop i ForEach

import java.util.ArrayList;
import java.util.Collections;

public class JP35 {

	public static void main(String[] args) {
		
		ArrayList<String> pLanguages = new ArrayList<String>();
		
		System.out.println(pLanguages);
		
		pLanguages.add("Lisp");
		pLanguages.add("Java");
		pLanguages.add("Python");
		pLanguages.add("C++");
		
		System.out.println(pLanguages);
		
		System.out.println("Number of elements: " + pLanguages.size());
		
		Collections.sort(pLanguages);
		
		
		for (String x : pLanguages) {
			System.out.println(x);
		}
		
		
//		for (int x = 0; x < pLanguages.size(); x = x + 1) {
//			System.out.println("Index: " + x + " " + pLanguages.get(x));
//		}
		
	}

}
		
		

//Program demonstrira upotrebu **`ArrayList`** kolekcije u Javi, koja je dinamička lista koja može da menja veličinu. 
//Evo šta program radi:
//
//1. **Kreiranje `ArrayList` objekta**: 
//   - Program prvo kreira praznu listu tipa **`ArrayList<String>`** koja sadrži niz stringova
//   (u ovom slučaju naziva programskih jezika).
//
//2. **Dodavanje elemenata u `ArrayList`**: 
//   - U listu se dodaju četiri programska jezika: "Lisp", "Java", "Python" i "C++".
//
//3. **Prikaz liste pre sortiranja**: 
//   - Prvo se prikazuje lista pre nego što se sortira.
//
//4. **Broj elemenata u listi**: 
//   - Program koristi metodu **`size()`** da bi prikazao koliko elemenata ima u listi.
//
//5. **Sortiranje liste**: 
//   - Korišćenjem metode **`Collections.sort()`**, lista se sortira abecedno.
//
//6. **Prikaz sortirane liste**: 
//   - Pomoću **`for-each`** petlje, program iterira kroz sortiranu listu i prikazuje svaki programski jezik.
//
//U komentaru je ostavljena **`for`** petlja, koja može da se koristi umesto **`for-each`** petlje da bi se prikazao
//svaki element sa njegovim indeksom. Međutim, ta petlja je isključena komentarom, što znači da se ne izvršava kada se program pokrene.


















