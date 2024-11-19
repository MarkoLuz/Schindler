// This- kljucna rec

class IntOps {         // klasa
	int x;
	int y;
	
	public IntOps(int a, int b) {  // konstruktor
		this.x = a;
		this.y = b;
		
	}
}

public class JP27 {

	public static void main(String[] args) {


		IntOps someObj = new IntOps(10, 20);           // formiranje objekta
		System.out.println("Value of x: " + someObj.x);
		System.out.println("Value of y: " + someObj.y);
		
		System.out.println("----------------------------------");
		
		IntOps secondObj = new IntOps(55, 130);
		System.out.println("Value of x: " + secondObj.x);
		System.out.println("Value of y: " + secondObj.y);
		
		
		
	}

}

//U ovom primeru koristi se klasa koja se zove `IntOps` sa dva atributa, `x` i `y`. 
//Ova klasa ima konstruktor koji prima dva parametra i postavlja vrednosti `x` i `y` na osnovu tih parametara.
//
//U glavnom delu programa (`JP27` klasa), kreiraju se dva objekta tipa `IntOps`. 
//Prvi objekat dobija vrednosti `10` i `20`, dok drugi objekat dobija vrednosti `55` i `130`. 
//Program zatim ispisuje vrednosti atributa `x` i `y` za oba objekta.
//
//Cilj ovog primera je da pokaže kako se konstruktor koristi za inicijalizaciju objekata sa različitim vrednostima i kako 
//svaki objekat može imati svoje specifične podatke.



















