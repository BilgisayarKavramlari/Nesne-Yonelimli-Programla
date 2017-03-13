package asal;
import java.util.*;


public class asalSayi {
	
	public static void main(String args[])
	{	
		short sayi;
		int x=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayi giriniz");
		
		if(scanner.hasNextShort())
		{
			sayi=scanner.nextShort();
			
			if(sayi>0)
			{
				for(int i=2;i<sayi/2;i++)
				{
					if(sayi%i==0)
					{
						x++;
						break;
					}
					
				}
				
				if(x>0)
				{
					System.out.println("H");
				}
				
				else
					System.out.println("E");
				
				
			}
			
			else
				System.out.println("Pozitif deger girmelisiniz...");
		}
		
		else
			System.out.println("Girdi değeri short deger degil");
		
		
		
		 
		
		
	}

}
