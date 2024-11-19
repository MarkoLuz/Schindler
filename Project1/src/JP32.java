// Interfejsi

interface Car {
	public void operationA();
	public void operationB();
}

interface Light {
	public void lights();
}


class ModelA implements Car, Light {
	
	public void operationA() {
		System.out.println("Operacija A");
	}
	
	public void operationB() {
		System.out.println("Operacija B");
	}
	
	public void lights() {
		System.out.println("Operacija Lights");
	}
}
	

public class JP32 {

	public static void main(String[] args) {
		
		ModelA firstObj = new ModelA();
		firstObj.operationA();
		firstObj.operationB();
		firstObj.lights();
	}

}

//Kod se sastoji od **dva interfejsa** (`Car` i `Light`) i jedne klase (`ModelA`) koja implementira oba interfejsa.
//Evo objašnjenja:
//
//### 1. **Interfejs `Car`:**
//   - Sadrži dve apstraktne metode: `operationA()` i `operationB()`.
//   - Interfejs definiše **skup operacija** koje bilo koja klasa koja implementira ovaj interfejs mora da definiše. 
//   Metode su apstraktne, što znači da interfejs samo definiše **šta** će metoda raditi, ali ne i **kako**.
//
//### 2. **Interfejs `Light`:**
//   - Sadrži jednu apstraktnu metodu: `lights()`.
//   - Kao i interfejs `Car`, ovo je ugovor koji svaka klasa koja implementira `Light` mora da poštuje.
//
//### 3. **Klasa `ModelA`:**
//   - Implementira oba interfejsa: `Car` i `Light`.
//   - Ovo znači da klasa `ModelA` mora da implementira sve metode koje su definisane u oba interfejsa.
//     - Implementacija metoda `operationA()` i `operationB()` ispunjava zahteve iz interfejsa `Car`.
//     - Implementacija metode `lights()` ispunjava zahtev iz interfejsa `Light`.
//   - Klasa `ModelA` obezbeđuje konkretne implementacije metoda definisanih u interfejsima, čime se precizira 
//   kako će se svaka operacija izvršiti.
//
//### 4. **Klasa `JP32`:**
//   - Sadrži glavnu metodu `main`, koja je ulazna tačka za pokretanje programa.
//   - Unutar `main` metode:
//     - Kreira se objekat `firstObj` klase `ModelA`.
//     - Ovaj objekat koristi implementirane metode iz `ModelA` kako bi izvršio operacije definisane u interfejsima `Car` i `Light`.
//
//### **Zaključak:**
//Kod demonstrira koncept **višestruke implementacije interfejsa**. Klasa `ModelA` koristi mogućnost Java jezika da 
//implementira više interfejsa, omogućavajući kombinovanje funkcionalnosti različitih operacija. Ovo je primer polimorfizma
//u kojem `ModelA` može da se ponaša kao objekat bilo kog od implementiranih interfejsa (`Car` ili `Light`), zavisno od konteksta.




