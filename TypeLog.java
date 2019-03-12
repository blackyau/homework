//2014 Java C 5
public class TypeLog {
	private static int n = 1;
	public static void main(String[] args) {
		for(int i=0; i<6; i++)
			write("");
	}
	public static void write(String msg)
	{
		String filename = "t" + n + ".log";
		n = n%3+1;
		System.out.println("write to file: " + filename + " " + msg);
	}

}
