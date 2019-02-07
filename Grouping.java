import java.util.Scanner;


public class Grouping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int peopleNum = sc.nextInt();
		int d=8;
		int groupNum = peopleNum / 8;
		if(peopleNum%d>0){
			groupNum +=1;
		}
		int a = peopleNum / groupNum;  //分组后人数
		int r = peopleNum % groupNum;
		for(int i=0; i<groupNum; i++){
			if(i<r){
				System.out.println(a+1);
			}else{
				System.out.println(a);
				}
			}
	}
}