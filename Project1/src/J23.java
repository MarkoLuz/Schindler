// Objektno orjentisano programiranje - Klase i Objekti
public class J23 {
	
	int x = 10;
	String someString = "someValue";

	public static void main(String[] args) {
		
		J23 firstObj = new J23();      // Kreiranje novog objekta firstObj u klasi J23
		J23 secondObj = new J23();
		
		System.out.println(firstObj.x);
		System.out.println(firstObj.someString);
		
		System.out.println(secondObj.x);
		System.out.println(secondObj.someString);
		
		firstObj.x = 4323;
		firstObj.someString = "someNewValue";
		System.out.println("Situacija nakon promene: " + firstObj.x);        // promena vrednosti x i someString u objektu firtstObj
		System.out.println("Situacija nakon promene: " + firstObj.someString);
	}

}


//U ovom primeru, klasa `J23` ima dve instance promenljive: `x` (tipa `int`) i `someString` (tipa `String`). U metodi `main`, 
//kreiraju se dva objekta klase `J23`, nazvani `firstObj` i `secondObj`.
//
//### Objašnjenje korak po korak:
//
//1. **Deklaracija promenljivih u klasi `J23`**:
//   - `x` je promenljiva tipa `int` i ima početnu vrednost `10`.
//   - `someString` je promenljiva tipa `String` i ima početnu vrednost `"someValue"`.
//
//2. **Kreiranje objekata `firstObj` i `secondObj`**:
//   - `firstObj` i `secondObj` su dva različita objekta kreirana iz klase `J23`. 
//   Svaki od njih ima sopstvene kopije promenljivih `x` i `someString`.
//   - Početne vrednosti `x` i `someString` za oba objekta su `10` i `"someValue"`.
//
//3. **Ispis početnih vrednosti**:
//   - Kada se ispisuju vrednosti promenljivih za `firstObj`, videće se vrednosti `x = 10` i `someString = "someValue"`.
//   - Isto važi i za `secondObj`, jer su objekti tek kreirani i nisu menjani.
//
//4. **Promena vrednosti u objektu `firstObj`**:
//   - `firstObj.x` se postavlja na `4323`.
//   - `firstObj.someString` se menja u `"someNewValue"`.
//   - Ove promene utiču **samo na objekat `firstObj`**, dok vrednosti `x` i `someString` za `secondObj` 
//   ostaju nepromenjene (`10` i `"someValue"`).
//
//5. **Ispis nakon promene**:
//   - Prikazuje se promenjena vrednost za `firstObj.x` (`4323`) i `firstObj.someString` (`"someNewValue"`).
//   - `secondObj` i dalje ima početne vrednosti jer se promene u `firstObj` ne odražavaju na `secondObj`.
//
//### Zaključak:
//- Svaki objekat `J23` ima **svoje instance promenljive** (`x` i `someString`) koje su nezavisne jedna od druge.
//- Promena vrednosti promenljivih u jednom objektu (`firstObj`) **ne utiče** na vrednosti istih promenljivih u 
//drugom objektu (`secondObj`), jer su to dva odvojena objekta sa svojim kopijama podataka.
//
//Ovo je primer **instanciranja objekata i rada sa instancama promenljivih**, koji je osnovna funkcionalnost 
//u objektno-orijentisanom programiranju u Javi.



























