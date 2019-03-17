//2017 Java C 3
public class SolitaireTriangle {
	static int[]a={1,2,3,4,5,6,7,8,9};
	static int sum=0;
	public static void main(String[] args) {
		f(0);
		System.out.println(sum/3/2);
	}
	static void f(int k){
		if(k==a.length){
			if(a[0]+a[1]+a[2]+a[3]==a[3]+a[4]+a[5]+a[6] && a[3]+a[4]+a[5]+a[6]==a[6]+a[7]+a[8]+a[0]){
				sum++;
			}
		}
		for(int i=k; i<a.length; i++){
			{int t=a[i]; a[i]=a[k]; a[k]=t;}
			f(k+1);
			{int t=a[i]; a[i]=a[k]; a[k]=t;}
		}
	}
}
