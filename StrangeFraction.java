//2014 Java C 7
public class StrangeFraction {
	public static void main(String[] args) {
		int cnt = 0;
		for(int a=1;a<10;a++){
		for(int b=1;b<10;b++){
		for(int c=1;c<10;c++){
		for(int d=1;d<10;d++){
			if(a!=b && c!=d && (a*c*(b*10+d)==(b*d*(a*10+c)))){
			cnt++;
			}
		}
		}
		}
		}
		System.out.println(cnt);
	}

}
