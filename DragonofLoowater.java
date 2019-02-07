import java.util.Arrays;
import java.util.Scanner;


public class DragonofLoowater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0){
				break;
			}else{
				int[] dragon = new int[n];
				int[] hero = new int[m];
				sc.nextLine();
				for(int i=0; i<n; i++) {
					dragon[i]  = sc.nextInt();
				}
				for(int i=0; i<m; i++){
					hero[i] = sc.nextInt();
				}
				Arrays.sort(hero);
				Arrays.sort(dragon);
				int money = 0;
				int HeroIndex=0;
				boolean flag = true;
				for(int DragonIndex=0; DragonIndex<n; DragonIndex++){
					while(HeroIndex<m && hero[HeroIndex] < dragon[DragonIndex]){
						HeroIndex++;
					}
					if(HeroIndex >= m){
						System.out.println("Loowater is doomed!");
						flag = false;
						break;
					}else{
						money += hero[HeroIndex];
						HeroIndex++;
					}
				}
				if(flag==true){
					System.out.println(money);
				}else{
					continue;
				}
			}
		}
		sc.close();
	}
}
