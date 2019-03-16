//2016 Java C 6
public class MergeFormula2 {
	static int[] a = {1,2,3,4,5,6,7,8,9};
	static int sum = 0;
	public static void main(String[] args) {
		f(0);
		System.out.println(sum);
	}
	static void f(int k){
		if(k==a.length){//一种排列已生产
			int ghi=a[5]+a[4]*10+a[3]*100;
			int def=a[8]+a[7]*10+a[6]*100;
			if((a[2]*ghi+def*a[1])%(a[1]*ghi)==0 && a[0]+(a[2]*ghi+def*a[1])/(a[1]*ghi)==10){
				sum++;
			}
		}
//		从k往后的每个数字都可以放在k位
		for(int i=k; i<a.length; i++){
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
			}
			f(k+1);//递归
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
			}//回溯
		}
	}
}
