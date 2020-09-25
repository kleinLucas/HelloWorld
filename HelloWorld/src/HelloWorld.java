//Dies ist ein Zählspiel//
public class HelloWorld {

	static int number = 13;
	static int counter = 2;
	static boolean isPrime = true;
	public static void main(String[] args) {
			
		
		while(counter <number/2  && isPrime==true) {
			if(number%counter==0) {isPrime=false;};
		
			counter++;
			
		
	}//while			
	
	if(isPrime==true)	{System.out.println(number);}
	
	
	} //public Static void
}//Public Class


			
			
			 
		
	
	
	
	



