//Enkapsulacija- Geteri i Seteri
public class JP31Main {

	public static void main(String[] args) {
		
		JP31Base someObj = new JP31Base();
		someObj.setName("Neki string");
		
		System.out.println(someObj.getName());
	}

}


//Kod se sastoji od dve klase, `JP31Base` i `JP31Main`, koje se nalaze u **default paketu**. Evo objašnjenja:
//
//### 1. **JP31Base klasa:**
//   - **Atributi:**
//     - Ima privatnu promenljivu `name` tipa `String`. Ova promenljiva je dostupna samo unutar klase `JP31Base` 
//     zbog nivoa pristupa "private".
//   - **Metode:**
//     - **`setName(String a)`**: Ovo je javna metoda koja omogućava postavljanje vrednosti za privatnu promenljivu `name`. 
//     Metoda prihvata parametar `String a` i postavlja njegovu vrednost u promenljivu `name` koristeći `this.name = a`.
//     - **`getName()`**: Ovo je javna metoda koja vraća vrednost privatne promenljive `name`, omogućavajući da se ta vrednost
//     pročita izvan klase.
//
//### 2. **JP31Main klasa:**
//   - Sadrži glavnu metodu `main`, koja je ulazna tačka programa.
//   - Unutar `main` metode:
//     - Kreira se objekat `someObj` klase `JP31Base`.
//     - Metodom `setName` postavlja se vrednost privatne promenljive `name` u objektu `someObj`.
//     - Zatim se metodom `getName` dobija vrednost te promenljive i ispisuje.
//
//### **Zaključak:**
//Kod pokazuje upotrebu **enkapsulacije**, gde su podaci (`name`) sakriveni unutar klase `JP31Base` i dostupni su 
//samo putem javnih metoda (`setName` i `getName`). Klasa `JP31Main` koristi ovu funkcionalnost da pristupi i upravlja 
//vrednostima objekta. Enkapsulacija pomaže u zaštiti podataka i kontroli pristupa.



















