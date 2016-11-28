import java.io.*;
import java.math.BigInteger;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int ile;
		String liczba,pierwsza,druga;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		liczba = br.readLine();
        ile = Integer.parseInt(liczba);
		
		
		while(ile>0)
		{
			
			liczba=br.readLine();
			String[] parts = liczba.split(" ");     // dzieli stringa na dwa. Pierwszy od poczatku do napotkania znaku " " a drugi od znaku " " do konca
			pierwsza = parts[0];
			druga = parts[1];
			BigInteger a = new BigInteger(pierwsza);
			BigInteger b = new BigInteger(druga);
			
			System.out.println(a.add(b));
				
			
			ile--;
		}
		
	}
} 