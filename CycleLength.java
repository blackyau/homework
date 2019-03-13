import java.util.Vector;

//2015 Java C 4
public class CycleLength {
	public static void main(String[] args) {
		System.out.println(f(11, 13));
		System.out.println(f(7, 18));
	}
	public static int f(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();
		
		for(;;)
		{
			v.add(n);
			n *= 10;
			n = n % m;
			int temp = v.size();
			int temp2 = v.indexOf(n);
			if(n==0) return 0;
			if(v.indexOf(n)>=0)  return v.size()-v.indexOf(n);  //填空
		}
	}

}
