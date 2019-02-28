import java.util.Scanner;
import java.util.Stack;

//UVa 514
public class Rails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while (input > 0) {
			int[] target = new int[input];
			while(true){
				Stack<Integer> stack = new Stack<Integer>();
				target[0] = sc.nextInt();
				if(target[0]==0){
					System.out.println();
					break;
				}else{
					for(int i=1; i<input; i++){
						target[i] = sc.nextInt();
					}
					int flag = 0;
					for(int i=1; i<=input; i++){
						stack.push(i);
						while(!stack.isEmpty()){
							if(stack.peek() == target[flag]){
								flag++;
								stack.pop();
							}else{
								break;
							}
						}
					}
					if(stack.isEmpty())
						System.out.println("Yes");
					else
						System.out.println("No");
				}
			}
			input = sc.nextInt();
		}
		sc.close();
	}
}
