//2016 Java C 1
public class PrizeGuess {
	public static void main(String[] args) {
		int sum = 777;
		String str = "vxvxvxvxvxvxvvx";
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='v'){
				sum = sum*2;
			}else if (str.charAt(i)=='x') {
				sum = sum-555;
			}else if (sum<=0){
				System.out.println("电子币用完了");
				System.exit(0);
			}
		}
		System.out.println(sum);
	}

}
