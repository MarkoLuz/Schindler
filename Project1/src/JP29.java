// Inner (Unutrasnje) klase (outsider i insider metoda)

class OutsiderClass {
	public void outsiderMethod() {
		System.out.println("Ja sam produkt outsider metode");
	
	}
	
	
	class InsiderClass {
		public void insiderMethod() {
			System.out.println("Ja sam produkt insider metode");
		}
	}
}

public class JP29 {

	public static void main(String[] args) {
		
		OutsiderClass outObj = new OutsiderClass();  
		outObj.outsiderMethod();
		
		OutsiderClass.InsiderClass inObj = outObj.new InsiderClass();
		inObj.insiderMethod();
		
	}

}

//U ovom primeru se koristi kombinacija spoljašnje (engl. outer) i unutrašnje (engl. inner) klase, 
//gde jedna klasa (unutrašnja) živi unutar druge (spoljašnje). Evo objašnjenja:
//
//Klasa OutsiderClass:
//
//Ovo je spoljašnja klasa koja ima metodu outsiderMethod(). Kada se ova metoda pozove, 
//ona ispisuje poruku da je rezultat "outsider metode".
//Unutrašnja klasa InsiderClass:
//
//Definisana je unutar klase OutsiderClass. Ova unutrašnja klasa ima svoju metodu insiderMethod(), 
//koja ispisuje poruku da je rezultat "insider metode".
//Šta se dešava u main metodi?
//Prvo se kreira objekat spoljašnje klase OutsiderClass, što omogućava pozivanje njene metode outsiderMethod().
//Zatim se kreira objekat unutrašnje klase InsiderClass. Da bi se kreirao objekat unutrašnje klase, prvo moraš imati 
//instancu spoljašnje klase. Tako se pomoću objekta outObj pravi objekat unutrašnje klase inObj, 
//koji može koristiti metode iz InsiderClass.
//Pozivanje metoda pokazuje kako se pristupa funkcionalnosti spoljašnje i unutrašnje klase.
//Ovaj pristup sa unutrašnjom klasom omogućava povezivanje dve klase gde unutrašnja klasa može da koristi sve članove spoljašnje klase, 
//dok i dalje ima svoju posebnu funkcionalnost. To je često korisno kada želiš da grupišeš funkcionalnosti koje su usko povezane unutar 
//jedne strukture.









