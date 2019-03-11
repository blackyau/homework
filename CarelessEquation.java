//2013 Java C 3
public class CarelessEquation {

	public static void main(String[] args) {
		int sum=0;
		for(int a=1; a<=9; a++){
		for(int b=1; b<=9; b++){
		for(int c=1; c<=9; c++){
		for(int d=1; d<=9; d++){
		for(int e=1; e<=9; e++){
			if(a!=b && a!=c && a!=d && a!=e && b!=c && b!=d && b!=e && c!=d && c!=e && d!=e){
				if((a*10+b)*(c*100+d*10+e)==(a*100+d*10+b)*(c*10+e)){
					sum++;
				}
			}
		}
		}
		}
		}
		}
		System.out.println(sum);
	}

}
