import java.util.HashSet;

//2016 Java C 7
public class BuildingBlocks {
	public static void main(String[] args) {
		int d=0,n=0;
		for(int a1=9; a1>0; a1--){
		for(int a2=9; a2>0; a2--){
		for(int a3=9; a3>0; a3--){
		for(int a4=9; a4>0; a4--){
		for(int b1=9; b1>0; b1--){
		for(int b2=9; b2>0; b2--){
		for(int b3=9; b3>0; b3--){
		for(int c1=9; c1>0; c1--){
		for(int c2=9; c2>0; c2--){
			HashSet<Integer> list = new HashSet<Integer>();
				if(!list.add(a1)||!list.add(a2)||!list.add(a3)||!list.add(a4)||!list.add(b1)||!list.add(b2)||!list.add(b3)||!list.add(c1)||!list.add(c2)){
					list.clear();
					continue;
				}else{
					if(a1>b1 && a2>b1 && a2>b2 && a3>b2 && a3>b3 && a4>b3 && b1>c1 && b2>c1 && b2>c2 && b3>c2){
						if(c1>d && c2>d){
							n++;
						}
					}
				}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		System.out.println(n);
	}

}
