// Static i Non-Static metode
public class J24 {
	
	static void directUsage() {
		System.out.println("Ja sam iz direct usage metode");
	}
	
	public void mustUseObject() {
		System.out.println("Ja sam iz must use metode");
		
	}
	
	
	public static void main(String[] args) {
		
		directUsage();
		
//		J24 testObj = new J24();
//		testObj.directUsage();
		
		J24 mustUseObj = new J24();
		mustUseObj.mustUseObject();
		
		
 		

	}

}



//U klasi `J24`, postoje dve metode, `directUsage()` i `mustUseObject()`, a glavna (`main`) metoda je ta koja pokreće ove metode.
//
//### Objašnjenje koda
//
//1. **`directUsage()` metoda**:
//   - Ovo je **staticka metoda**, što znači da se može pozvati direktno, bez kreiranja instance (objekta) klase. 
//   - U `main` metodi, ona se poziva jednostavno kao `directUsage()`, jer je `main` takođe statička metoda, pa može pristupiti svim 
//   statičkim metodama klase bez potrebe za kreiranjem objekta.
//
//2. **`mustUseObject()` metoda**:
//   - Ovo je **instancna metoda**, što znači da se ne može pozvati direktno kao statička metoda. Potrebno je prvo kreirati objekat 
//   klase kako bi se mogla pozvati.
//   - U `main` metodi, kreira se novi objekat klase `J24` sa imenom `mustUseObj` (`J24 mustUseObj = new J24();`).
//   - Nakon što je objekat kreiran, `mustUseObject()` metoda se može pozvati pomoću tog objekta (`mustUseObj.mustUseObject();`).
//
//### Razlika između statičkih i instancnih metoda
//
//- **Statičke metode** (`static`) su povezane sa samom klasom, ne sa instancama te klase. Mogu se pozvati direktno preko imena 
//klase ili unutar drugih statičkih metoda bez potrebe za kreiranjem objekta.
//- **Instancne metode** nisu statičke i zahtevaju da prvo kreiraš objekat te klase kako bi im pristupio, jer su povezane sa 
//specifičnom instancom (objektom) klase.
//
//### Primer za upotrebu:
//- `directUsage()` možeš pozvati bez kreiranja objekta, jer je statička.
//- `mustUseObject()` zahteva kreiranje objekta da bi mogla da se koristi, jer je instancna metoda.