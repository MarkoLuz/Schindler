//Arrays and for each loop- liste i for-each petlje
public class JP14 {

	public static void main(String[] args) {
		
	  /*String[] progLang = { "Python", "C++", "Pearl", "Lisp", "Java" };
		
		for (String x: progLang) {
			System.out.println("Language: " + x);
		}*/
		
		/*int [] numbers = { 1, 5, 300, 10000};
		for (int x: numbers) {
			System.out.println("Numbers: " + x);
			
		}*/
		
		char [] charArray = { 'A', 'Z', 'C', 'C', 'C'}; // lista moze da sadrzi duplikate
			for (char x: charArray) {
			System.out.println("Char: " + x);
		
			}
		
//Ovaj deo koda prikazuje kako koristiti *for-each* petlju za iteraciju kroz niz karaktera `charArray`. 
//Niz `charArray` sadrži pet elemenata: `'A'`, `'Z'`, `'C'`, `'C'`, i `'C'`.
//
//### Objašnjenje:
//1. **For-each petlja**: Ova petlja prolazi kroz svaki element u nizu `charArray`. 
//Za svaki prolaz, trenutni element iz niza se dodeljuje promenljivoj `x` tipa `char`.
//			   
//2. **Ispisivanje karaktera**: U svakom prolazu, koristi se `System.out.println` da bi se ispisao 
//trenutni karakter (tj. vrednost `x`) sa prefiksom `"Char: "`. 
//
//Rezultat je da se svaki karakter iz niza štampa u novom redu.															
			
			
	}

}
