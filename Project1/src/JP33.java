// Nasledjivanje i Polimorfizam

class Primary33 { // klasa
	public void sameName() {// metoda
		System.out.println("Ja sam iz primarne klase"); //operacija
	}
}

class SecondaryA extends Primary33 { // klasa sekundarna
	public void sameName() {
		System.out.println("Ja sam iz sekundarne A klase");
		
	}
}

class SecondaryB extends Primary33 {
	public void sameName() {
		System.out.println("Ja sam iz sekundarne B klase");
		
	}
}

public class JP33 {                                  

	public static void main(String[] args) {        
		
		Primary33 primObj = new Primary33(); // formiranje objekta
		Primary33 secAObj = new SecondaryA(); // Leva strana roditeljska, a desne decija klasa
		Primary33 secBObj = new SecondaryB();
		
		
		primObj.sameName();                    //Nakon kreiranja objekta, poziva se metoda sameName() preko objekta primObj. 
		secAObj.sameName();                    //Na taj način se izvršava operacija definisana u klasi Primary.
		secBObj.sameName();
		
		
	}

}

//Kod prikazuje koncept **nasleđivanja i polimorfizma** u Javi, koristeći tri klase: `Primary33`, `SecondaryA`, i `SecondaryB`.
//
//### Objašnjenje:
//
//1. **Klasa `Primary33`**:
//   - Definisana je osnovna klasa sa metodom `sameName()`.
//   - Ova metoda ispisuje poruku koja pokazuje da je pozvana iz klase `Primary33`.
//
//2. **Klase `SecondaryA` i `SecondaryB`**:
//   - Obe klase **nasleđuju** klasu `Primary33`, što znači da dobijaju sve karakteristike i metode osnovne klase.
//   - Svaka od ovih klasa **prepisuje** (`override`) metodu `sameName()` sa sopstvenim implementacijama, što znači da 
//   je poruka drugačija u svakoj od ovih klasa.
//   - `SecondaryA` i `SecondaryB` imaju sopstvenu verziju metode `sameName()`.
//
//3. **Polimorfizam**:
//   - U glavnoj klasi `JP33`, kreiraju se objekti `primObj`, `secAObj`, i `secBObj`.
//   - Objekti `secAObj` i `secBObj` su definisani sa tipom osnovne klase `Primary33`, ali zapravo referenciraju objekte `SecondaryA` 
//   i `SecondaryB`.
//   - Ovo je primer **polimorfizma**, gde se ista referenca (tip `Primary33`) koristi za različite objekte (`SecondaryA` i `SecondaryB`).
//
//4. **Pozivanje metoda**:
//   - Kada se metoda `sameName()` pozove za svaki objekat (`primObj`, `secAObj`, i `secBObj`), poziva se odgovarajuća verzija 
//   metode u zavisnosti od **stvarnog tipa objekta**.
//   - Iako su `secAObj` i `secBObj` deklarisani kao tip `Primary33`, stvarni objekti su tipa `SecondaryA` i `SecondaryB`, pa će se 
//   koristiti njihove specifične implementacije metode `sameName()`.
//
//### Sažetak:
//Kod ilustruje osnovne principe nasleđivanja i polimorfizma u Javi. `Primary33` je osnovna klasa, dok su `SecondaryA` i `SecondaryB` 
//specifične varijante sa sopstvenim implementacijama metode `sameName()`. Polimorfizam omogućava da objekti različitih tipova budu 
//tretirani kao objekti osnovne klase, dok se stvarna implementacija metode bira u vreme izvršenja na osnovu stvarnog tipa objekta.























