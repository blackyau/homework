import java.util.Scanner;


public class SpecialPalindromicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		for(int i=10000; i<100000; i++)
			if(i/10000==i%10 && i/1000%10==i/10%10 && i/10000 + i%10 + i/1000%10 + i/10%10 + i/100%10 == sum)
				System.out.println(i);
		for(int i=100000; i<1000000; i++){
			if(i/100000==i%10 && i/10000%10==i/10%10 && i/1000%10==i/100%10 && i/100000 + i%10 + i/10000%10 + i/10%10 + i/1000%10 + i/100%10 == sum)
				System.out.println(i);
		}
	}
}
