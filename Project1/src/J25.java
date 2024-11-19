//Konstruktori - su metode koje imaju isto ime kao klasa gde se nalaze

public class J25 {
	
	int x;
	String someString;
	
	public J25() {                                      // formiranje konstruktora
		System.out.println("ja sam iz konstruktora");
	}

	public static void main(String[] args) {
		
		J25 firstObj = new J25();
		J25 secondObj = new J25();
		J25 thirdObj = new J25();
	}

}

//U klasi `J25`, koristi se **konstruktor**, koji je specijalna vrsta metode koja se automatski poziva prilikom kreiranja novog objekta te klase. Evo objašnjenja koda:
//
//### Struktura koda
//
//1. **Polja klase**:
//   - Klasa `J25` ima dve promenljive (polja) instance:
//     - `x` (tipa `int`)
//     - `someString` (tipa `String`)
//   - Ove promenljive trenutno nemaju inicijalizovane vrednosti (podrazumevano su `0` za `int` i `null` za `String`).
//
//2. **Konstruktor**:
//   - Konstruktor je posebna metoda koja se zove **kada se kreira novi objekat** klase.
//   - Konstruktor u ovom primeru se zove `J25` i **nema parametre**, što znači da je to **podrazumevani konstruktor**.
//   - U telu konstruktora nalazi se samo `System.out.println` koji ispisuje poruku, što znači da se svaki put kada se kreira 
//   objekat klase `J25`, ta poruka prikazuje.
//   - Ako konstruktor nije eksplicitno definisan, Java bi automatski dodala podrazumevani konstruktor bez ikakve funkcionalnosti. 
//   Ovde je eksplicitno definisan.
//
//3. **`main` metoda**:
//   - U `main` metodi kreiraju se tri objekta klase `J25`: `firstObj`, `secondObj`, i `thirdObj`.
//   - Svaki put kada se kreira objekat (`new J25();`), poziva se konstruktor klase, i poruka iz konstruktora se ispisuje.
//
//### Uloga konstruktora
//
//Konstruktor omogućava:
//- **Inicijalizaciju objekata** prilikom njihovog kreiranja.
//- Kod koji se nalazi u konstruktoru izvršava se **svaki put kada se kreira objekat**, omogućavajući podešavanje početnih 
//vrednosti ili izvršavanje početnih operacija.
//
//U ovom primeru, iako konstruktor samo ispisuje poruku, mogao bi da se koristi za inicijalizaciju vrednosti 
//promenljivih `x` i `someString` ili za bilo koje druge inicijalne zadatke koji su potrebni kada se kreira novi objekat `J25`.




