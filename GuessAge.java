import java.util.HashSet;

//2013 Java C 1
public class GuessAge {
	public static void main(String[] args) {
		int a,b;
		for(int i=0; i<=100; i++){
			if(i*i*i>=1000 && i*i*i<=9999){
				a=i*i*i;
				if(i*i*i*i>=100000 && i*i*i*i<=999999){
					b=i*i*i*i;
					String stra = String.valueOf(a);
					String strb = String.valueOf(b);
					HashSet<Character> list = new HashSet<Character>();
					for(int c=0; c<=stra.length(); c++){
						if(!list.add(stra.charAt(c))){
							break;
						}else{
							for(int d=0; c<=strb.length(); d++){
								if(!list.add(strb.charAt(d))){
									break;
								}else{
									System.out.println(i);
									System.exit(0);
								}
							}
						}
					}
				}
			}
			
		}
	}

}
