import java.util.Scanner;

public class HangmanJudge {
	static char[] answer,in = new char[105];
	static boolean win, lose;
	static int len,chance;
	static void guess(char ch){
		boolean bad = true;
		for(int i=0; i<answer.length; i++){
			if(answer[i]==ch){
				len--;
				answer[i]=' ';
				bad=false;
			}
		}
			if(bad) --chance;
			if(chance==0) lose=true;
			if(len==0) win=true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==-1)System.exit(0);
			sc.nextLine();
			String answerst = sc.next();
			String inst = sc.next();
			System.out.println("Round "+n);
			answer = answerst.toCharArray();
			in = inst.toCharArray();
			chance = 7;
			win=lose=false;
			len = answer.length;
			for(int i=0; i<in.length; i++){
				guess(in[i]);
				if(win || lose)
					break;
				}
			if(win)
				System.out.println("You win.");
			else if(lose)
				System.out.println("You lose.");
			else
				System.out.println("You chickened out.");
		}
	}
}
