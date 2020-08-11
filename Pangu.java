// Pangu Separates Heaven and Earth
// https://vjudge.net/contest/388755#problem/E
import java.util.Scanner;
public class Pangu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] list = new int[count];
		for(; count>0; count--){
			sc.nextLine();
			list[count-1] = sc.nextInt();
		}
		for(int i=list.length; i>0; i--){
			if(list[i-1]==1){
				System.out.println(18000);
			}else{
				System.out.println(0);
			}
		}
	}
}
