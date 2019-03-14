import java.util.HashSet;

//2015 Java C 6
public class WonderfulNum {
	public static void main(String[] args) {
		for(int i=0; i<100; i++){
			int ii = i*i;
			int iii = i*i*i;
			String all = String.valueOf(ii)+String.valueOf(iii);
			if(all.length()!=10)continue;
			HashSet<String> list = new HashSet<String>();
			for(int n=0; n<all.length(); n++){
				if(!list.add(all.charAt(n)+"")){
					list.clear();
					break;
				}else if (n==all.length()-1) {
					System.out.println(all);
					System.out.println(i);
					break;
				}
			}
		}
	}

}
