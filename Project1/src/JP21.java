// Return iz Metode

public class JP21 {
	
	public static int simpleCalc(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public static void doubleIt(int x, int y) {
		int dResult = (simpleCalc(x, y) * 2);
		System.out.println("Result: " + dResult);
		
	}
	
		public static void main(String[] args) {
			//System.out.println("Result: " + simpleCalc(5, 10));
			
			doubleIt(20, 40);

	}

}

//Evo objašnjenja koda na srpskom jeziku, liniju po liniju:
//
//1. **`public class JP21 {`**
//   - Ova linija definiše javnu klasu pod imenom `JP21`. U Javi, svaka aplikacija mora imati neku klasu, 
//   a ova klasa predstavlja šablon za program.
//
//2. **`public static int simpleCalc(int x, int y) {`**
//   - Ova linija definiše statičnu metodu `simpleCalc`, koja prima dva celobrojna argumenta (`x` i `y`) i vraća celobrojni rezultat. 
//   Ključna reč `static` znači da se metoda može pozvati bez potrebe za kreiranjem instance klase.
//
//3. **`int result = x + y;`**
//   - Unutar metode `simpleCalc`, ova linija vrši sabiranje brojeva `x` i `y`, a rezultat se čuva u promenljivoj `result`.
//
//4. **`return result;`**
//   - Rezultat sabiranja (`x + y`) se vraća iz metode `simpleCalc`, što znači da će metoda dati zbir kada se pozove.
//
//5. **`public static void doubleIt(int x, int y) {`**
//   - Ovo je još jedna statična metoda pod imenom `doubleIt`, koja takođe prima dva celobrojna argumenta. Ova metoda ne vraća ništa, 
//   što je označeno sa `void`. Ona samo izvršava akcije, ali ne vraća rezultat direktno.
//
//6. **`int dResult = (simpleCalc(x, y) * 2);`**
//   - Unutar metode `doubleIt`, ova linija poziva metodu `simpleCalc` sa argumentima `x` i `y`. 
//   Rezultat metode `simpleCalc` (koji je zbir `x + y`) zatim se množi sa 2, a rezultat se smešta u promenljivu `dResult`.
//
//7. **`System.out.println("Result: " + dResult);`**
//   - Ova linija štampa vrednost promenljive `dResult` na ekranu. 
//   Poruka je formatirana tako da prikazuje tekst "Result: " praćen vrednošću `dResult`.
//
//8. **`public static void main(String[] args) {`**
//   - Ovo je glavna metoda, koja je početna tačka izvršavanja programa. 
//   Glavna metoda je mesto odakle Java aplikacija počinje da se pokreće.
//
//9. **`//System.out.println("Result: " + simpleCalc(5, 10));`**
//   - Ovo je komentarisana linija koda. Da je aktivna, štampala bi rezultat poziva `simpleCalc(5, 10)`, 
//   što bi bilo 15. Međutim, ova linija nije aktivna jer je komentarisana sa `//`.
//
//10. **`doubleIt(20, 40);`**
//    - Metoda `doubleIt` se poziva sa argumentima 20 i 40. To znači da se poziva `simpleCalc(20, 40)`, 
//    što daje zbir 60, zatim se taj zbir množi sa 2 da bi se dobio rezultat 120. Na kraju, štampa se poruka "Result: 120".
//
//Program vrši jednostavnu kalkulaciju sabiranja dva broja, duplira rezultat i ispisuje izlaz. 
//Metoda `doubleIt` koristi rezultat metode `simpleCalc` za izračunavanje nove vrednosti, čime se demonstrira rad metoda i operacija u Javi.
















