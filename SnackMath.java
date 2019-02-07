import java.util.Scanner;

public class SnackMath {

	public static void main(String[] args) {
		int i = 0;
		int [][]array;
		int x=0,y=0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		array = new int[a][a];
		array[x=0][y=a-1]=1;
		i=1;
		
		while(i<a*a){
			while(x+1<a&&array[x+1][y]==0){
				array[++x][y]=++i;
			}
			while(y-1>=0&&array[x][y-1]==0){
				array[x][--y]=++i;
			}
			while(x-1>=0&&array[x-1][y]==0){
				array[--x][y]=++i;
			}
			while(y+1<a&&array[x][y+1]==0){
				array[x][++y]=++i;
			}
		}
		for(int b = 0;b<a;b++){
			for(int c = 0;c<a;c++){
				System.out.print(array[b][c]+" ");
			}
			System.out.println();
		}
	}
}