// Apstraktne klase i metode

abstract class Base {
	public abstract void firstAbsMethod();
	public abstract void secondAbsMethod();
}

class Details extends Base {
	public void firstAbsMethod() {
		System.out.println("Ja sam iz prve metode");
	}

		public void secondAbsMethod() {
		System.out.println("Ja sam iz druge metode");
	}
}


public class JP30 {

	public static void main(String[] args) {
		
		Details someObj = new Details();
		
		someObj.firstAbsMethod();
		someObj.secondAbsMethod();
	}
		

	}

//Ovaj primer prikazuje korišćenje **apstraktnih klasa** i njihovih implementacija u Javi. Evo objašnjenja šta se dešava u kodu:
//
//### 1. **Apstraktna klasa `Base`**
//   - Ovo je osnovna klasa koja je **apstraktna**, što znači da ne može biti instancirana direktno. Služi kao **šablon** za druge 
//   klase.
//   - Sadrži dve **apstraktne metode** (`firstAbsMethod` i `secondAbsMethod`) koje nemaju telo, tj. nisu implementirane u ovoj klasi.
//   Ideja je da svaka 
//   klasa koja nasledi `Base` mora da implementira ove metode.
//
//### 2. **Klasa `Details`**
//   - Ova klasa **nasleđuje** apstraktnu klasu `Base`.
//   - Implementira obavezne metode (`firstAbsMethod` i `secondAbsMethod`) definisane u `Base` klasi. 
//   Time se ispunjava zahtev da svaka konkretna klasa koja nasledi apstraktnu klasu mora implementirati njene apstraktne metode.
//   - `Details` je konkretna klasa koja može biti instancirana jer ima implementirane sve metode iz `Base` klase.
//
//### 3. **Klasa `JP30`**
//   - Ovo je glavna klasa koja sadrži metodu `main`.
//   - Unutar metode `main`, kreira se instanca klase `Details` pomoću objekta `someObj`:
//     
//     ```java
//     Details someObj = new Details();
//     ```
//     
//   - `someObj` je novi objekat u klasi `Details`. Korišćenjem tog objekta moguće je pozivati metode koje su 
//   implementirane u toj klasi.
//   - Na toj instanci pozivaju se implementirane metode koje su nasleđene iz `Base` klase, a sada su konkretizovane u `Details`.
//
//### **Suština**
//- **Apstraktna klasa `Base`** definiše obavezne metode koje klase koje je naslede moraju implementirati.
//- **Klasa `Details`** nasleđuje `Base` i implementira te metode, omogućavajući instanciranje objekta.
//- **Klasa `JP30`** pravi objekat `someObj` u klasi `Details` i koristi metode koje su obavezno 
//definisane i implementirane u toj klasi.
//
//Ovim se prikazuje osnovni mehanizam **nasleđivanja i apstrakcije** u Javi, gde apstraktne klase služe kao 
//šabloni za kreiranje specifičnih implementacija u izvedenim klasama.









