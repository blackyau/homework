public class LiBaiDrink {
	public static int sum = 0;
	public static int a(int shop, int flower, int wine) {
		if(shop > 0)
			a(shop-1, flower, wine*2);
		if(flower > 0)
			a(shop, flower-1, wine-1);
		if(shop==0 && flower==1 && wine==1)
			sum++;
		return 0;
	}
	public static void main(String[] args) {
		a(5, 10, 2);
		System.out.println(sum);
	}
}
