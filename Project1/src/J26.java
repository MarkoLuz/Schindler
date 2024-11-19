// Inheritens- Nasledjivanje

class BasicOperations{               // parent klasa
	
	public void addition(int x , int y) {
		System.out.println(x + y);
	}
}

class MoreOperations extends BasicOperations  {  // child klasa (extend komanda prociruje parent klasu)
	
	public void multiplication(int x, int y) {
		System.out.println(x * y);
	}
}

public class J26 {// osnovna klasa

	public static void main(String[] args) {  
		
//		BasicOperations firstObj = new BasicOperations(); // kreiranje objekta u kalsi BO
//		firstObj.addition(5, 10);
		
		MoreOperations secondObj = new MoreOperations();
		secondObj.addition(5, 10);
		secondObj.multiplication(10, 10);
		
	
	
	}

}


//U ovom primeru imamo tri klase: `BasicOperations`, `MoreOperations`, i `J26`. Evo objašnjenja strukture koda bez ispisivanja tačnog koda:
//
//1. **Klasa `BasicOperations`**:
//   - Ovo je tzv. *parent* klasa (ili osnovna klasa).
//   - U njoj je definisana metoda `addition` koja prima dva cela broja (`int`) i ispisuje njihov zbir.
//
//2. **Klasa `MoreOperations`**:
//   - Ovo je *child* klasa (ili izvedena klasa) koja proširuje klasu `BasicOperations`. To znači da `MoreOperations` 
//   nasleđuje sve metode i polja iz klase `BasicOperations`.
//   - U klasi `MoreOperations` se dodaje dodatna metoda `multiplication`, koja takođe prima dva cela broja i ispisuje njihov proizvod.
//   - Kroz nasleđivanje, `MoreOperations` može da koristi metode iz `BasicOperations`, kao što je `addition`.
//
//3. **Klasa `J26`**:
//   - Ovo je glavna klasa koja sadrži `main` metodu i služi za testiranje.
//   - Unutar `main` metode:
//     - Kreira se objekat `secondObj` tipa `MoreOperations`.
//     - Korišćenjem objekta `secondObj`, poziva se metoda `addition` (koja je nasleđena iz `BasicOperations`) da bi se izračunao 
//     zbir dva broja.
//     - Zatim se poziva metoda `multiplication` (koja je definisana u klasi `MoreOperations`) da bi se izračunao proizvod dva broja.
//
//Ovaj primer pokazuje kako funkcioniše **nasleđivanje** u Javi, gde child klasa može koristiti metode iz parent klase i dodati 
//sopstvene metode.






















		