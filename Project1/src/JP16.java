//Break and continue- For loop

public class JP16 {

	public static void main(String[] args) {
		
		for (int x = 0; x <= 10; x = x + 1) {
			if (x == 5 || x == 2 || x == 7) {
				//break; - prekida petlju kada naidje na zadatgu vrednost x, u ovom slucaju 2
				continue;
				
			}
				
			System.out.println(x);
				
			
		}

	}

}

/*Ovaj program koristi *for* petlju da bi iterirao kroz brojeve od 0 do 10. Unutar petlje nalazi se *if* uslov 
koji proverava da li je vrednost promenljive `x` jednaka 5, 2 ili 7. Ako jeste, petlja koristi naredbu `continue`, 
koja preskače trenutnu iteraciju i prelazi na sledeću bez ispisivanja vrednosti `x` za te brojeve.

### Ključne tačke:
1. **For petlja**: Pokreće se od `x = 0` do `x = 10`, inkrementirajući `x` za 1 pri svakom prolazu.
2. **If uslov**: Ako je `x` jednak 5, 2 ili 7, `continue` naredba preskače ispisivanje i prelazi na sledeći broj.
3. **Ispisivanje**: Kada `x` nije 5, 2 ili 7, ispisuje se vrednost `x`.

Efekat ovog koda je da će se ispisati svi brojevi od 0 do 10, osim 2, 5 i 7, koji su preskočeni zbog naredbe `continue`.*/









