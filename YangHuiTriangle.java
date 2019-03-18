//2017 Java C 5
public class YangHuiTriangle
	{
		// 杨辉三角形的第row行第col列
		static long f(int row, int col){
			if(row<2) return 1;
			if(col==0) return 1;
			if(col==row) return 1;
			
			long[] a = new long[row+1];
			a[0]=1;
			a[1]=1;
			
			int p = 2;
			
			while(p<=row){
				a[p] = 1;
				for(int q=p-1;q>0;q--) a[q] = a[q] + a[q-1];
				p++;
			}
			
			return a[col];
		}
		
		public static void main(String[] args){
			System.out.println(f(6,2));
			System.out.println(f(6,3));		
		}
	}
