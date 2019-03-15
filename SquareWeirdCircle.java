//2016 Java C 3
public class SquareWeirdCircle {
	public static void main(String[] args) {
		int max=0,temp=0,a=123;
		while (true) {
			temp = 0;
			while (a>0) {
				temp = temp+(a%10)*(a%10);
				a = a/10;
			}
			if(temp==max){
				System.out.println(max);
				break;
			}else{
				if(max<temp){
					max = temp;
					a = temp;
				}else{
					a = temp;
				}
			}
		}
	}

}