import java.util.Scanner;

//2013 Java C 7
public class WalnutsNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		for(int i=1; i<10000; i++){
			if(a%i==0 && b%i==0 && c%i==0){
				if(i>a && i>b && i>c){
					System.out.println(i);
					break;
				}
			}else if (i%a==0 && i%b==0 && i%c==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
