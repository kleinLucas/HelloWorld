//Dies ist ein Zählspiel//
public class HelloWorld {

	static int counter = 0;
	
	public static void main(String[] args) {
	
		
		
		while(counter<100) {
			if(counter%5==0) {System.out.println("Hello Space!");}
				else {System.out.println("Hello World!");}
			System.out.println(counter);
			counter++;
			 
		}
	}

}
