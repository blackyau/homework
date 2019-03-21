// 2013 Java C 2
public class PrimeNumber_1 {
	static int[] a = {9, 9, 1, 4};
	static boolean vis[] = new boolean[a.length];
	static int cont = 0;
	public static void main(String[] args) {
		int[] path=new int[a.length];
		f(0, path);
		System.out.println(cont);
	}
	public static void f(int k, int path[]) {
		if(k==path.length){
			check(path[0]*1000+path[1]*100+path[2]*10+path[3]);
		}
		
		for (int i = 0; i < path.length; i++) {
			if(i>0 && a[i]==a[i-1] && !vis[i-1]) continue;
			
			if(!vis[i]){
				vis[i] = true;
				path[k] = a[i];
				f(k+1, path);
				vis[i] = false;
			}
		}
	}
	private static void check(int n){
		for(int i=2; i<n; i++){
			if(n%i==0){
				break;
			}else
			if(i==n-1){
				cont++;
				break;
			}
		}
	}
}