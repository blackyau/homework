public class Step {
	public static int sum = 0;
	public static void f(int a, int b) {
		if(a==39 && b%2==0){
			sum++;
			return;
		}
		if(a>39)
			return;
		f(a+1,b+1);
		f(a+2,b+1);
	}
	public static void main(String[] args) {
		f(0,0);
		System.out.println(sum);
	}
}
