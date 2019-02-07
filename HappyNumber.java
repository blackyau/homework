import java.util.HashSet;
import java.util.Scanner;


public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=1;n+1>i;i++){
			String number_st = sc.next();
			int number = Integer.valueOf(number_st).intValue();
			HashSet list = new HashSet();
			while(number>0){
				if(!list.add(number)){
					System.out.println("Case #" + i +": " + number_st + " is an Unhappy number.");
					break;
				}else{
					number = sum(number);
					if(number==1){
						System.out.println("Case #" + i +": " + number_st + " is a Happy number.");
						break;
					}
				}
			}
		}
	}
	public static int sum(int in) {
		int a=0,sum=0;
		do{
			a = in % 10;
			in = in / 10;
			sum += a*a;
		}while(in>0);
		return sum;
	}
}