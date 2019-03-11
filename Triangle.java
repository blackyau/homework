import java.util.Scanner;


public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int ax = sc.nextInt();
			int ay = sc.nextInt();
			int bx = sc.nextInt();
			int by = sc.nextInt();
			int cx = sc.nextInt();
			int cy = sc.nextInt();
			if(ax==ay && bx==by && cx==cy && cy==0)
				System.exit(0);
			if((bx-ax)*(cy-by)-(by-ay)*(cx-bx) < 0)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}

}
