import java.util.Arrays;
import java.util.Scanner;

public class BinPacking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		if(count==0){
			System.exit(0);
		}else
			for(int temp=count; temp>0; temp--){
			sc.nextLine();
			int n = sc.nextInt();
			int capacity = sc.nextInt();
			int [] box = new int[n];
			for(int i=0; i<n; i++){
				box[i] = sc.nextInt();
			}
			Arrays.sort(box);
			int BoxCount=0;
			for(int i=n-1,j=0; i>=j; i--){
				if(capacity-box[i]-box[j] >= 0){
					BoxCount++;
					j++;
				}else{
					BoxCount++;
				}
			}
			System.out.println(BoxCount);
			if(temp>1) System.out.println();
			}
		sc.close();
		System.exit(0);
	}
}
