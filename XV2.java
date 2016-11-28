import java.io.*;
import java.math.BigInteger;
public class XV2 {

	public static void main(String[] args) 
			throws IOException
    {
        String a;
        int ile;
        int cos;
        
       
        int sterowanie;
        
        long suma;
        
        
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        ile = Integer.parseInt(a);
        
        while(ile>0)
        {
        
        suma=0;
        cos=0;
        sterowanie=2;
        a = br.readLine();
        for(int i=0;i<a.length();i++)suma = suma+( a.charAt(i)-48);
        int ostatnia=a.charAt(a.length()-1)-48;
        
        while(sterowanie!=0)
        {
        	
        if(suma%3==0)
        {
        	if(ostatnia==5||ostatnia==0)
        	{
        		BigInteger pierwsza = new BigInteger(a);
        		String s  = Integer.toString(cos);
        		BigInteger drugi = new BigInteger(s);
        		System.out.println(pierwsza.subtract(drugi));
        		sterowanie=0;
        		
        	}
        	else
        	{
        		suma=suma-1;
            	cos++;
            	
            	ostatnia--;
        	}
        		
        }
        else
        {
        	suma=suma-1;
        	cos++;
        	if(ostatnia==0)ostatnia=9;
        	else ostatnia--;
        
   
        
        }
        }
        ile--;
        }
    }
}
    
        
        
        
      

