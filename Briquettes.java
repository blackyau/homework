//2016 Java C 2
public class Briquettes {
	public static void main(String[] args) {
		int[] list = new int[101];
		list[0]=0;
		int sum=0;
		for(int i=1; i<list.length; i++){
			list[i] = list[i-1]+i;
		}
		for(int i=1; i<list.length; i++)
			sum = sum+list[i];
		System.out.println(sum);
	}

}
