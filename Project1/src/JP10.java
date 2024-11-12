//IF-ELSE statments

public class JP10 {

	public static void main(String[] args) {
		
		int testNumber = 5;
		
		if(testNumber < 20)  
		{
			System.out.println("testni broj je manji od 20");
		} 
		
		else if (testNumber > 20)  
		{
			System.out.println("testni broj je veci od 20");
		}
		
		else 
		{
			System.out.println("brojevi su jednaki");
		}
	

	}

}

//Ovaj Java program koristi jednostavan kontrolni tok `if-else` da bi proverio vrednost promenljive `testNumber` i ispisao odgovarajuću poruku
//u zavisnosti od njenog odnosa prema broju 20.
//
//Evo kako program funkcioniše:
//
//1. **Definisanje promenljive**: Promenljiva `testNumber` se inicijalizuje sa vrednošću 5.
//
//2. **If-else struktura**:
//   - Prvi `if` blok proverava da li je `testNumber` manji od 20. Ako je uslov tačan (kao u ovom slučaju, jer je 5 < 20), ispisuje poruku 
//     `"testni broj je manji od 20"`.
//   - Ako je prvi uslov netačan, prelazi se na `else if` blok, koji proverava da li je `testNumber` veći od 20. 
//     Ako je tačno, ispisala bi se poruka `"testni broj je veci od 20"`.
//   - Ako nijedan od prethodnih uslova nije tačan, izvršava se `else` blok, koji ispisuje `"brojevi su jednaki"` (što bi se dogodilo kada je `testNumber` tačno 20).
//
//U ovom primeru, pošto je `testNumber` postavljen na 5, ispisana će biti poruka `"testni broj je manji od 20"`.








