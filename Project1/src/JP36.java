// Enum opcije

enum Options {
	AUDIO,
	VIDEO,
	CONTROLS
}

public class JP36 {

	public static void main(String[] args) {
		
		for (Options someObj : Options.values()) {
			System.out.println(someObj);
		}
		
//		Options inputObj = Options.VIDEO;
//		
//		switch (inputObj) {
//		case AUDIO:
//			System.out.println("Audio settings");
//			break;
//			
//		case VIDEO:
//			System.out.println("VIDEO settings");
//			break;
//			
//		case CONTROLS:
//			System.out.println("Control settings");
//			break;
//			
//		}

	}

}

//
//Ovaj Java program demonstrira upotrebu **`enum`** tipa za definisanje ograničenog skupa mogućih vrednosti, 
//a u ovom slučaju se koristi **`enum`** nazvan **`Options`**, koji sadrži tri vrednosti: `AUDIO`, `VIDEO` i `CONTROLS`.
//
//Evo objašnjenja programa:
//
//1. **Definisanje `enum` tipa**:
//   - **`enum Options`** predstavlja posebnu vrstu podatka koja se koristi za definisanje konstanti. 
//   U ovom slučaju, enum ima tri moguće vrednosti: `AUDIO`, `VIDEO` i `CONTROLS`.
//   
//2. **Korišćenje `for-each` petlje za prikaz vrednosti**:
//   - U glavnom programu, koristi se **`for-each`** petlja da bi se iteriralo kroz sve vrednosti definisane 
//   u **`Options`**. Metoda **`Options.values()`** vraća niz svih vrednosti definisanih u enum-u, i svaka vrednost se štampa.
//
//3. **Komentarisani deo koda sa `switch` naredbom**:
//   - Deo koda koji je komentarisao koristi **`switch`** strukturu da bi se proverila vrednost objekta **`inputObj`**, 
//   koji je tipa **`Options`**.
//   - Ako je vrednost **`inputObj`**:
//     - `AUDIO`, prikazuje se poruka "Audio settings".
//     - `VIDEO`, prikazuje se poruka "VIDEO settings".
//     - `CONTROLS`, prikazuje se poruka "Control settings".
//   - **`break`** naredba se koristi da prekine izvršavanje koda unutar `switch` bloka nakon što je pronađena odgovarajuća vrednost.
//
//### Rezime:
//Program prvo prikazuje sve vrednosti definisane u enum-u koristeći **`for-each`** petlju, a komentarisani deo pokazuje kako možete 
//koristiti `switch` naredbu za različite akcije na osnovu vrednosti iz **`Options`** enum-a.





















