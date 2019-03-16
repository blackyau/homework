//2016 Java C 6
import java.util.HashSet;
public class MergeFormula {

	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<Integer>();
		int def=0,ghi=0,sum=0;
		for(int a=1; a<10; a++){
		for(int b=1; b<10; b++){
		for(int c=1; c<10; c++){
		for(int d=1; d<10; d++){
		for(int e=1; e<10; e++){
		for(int f=1; f<10; f++){
		for(int g=1; g<10; g++){
		for(int h=1; h<10; h++){
		for(int i=1; i<10; i++){
			if(!list.add(a)||!list.add(b)||!list.add(c)||!list.add(d)||!list.add(e)||!list.add(f)||!list.add(g)||!list.add(h)||!list.add(i)){
				list.clear();
			}else{
				def = f+e*10+d*100;
				ghi = i+h*10+g*100;
				if((def*c+b*ghi)%(ghi*c)==0 && a+(def*c+b*ghi)/(ghi*c)==10)sum++;
			}
		}}}}}}}}}
		System.out.println(sum);
	}

}
