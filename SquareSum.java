import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//2016 Java 8
public class SquareSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
		for(int c=0; c*c<=in/2; c++){
			for(int d=c; d*d+c*c<=in; d++){
				if(!cache.containsKey(d*d+c*c)){
					cache.put(d*d+c*c, c);
				}
			}
		}
		for(int a=0; a*a<=in/4; a++){
			for(int b=a; a*a+b*b<=in/2; b++){
				if(cache.get(in-a*a-b*b)!=null){
					int c = cache.get(in-a*a-b*b);
					int d = (int)Math.sqrt(in-a*a-b*b-c*c);
					System.out.printf("%d %d %d %d\n",a,b,c,d);
					System.exit(0);
				}
			}
		}
		
	}

}
