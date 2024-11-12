import java.util.Scanner;

public class JP11 {

	public static void main(String[] args) {
		
		Scanner someObj = new Scanner(System.in);
		
		System.out.println("----------------------------------------");
		System.out.println("Prvi broj je: ");
		
		int firstNumber = someObj.nextInt();
		
		System.out.println("Drugi broj je: ");
		
		int secondNumber = someObj.nextInt();
		
		if (firstNumber < secondNumber) 
		{
			System.out.println(firstNumber + " je manji od " + secondNumber);
		}
		
		else if (firstNumber > secondNumber) 
		{
			System.out.println(firstNumber + " je veci od " + secondNumber);
		}
		
		else 
		{
			System.out.println(firstNumber + " je jednak " + secondNumber);
		}

		someObj.close();
	}

}
