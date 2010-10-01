
public class HelloWorld {
	private String PrintMe;
	
	public HelloWorld()
	{
		this("Hello world from a new class");
	}
	public HelloWorld(String inputString)
	{
		PrintMe = inputString;
	}
	
	public void printString()
	{
		System.out.println(PrintMe);
	}

}
