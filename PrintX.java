import java.util.Scanner;

//2015 Java C 9
public class PrintX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int w = m+(n/2)*2;
		String a[][] = new String[n][w];
		for(int i=0; i<n; i++){
			for(int l=0; l<w; l++){
				a[i][l] = ".";
			}
		}
		for(int i=0; i<n; i++){
				for(int k=0; k<m; k++){
					a[i][k+i] = "*";
				}
		}
		for(int i=0; i<n; i++){
			for(int k=0; k<m; k++){
				a[i][w-1-k-i] = "*";
			}
		}
		for(int i=0; i<n; i++){
			for(int l=0; l<m+(n/2)*2; l++){
				System.out.print(a[i][l]);
			}
			System.out.println();
		}
	}

}
