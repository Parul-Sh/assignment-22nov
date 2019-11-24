
public class Prime_Number {

	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Prime numbers are:");
		for(int n=2;n<=100;n++) {
        for(int i=2;i<(n/2);i++)
        {
        	if((n%i)==0)
        	{
        		count++;
        	
        	}
        }
         
        if(count==0)
        { System.out.println(n);
           
        	}
        count=0;
        }

	}

}
