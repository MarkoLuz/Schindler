// LinkedList

import java.util.LinkedList;


public class JP37 {

	public static void main(String[] args) {
		
		LinkedList<String> pLanguages = new LinkedList<String>();
		
		System.out.println(pLanguages);
		
		pLanguages.add("Java");
		pLanguages.add("Lisp");
		pLanguages.add("C++");
		
		System.out.println(pLanguages);
		
		pLanguages.addFirst("Prolog");
		pLanguages.addLast("Ada");
		
		System.out.println(pLanguages);
		
		System.out.println("First element: " + pLanguages.getFirst());
		System.out.println("Last element: " + pLanguages.getLast());
		
		pLanguages.removeFirst();
		pLanguages.removeLast();
		
		System.out.println(pLanguages);
		
		pLanguages.clear();
		
		System.out.println(pLanguages);
		
	}

}

//Ovaj Java program koristi **`LinkedList`** kolekciju kako bi demonstrirao osnovne operacije upravljanja listom elemenata. 
//Evo šta program radi, bez ispisivanja specifičnih rezultata:
//
//1. **Kreiranje `LinkedList` objekta**:
//   - Program kreira praznu **`LinkedList`** koja će sadržati elemente tipa **`String`**.
//
//2. **Dodavanje elemenata u listu**:
//   - U listu se dodaju tri programska jezika koristeći metodu **`add()`**, koja dodaje elemente na kraj liste.
//   
//3. **Dodavanje elemenata na specifične pozicije**:
//   - Zatim se dodaje jedan element na početak liste pomoću **`addFirst()`**, i jedan element na kraj liste pomoću **`addLast()`**.
//
//4. **Pristup prvom i poslednjem elementu**:
//   - Program dohvaća prvi i poslednji element iz liste koristeći metode **`getFirst()`** i **`getLast()`**, bez obzira na to 
//   koliko elemenata lista trenutno sadrži.
//
//5. **Uklanjanje elemenata sa specifičnih pozicija**:
//   - Prvi i poslednji element se uklanjaju iz liste pomoću metoda **`removeFirst()`** i **`removeLast()`**. Ove operacije 
//   ne zahtevaju poznavanje indeksa elemenata, već samo njihovu poziciju (prva ili poslednja).
//
//6. **Brisanje svih elemenata iz liste**:
//   - Na kraju, lista se potpuno prazni pomoću metode **`clear()`**, koja uklanja sve elemente iz liste.
//
//Program pruža jednostavan prikaz manipulacije nad listom koja može da menja svoju veličinu, dodavanjem i uklanjanjem 
//elemenata sa početka, kraja, ili kompletno brisanjem svih elemenata. **`LinkedList`** omogućava fleksibilno upravljanje
//podacima zahvaljujući dinamičkoj strukturi koja podržava ove operacije na efikasan način.









