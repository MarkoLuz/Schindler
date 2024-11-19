// Super- klucna rec

class Primary {
	public void sameName() {
		System.out.println("Ja sam iz primarne klase");
	}
}

class Secondary extends Primary {
	public void sameName() {
		super.sameName();
		System.out.println("Ja sam iz sekundarne klase");
	}
}

class Tertiary extends Secondary {
	public void sameName() {
		super.sameName();
		System.out.println("Ja sam iz tercijalne klase");
	}
}
public class JP28 {

	public static void main(String[] args) {
		
//		Primary primObj = new Primary();
//		primObj.sameName();
		
//		Secondary secObj = new Secondary();
//		secObj.sameName();
		
		Tertiary terObj = new Tertiary();
		terObj.sameName();
		
		

	}

}

//U ovom primeru, imamo tri klase: **Primary**, **Secondary**, i **Tertiary**. 
//Svaka od njih koristi tehniku **nasleđivanja** kako bi se definisalo ponašanje, 
//i sve tri imaju metodu pod istim imenom — `sameName()`.
//
//### Objašnjenje
//1. **Primary klasa** je osnovna klasa sa metodom `sameName()`, koja ispisuje poruku da je pozvana iz "primarne klase".
//
//2. **Secondary klasa** nasleđuje klasu **Primary**. To znači da preuzima sve njene karakteristike,
//ali dodatno redefiniše metodu `sameName()`. Kada se metoda pozove u **Secondary** klasi, prvo koristi 
//verziju metode iz **Primary** klase pomoću `super.sameName()`, a zatim ispisuje poruku iz "sekundarne klase".
//
//3. **Tertiary klasa** nasleđuje **Secondary**, što znači da može koristiti sve metode iz prethodnih klasa. 
//Takođe redefiniše metodu `sameName()`. Kada se metoda pozove u **Tertiary** klasi, prvo koristi verziju metode 
//iz **Secondary** (koja uključuje poziv na **Primary**), a zatim ispisuje poruku iz "tercijalne klase".
//
//### Šta se dešava kada se pokrene program?
//- Kada kreiraš objekat klase **Tertiary** i pozoveš `sameName()` metodu, metoda se ponaša kao **lanac poziva**:
//  1. Počinje sa `sameName()` metodom iz **Primary**.
//  2. Nastavlja sa `sameName()` iz **Secondary**.
//  3. Završava sa `sameName()` iz **Tertiary**.
//
//Dakle, metoda `sameName()` iz **Tertiary** klase zapravo poziva sve metode iz hijerarhije, počevši 
//od **Primary** preko **Secondary**, pa sve do svoje implementacije.





















