//Break i continue - While Loop

public class JP17 {

	public static void main(String[] args) {
		/*
		int x = 0;
		
		while (x < 10) {
			System.out.println(x);
			x = x + 1;
			if (x == 5) {
				break;
			}
		}*/

		int x = 0;
		
		while (x < 10) {
			if (x == 5) {
				x = x + 1;
				continue;
			}
			System.out.println(x);  // da bi program radio ispravno, na oba mesta mora da postoji x = x + 1
			x = x + 1;
			
		}
		
		
	}

}


//U ovom Java programu, koristi se petlja `while` koja se izvršava dok je vrednost promenljive `x` manja od 10. 
//Program uključuje uslov `if` koji se pokreće kada `x` postane 5. Evo detaljnog objašnjenja:
//
//1. **Inicijalizacija promenljive**: Na početku, promenljiva `x` je postavljena na 0.
//
//2. **Petlja `while`**: Petlja se nastavlja dok je `x < 10`. Svaki put kada petlja krene, 
//vrednost `x` se povećava za 1, osim ako nije specifično tretirana u uslovu unutar petlje.
//
//3. **Uslov `if (x == 5)`**: Kada `x` dostigne vrednost 5, program ulazi u uslov. U tom slučaju:
//   - `x` se povećava za 1 (prelazak sa 5 na 6).
//   - Ključna reč `continue` uzrokuje da se trenutna iteracija preskoči i program se vraća na početak petlje, 
//   bez da se izvrši ostatak koda u toj iteraciji.
//
//4. **Zavisnost od `x = x + 1`**: Ako bi u programu izostao deo `x = x + 1` unutar `while` petlje (van uslova `if`), 
//petlja bi bila beskonačna jer bi vrednost `x` ostala stalno ista, i petlja nikad ne bi završila. Drugi deo `x = x + 1` je tu kako bi 
//vrednost `x` bila povećana na kraju svake iteracije.
//
//Dakle, bez ovog povećanja `x` za 1 u svakom krugu, petlja bi se izvršavala u beskonačnost, jer bi program stalno proveravao 
//da li je `x < 10` i to bi ostalo tačno bez kraja.


















