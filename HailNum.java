import java.util.Scanner;

//2016 Java C 8
public class HailNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=0,max=0;
		for(int i=1; i<=n; i++){
			temp=f(i);
			max=(temp>max)?temp:max;
		}
		System.out.println(max);
	}
	static int f(int in){
		int max=0;
		while (true) {
			if(in%2==0){
				in = in/2;
				if(in>max)max=in;
			}else{
				in = in*3+1;
				if(in>max)max=in;
			}
			if(in==1)break;
		}
		return max;
	}

}
