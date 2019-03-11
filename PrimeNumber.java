// 2013 Java C 2
public class PrimeNumber {
	public static int a=0;
	public static void main(String[] args) {
		f(1499);
		f(1949);
		f(1994);
		f(4991);
		f(4919);
		f(4199);
		f(9914);
		f(9941);
		f(9419);
		f(9491);
		System.out.println(a);
	}
	private static void f(int n){
		for(int i=2; i<n; i++){
			if(n%i==0){
				break;
			}else
			if(i==n-1){
				a++;
				break;
			}
		}
	}
}