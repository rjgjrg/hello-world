

public class HelloWorld {

	public static void main(String[] args) {
		
		String someVariable = "This is some variable";
		
	System.out.println("Hello World!");
	
	System.out.println(returnInt(2.3, 3)); 
	
	System.out.println(someVariable);	
	
	}
	
	
	// This is a comment
	
	public static int returnInt(double dbl, int action) {
		
		int i = 0;
		
		switch (action) {
		
		case 0: return 0;
		
		case 1: return (int) Math.floor(dbl);
		
		case 2: return (int) Math.ceil(dbl);
		
		case 3: return (int) Math.incrementExact(action);
		
		default: return 11;
		
		}
		
		
		//return (int) Math.floor(dbl);
	
	
	}
	
	public static void TestCSharp() {
		String input = "";
		Byte testByte[];

        System.out.print("Enter a string: ");

        input = System.in.read(input, 0, 100);

        System.out.(testByte);
        System.in.read();
        
        switch (input) {
            case "test":
                System.out.println("You input test");
                break;
            case "prod":
                Console.WriteLine("You input prod");
                break;

        }

        Console.ReadLine();
	}
	
	
}
