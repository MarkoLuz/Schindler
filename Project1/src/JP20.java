//Parametri
public class JP20 {

	public static void printSomething(String x) {
		System.out.println(x);
		}
	
	public static void simpleCalc(int x, int y) {
		int result = x + y;
		System.out.println(result);
		}
	
	public static void printChar(char a, char b) {
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		
		printSomething("Nemam pojma");
		simpleCalc(10, 20);
		printChar('Z', 'R');

	}
	
}	


//Ovaj Java program sadrži klasu **JP20** koja ima tri metode: **printSomething**, **simpleCalc**, i **printChar**, 
//kao i metodu **main** koja sve poziva. 
//
//### Objašnjenje linija:
//
//1. **Deklaracija klase `JP20`** – Klasa **JP20** je definisana kao javna (`public`), 
//što znači da je dostupna izvan paketa u kojem se nalazi.
//
//2. **Metoda `printSomething` sa jednim parametrom `String x`** – Ova metoda prima jedan `String` parametar, 
//nazvan **x**, i koristi ga za ispisivanje prosleđene vrednosti na konzolu putem `System.out.println(x)`.
//
//3. **Metoda `simpleCalc` sa dva `int` parametra `x` i `y`** – Ova metoda prima dva celobrojna parametra:
//   - Deklariše varijablu `result` i dodeljuje joj vrednost sabiranja parametara **x** i **y**.
//   - Ispisuje vrednost rezultata pomoću `System.out.println(result)`.
//
//4. **Metoda `printChar` sa dva `char` parametra `a` i `b`** – Ova metoda prima dva znakovna parametra:
//   - Ispisuje oba znaka, **a** i **b**, razdvojena razmakom pomoću `System.out.println(a + " " + b)`.
//
//5. **Metoda `main`** – Ovo je glavna metoda programa, koja poziva druge metode sa specifičnim argumentima:
//   - **`printSomething("Nemam pojma")`** – Poziva `printSomething` i prosleđuje joj tekst `"Nemam pojma"`, koji se zatim ispisuje.
//   - **`simpleCalc(10, 20)`** – Poziva `simpleCalc` sa argumentima `10` i `20`. Metoda sabira ove vrednosti i ispisuje rezultat `30`.
//   - **`printChar('Z', 'R')`** – Poziva `printChar` sa znakovima `'Z'` i `'R'`, koji se ispisuju razdvojeni razmakom.



//Metoda **`main`** se razlikuje od ostalih metoda u nekoliko ključnih aspekata:
//
//1. **Ulazna tačka programa**:
//   - **`main`** metoda je ulazna tačka za Java program. Kada pokrećete Java aplikaciju, izvršavanje počinje od metode `main`. 
//   Druge metode, poput `printSomething`, `simpleCalc`, i `printChar`, su korisnički definisane i ne pokreću se automatski.
//
//2. **Specifična potpisna struktura**:
//   - `main` metoda ima specifičan potpis: **`public static void main(String[] args)`**. To znači da je:
//     - `public` – Dostupna javno, kako bi JVM mogao da je pronađe i pokrene.
//     - `static` – Može se pokrenuti bez instanciranja objekta klase.
//     - `void` – Ne vraća vrednost.
//     - `String[] args` – Prihvata niz `String` argumenata, koji omogućava prosleđivanje podataka programu iz komandne linije.
//   - Ostale metode u klasi mogu imati različite potpise, povratne tipove i argumente.
//
//3. **Automatski poziv od strane JVM-a**:
//   - **`main`** metoda se automatski poziva kada pokrenete program, dok se ostale metode pozivaju eksplicitno 
//   iz `main` metode ili drugih metoda.
//
//4. **Svrha**:
//   - **`main`** metoda služi kao centralna metoda za upravljanje tokom programa, pozivanje drugih metoda i izvršavanje 
//   osnovne logike programa.
//   - Druge metode, kao što su `printSomething`, `simpleCalc`, i `printChar`, imaju specifične funkcionalnosti i koriste se 
//   za organizaciju koda i ponovno korišćenje 
//   funkcionalnosti unutar `main` metode.
//
//Ukratko, `main` metoda je posebna po tome što je početna tačka programa, ima specifičan potpis i poziva je JVM, dok se 
//ostale metode pozivaju unutar nje ili drugih metoda i imaju fleksibilniju strukturu.










