//Jednostavan kalkulator

import java.util.Scanner;

public class JP9 {

	public static void main(String[] args) {
		
		Scanner someObj = new Scanner(System.in);
		
		System.out.println("----------------------------");
		System.out.println("Enter values for x and y: ");
		
		float x = someObj.nextFloat();
		float y = someObj.nextFloat();
		
		System.out.println("Add: " + (x + y));
		System.out.println("Sub: " + (x - y));
		System.out.println("Mul: " + (x * y));
		System.out.println("Div: " + (x / y));
		
		someObj.close();
		
	}

}


//Detaljno objašnjenje koraka:
//1. **Import Scanner klase**: `import java.util.Scanner;` omogućava korišćenje `Scanner` klase koja služi za unos podataka sa tastature.
//
//2. **Kreiranje Scanner objekta**: `Scanner someObj = new Scanner(System.in);` pravi novi `Scanner` objekat koji će čitati korisnikov unos sa standardnog ulaza.
//
//3. **Prikazivanje poruka**: Program prikazuje liniju i poruku `"Enter values for x and y:"` koja traži od korisnika da unese dve decimalne vrednosti.
//
//4. **Čitanje vrednosti**: 
//   - `float x = someObj.nextFloat();` i `float y = someObj.nextFloat();` čitaju decimalne vrednosti (tipa `float`) koje korisnik unese
//   i dodeljuju ih promenljivama `x` i `y`.
//
//5. **Aritmetičke operacije**:
//   - `System.out.println("Add: " + (x + y));` prikazuje zbir `x` i `y`.
//   - `System.out.println("Sub: " + (x - y));` prikazuje razliku između `x` i `y`.
//   - `System.out.println("Mul: " + (x * y));` prikazuje proizvod `x` i `y`.
//   - `System.out.println("Div: " + (x / y));` prikazuje rezultat deljenja `x` sa `y`.
//
//6. **Zatvaranje Scanner-a**: `someObj.close();` zatvara `Scanner` objekat kako bi se oslobodili resursi.
//
//Napomena:
//Ovaj program je koristan za osnovne matematičke proračune nad decimalnim vrednostima. Međutim,
//pri deljenju treba biti oprezan jer deljenje nulom može izazvati grešku u programu.














