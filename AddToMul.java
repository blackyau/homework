//2015 Java C 7
public class AddToMul {
	public static void main(String[] args) {
		for(int n=0; n<50; n++){
			for(int m=0; m<50; m++){
				if(m!=n)
					f(n, m);
			}
		}
	}
	public static void f(int n,int m) {
		if(m>48)return;
		if(n>48)return;
		int sum = 0;
		int[] list = new int[50];
		for(int i=0; i<50; i++){
			list[i] = i;
		}
		for(int i=0; i<list.length; i++){
			if(i!=n && i!=m){
				sum = sum + list[i];
			}else if (i==n) {
				sum = sum+list[n]*list[n+1];
				i++;
			}else if (i==m) {
				sum = sum+list[m]*list[m+1];
				i++;
			}
		}
		if(sum==2015){
			if(n<m)
				System.out.println(n);
			if(m<n)
				System.out.println(m);
		}else
			return;
	}

}
