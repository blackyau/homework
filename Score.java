import java.util.Scanner;

// UVa 1585
public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cycle = sc.nextInt();
		while (cycle-->0){
			sc.nextLine();
			String a = sc.next();
			char[] input = a.toCharArray();
			int num = 0;
			int flag = 0;
			for(int i=0; i<input.length; i++){
				if(input[i] == 'O'){
					num = num + 1 + flag;
					flag++;
				}else
					flag = 0;
			}
			System.out.println(num);
		}
		sc.close();
		System.exit(0);
	}
}
