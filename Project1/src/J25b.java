public class J25b {
	
	int x;
	String someString;
	
	public J25b(int a, String b) {                                      // formiranje konstruktora
		x = a;
		someString = b;
	}

	public static void main(String[] args) {
		
		J25b firstObj = new J25b(4323, "Neki string");  // prvi objekat
		J25b secondObj = new J25b(5000, "test test");   // drugi objekat
		
		System.out.println("Vrednost x: " + firstObj.x + "  Vrednost someString: " + firstObj.someString);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Vrednost x: " + firstObj.x);
		System.out.println("Vrednost someString: " + firstObj.someString);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Vrednost x: " + secondObj.x);
		System.out.println("Vrednost someString: " + secondObj.someString);
	}

}





