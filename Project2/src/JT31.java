// Java nizovi

import java.util.Scanner;

public class JT31 {

    public static void main(String[] args) {

        int[] skupBrojeva = new int[5];  // formiranje niza skupBrojeva sa 5 int elemenata
        skupBrojeva[0] = 10;
        skupBrojeva[1] = 20;
        skupBrojeva[2] = 30;
        skupBrojeva[3] = 40;
        skupBrojeva[4] = 50;

        System.out.println("Prvi element niza je: " + skupBrojeva[0]);

    String[] skupNaziva = new String[3];
        skupNaziva[0] = "Knjiga";
        skupNaziva[1] = "Sveska";
        skupNaziva[2] = "Notes";

        System.out.println("Treci element niza je: " + skupNaziva[2]);

    char[] skupKaraktera = new char[3];
        skupKaraktera[0] = '@';
        skupKaraktera[1] = 'A';
        skupKaraktera[2] = 'n';

        System.out.println("Drugi element niza je: " + skupKaraktera[1]);

    Scanner input = new Scanner(System.in);
    int[] noviNiz = new int[3];

        System.out.println("Unesite prvi element: ");
        noviNiz[0] = input.nextInt();
        System.out.println("Unesite drugi element: ");
        noviNiz[1] = input.nextInt();
        System.out.println("Unesite treci element: ");
        noviNiz[2] = input.nextInt();

        System.out.println("Broj 1: " + noviNiz[0] + " Broj 2: " + noviNiz[1] + " Broj 3: " + noviNiz[2]);
        input.nextLine();
      
        
    
    String[] nizImena = new String[3];
    	System.out.println("Unesite prvo ime: ");
    	nizImena[0] = input.nextLine();
    	System.out.println("Unesite druge ime: ");
    	nizImena[1] = input.nextLine();
    	System.out.println("Unesite trece ime: ");
    	nizImena[2] = input.nextLine();
    	
    	System.out.println("Ime 1: " + nizImena[0] + " Ime 2: " + nizImena[1] + " Ime 3: " + nizImena[2]);
    	input.close();
        
        
        
        
        
    }
}

