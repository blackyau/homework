//2016 Java C 7
public class BuildingBlocks3 {
	static int[] a = {0,1,2,3,4,5,6,7,8,9};
	static int n = 0;
	static boolean[] vis = new boolean[a.length];
	public static void main(String[] ars) {
		int[] path = new int[a.length];
		f(0, path);
		System.out.println(n);
	}
	static void f(int k, int path[]){
		if(k==path.length){
			if(path[0]>path[4] && path[1]>path[4] && path[1]>path[5] && path[2]>path[5] && path[2]>path[6] && path[3]>path[6] && path[4]>path[7]&& path[5]>path[7]&& path[5]>path[8] && path[6]>path[8] && path[7]>path[9] && path[8]>path[9]){
				n++;
			}
		}
		for (int i = 0; i < path.length; i++) {
//			if(i > 0 && a[i] == a[i-1] && !vis[i-1])continue;
			
			if(!vis[i]){
				vis[i] = true;
				path[k] = a[i];
				f(k+1, path);
				vis[i] = false;
			}
		}
	}
}