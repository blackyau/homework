import java.util.Scanner;

//2015 Java C 8
public class MoveLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int xm, ym, xn, yn;
		// m 的 y 轴坐标
		if(m%w==0){
			ym = m/w;
		}else{
			ym = m/w+1;
		}
		// n 的 y 轴坐标
		if(n%w==0){
			yn = n/w;
		}else{
			yn = n/w+1;
		}
		// m 的 x 轴坐标
		if(ym%2==0){
			xm = ym*w-m+1;
		}else{
			xm = w-(ym*w-m);
		}
		// n 的 x 轴坐标
		if(yn%2==0){
			xn = yn*w-n+1;
		}else{
			xn = w-(yn*w-n);
		}
		
		System.out.println(Math.abs(xn-xm)+Math.abs(yn-ym));
	}

}
