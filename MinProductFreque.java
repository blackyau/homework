import java.util.Scanner;


public class MinProductFreque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-->0){
			int m = sc.nextInt();
			int cont = 0; 
			while(m != 1){
				if(m == 1)
					System.out.println(1);
				else if(m%2 == 0){
					cont++;
					m /= 2;
				}
				else if(m%2 == 1){
					cont += 2;
					m /= 2;
				}
			}
			System.out.println(cont);
		}
	}
}
