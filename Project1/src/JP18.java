//Arrays- operacije sa nizovima
public class JP18 {

	public static void main(String[] args) {
		String[] progLang = {"Java", "Python", "Pearl", "Lisp", "C++"};
		int[] numbers = {1, 3, 5, 25, 5000};
		
		System.out.println(progLang[0]);
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		
		progLang[0] = "Prolog";
		System.out.println(progLang[0]);
		
		numbers[4] = 4323;
		System.out.println(numbers[4]);
		
		for (int i = 0; i < numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		
		for (int i = 0; i < progLang.length; i++) {  // kad stampam clanove liste stringova moram da koristim int i = 0
		    System.out.println(progLang[i]);         // a ne String i = 0...  
		}
		
		System.out.println("Broj jezika je: " + progLang.length); //Broj clanova nizova progLang i numbers
		System.out.println("Broj brojeva je: " + numbers.length);
		
		System.out.println("-----------------------------------");
		System.out.println("Prolazak kroz niz stringova drugi nacin: ");
		
		
		for (String x : progLang) {
		    System.out.println(x);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Prolazak kroz niz brojeva drugi nacin: ");
		
		for (int x : numbers) {
		    System.out.println(x);
		}

	}

}
