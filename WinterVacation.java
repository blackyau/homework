import java.util.Arrays;


public class WinterVacation {
	static int[]a = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	static int sum = 0;
	public static void main(String[] args) {
		long star = System.nanoTime();
		f(0);
		System.out.println(sum);
		long end = System.nanoTime();
		System.out.printf("Run time: %f min",(end-star)/60000000000.0);
	}
	static void f(int k){
		if(k==a.length){//生成了一个新序列
			if(a[0]+a[1]==a[2] && a[3]-a[4]==a[5] && a[6]*a[7]==a[8] && a[9]%a[10]==0 && a[9]/a[10]==a[11]){
				sum++;
				System.out.println(sum+" "+Arrays.toString(a));
			}
		}
		for(int i=k; i<a.length; i++){
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
			}
			f(k+1);
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
			}
		}
	}

}
