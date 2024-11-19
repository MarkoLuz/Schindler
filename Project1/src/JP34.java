// ArrayList (Array-niz)

import java.util.ArrayList;

public class JP34 {

	public static void main(String[] args) {
		
		ArrayList<String> pLanguages = new ArrayList<String>();
		
		System.out.println(pLanguages);
		
		pLanguages.add("Lisp");
		pLanguages.add("Java");
		pLanguages.add("Python");
		pLanguages.add("C++");
		
		System.out.println(pLanguages);
		System.out.println(pLanguages.get(0));
		
		pLanguages.set(0, "Prolog");
		System.out.println(pLanguages);
		
		pLanguages.remove(0);
		System.out.println(pLanguages);
		
		pLanguages.clear();
		System.out.println(pLanguages);
		
		pLanguages.add("Lisp");
		pLanguages.add("Java");
		pLanguages.add("Python");
		pLanguages.add("C++");
		System.out.println(pLanguages);
		
	}

}


//**ArrayList** u Javi je specijalna vrsta kolekcije koja se koristi za skladištenje i upravljanje listom elemenata. 
//Možeš ga zamisliti kao dinamičku listu koja omogućava dodavanje, uklanjanje i pristup elementima na fleksibilan način.
//
//Za razliku od običnog niza (`array`), čija veličina mora biti unapred definisana, `ArrayList` može 
//dinamički da se menja u zavisnosti od potreba—možeš dodavati i uklanjati elemente tokom rada programa bez potrebe za brinjenjem o veličini liste.
//
//**Glavne osobine `ArrayList`-a:**
//
//1. **Dinamičnost** - Lista automatski menja svoju veličinu, tako da možeš lako dodavati ili uklanjati elemente.
//2. **Indeksirani pristup** - Možeš lako pristupiti bilo kom elementu pomoću njegovog indeksa, kao što bi to uradio sa običnim nizom.
//3. **Podržava sve tipove objekata** - U `ArrayList` možeš skladištiti bilo koju vrstu objekta, kao što su `String`, `Integer`, 
//ili čak tvoje korisnički definisane klase.
//4. **Metode za manipulaciju** - `ArrayList` ima razne ugrađene metode koje omogućavaju efikasno dodavanje, uklanjanje, 
//sortiranje i pretragu elemenata.
//
//Primer korišćenja:
//- Deklaracija: `ArrayList<String> lista = new ArrayList<>();`
//- Dodavanje elemenata: `lista.add("element");`
//- Pristup elementu: `lista.get(0);`
//- Uklanjanje elemenata: `lista.remove(0);`
//
//`ArrayList` se često koristi kada je potrebno raditi sa promenljivom količinom podataka i kada ti treba fleksibilnost 
//koja obični nizovi ne pružaju.










