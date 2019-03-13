//2015 Java C 2
public class CubeEnd {
	public static void main(String[] args) {
		long sum = 0;
		for(long i=1; i<10000; i++){
			long cont = String.valueOf(i).length();
			long endnum = (long) Math.pow(10, cont);
			if((i*i*i)%(endnum)==i){
				sum++;
			}
		}
		System.out.println(sum);
	}

}
