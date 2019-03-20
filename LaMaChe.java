import java.util.ArrayList;
import java.util.Scanner;


public class LaMaChe {
	static ArrayList<Character> a = new ArrayList<Character>();
	static ArrayList<Character> b = new ArrayList<Character>();
	static ArrayList<Character> ing = new ArrayList<Character>();
	static int cont = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ina = sc.next();
		String inb = sc.next();
		sc.close();
		for(char cha : ina.toCharArray()){
			a.add(cha);
		}
		for(char cha : inb.toCharArray()){
			b.add(cha);
		}
		Boolean flag = true;
		boolean afirst = true;
		while(flag){
			if(afirst){//A出牌
				cont++;
				ing.add(a.get(0));
				a.remove(0);
				//A没有赢牌
				if(ing.indexOf(ing.get(ing.size()-1))==ing.lastIndexOf(ing.get(ing.size()-1))){
					afirst = false;
					if(a.size()==0)flag=false;
				}else{//A有赢牌
					int j = ing.indexOf(ing.get(ing.size()-1));
					for(int i=ing.size()-1; i>=j; i--){
						a.add(ing.get(i));
						ing.remove(i);
					}
				}
			}
//			else if (cont>1000) {
//				System.out.println(-1);
//				return;
//			}
			else{//B出牌
				cont++;
				ing.add(b.get(0));
				b.remove(0);
				//B没有赢牌
				if(ing.indexOf(ing.get(ing.size()-1))==ing.lastIndexOf(ing.get(ing.size()-1))){
					afirst = true;
					if(b.size()==0)flag=false;
				}else{//B有赢牌
					int j = ing.indexOf(ing.get(ing.size()-1));
					for(int i=ing.size()-1; i>=j; i--){
						b.add(ing.get(i));
						ing.remove(i);
					}
				}
			}
		}
		if(afirst){
			for(int i=0; i<a.size()-1; i++){
				System.out.print(a.get(i)-1);
			}
			System.out.println(a.get(a.size()-1));
		}else{
			for(int i=0; i<b.size()-1; i++){
				System.out.print(b.get(i));
			}
			System.out.println(b.get(b.size()-1));
		}
	}
	

}
