# 算法作业

自己方便查阅同时熟悉Git的操作

UVaOJ blackyau [https://uhunt.onlinejudge.org/id/1015260](https://uhunt.onlinejudge.org/id/1015260)

Virtual Judge [https://vjudge.net/status#un=BlackYau](https://vjudge.net/status#un=BlackYau)

## 备忘录

- 最长公共子序列
- 八皇后问题
- dp

## 最大公共子串

蓝桥杯 2016 Java C 6

最大公共子串就是求两个串的所有子串中能够匹配上的最大长度是多少。

比如："```abcdkkk```" 和 "```baabcdadabc```"，

可以找到的最长的公共子串是"abcd",所以最大公共子串长度为4。

下面的程序是采用矩阵法进行求解的，这对串的规模不大的情况还是比较有效的解法。

请分析该解法的思路，并补全划线部分缺失的代码。

```java
public class A
{
	static int f(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int[][] a = new int[c1.length+1][c2.length+1];
		
		int max = 0;
		for(int i=1; i<a.length; i++){
			for(int j=1; j<a[i].length; j++){
				if(c1[i-1]==c2[j-1]) {
					a[i][j] = _______________________ ; //填空 
					if(a[i][j] > max) max = a[i][j];
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args){
		int n = f("abcdkkk", "baabcdadabc");
		System.out.println(n);
	}
}
```

> 检测到相等的话，就和上一位进行比较。如果上一位也相等就1+1,如果上一位不相等就0+1。看答案看来的，这三道题做的我怀疑人生。

完整代码:[https://github.com/blackyau/homework/blob/master/MaxPublicSubstring.java](https://github.com/blackyau/homework/blob/master/MaxPublicSubstring.java)

## 杨辉三角

蓝桥杯 2016 Java C 5

杨辉三角也叫帕斯卡三角，在很多数量关系中可以看到，十分重要。

```
第0行：           1
第1行：          1 1
第2行：         1 2 1
第3行：        1 3 3 1
第4行：       1 4 6 4 1
....
```

两边的元素都是1， 中间的元素是左上角的元素与右上角的元素和。

我们约定，行号，列号都从0计数。

所以： 第6行的第2个元素是15，第3个元素是20

直观地看，需要开辟一个二维数组，其实一维数组也可以胜任。

如下程序就是用一维数组“腾挪”的解法。

```java
public class A
{
	// 杨辉三角形的第row行第col列
	static long f(int row, int col){
		if(row<2) return 1;
		if(col==0) return 1;
		if(col==row) return 1;
		
		long[] a = new long[row+1];
		a[0]=1;
		a[1]=1;
		
		int p = 2;
		
		while(p<=row){
			a[p] = 1;
			for( __________________ ) a[q] = a[q] + a[q-1];
			p++;
		}
		
		return a[col];
	}
	
	public static void main(String[] args){
		System.out.println(f(6,2));
		System.out.println(f(6,3));		
	}
}
```

> 这个做的我有点自闭，直接看答案了..

完整代码:[https://github.com/blackyau/homework/blob/master/YangHuiTriangle.java](https://github.com/blackyau/homework/blob/master/YangHuiTriangle.java)

## 承压计算

蓝桥杯 2016 Java C 4

X星球的高科技实验室中整齐地堆放着某批珍贵金属原料。

每块金属原料的外形、尺寸完全一致，但重量不同。
金属材料被严格地堆放成金字塔形。

```
                             7 
                            5 8 
                           7 8 8 
                          9 2 7 2 
                         8 1 4 9 1 
                        8 1 8 8 4 1 
                       7 9 6 1 4 5 4 
                      5 6 5 5 6 9 5 6 
                     5 5 4 7 9 3 5 5 1 
                    7 5 7 9 7 4 7 3 3 1 
                   4 6 4 5 5 8 8 3 2 4 3 
                  1 1 3 3 1 6 6 5 5 4 4 2 
                 9 9 9 2 1 9 1 9 2 9 5 7 9 
                4 3 3 7 7 9 3 6 1 3 8 8 3 7 
               3 6 8 1 5 3 9 5 8 3 8 1 8 3 3 
              8 3 2 3 3 5 5 8 5 4 2 8 6 7 6 9 
             8 1 8 1 8 4 6 2 2 1 7 9 4 2 3 3 4 
            2 8 4 2 2 9 9 2 8 3 4 9 6 3 9 4 6 9 
           7 9 7 4 9 7 6 6 2 8 9 4 1 8 1 7 2 1 6 
          9 2 8 6 4 2 7 9 5 4 1 2 5 1 7 3 9 8 3 3 
         5 2 1 6 7 9 3 2 8 9 5 5 6 6 6 2 1 8 7 9 9 
        6 7 1 8 8 7 5 3 6 5 4 7 3 4 6 7 8 1 3 2 7 4 
       2 2 6 3 5 3 4 9 2 4 5 7 6 6 3 2 7 2 4 8 5 5 4 
      7 4 4 5 8 3 3 8 1 8 6 3 2 1 6 2 6 4 6 3 8 2 9 6 
     1 2 4 1 3 3 5 3 4 9 6 3 8 6 5 9 1 5 3 2 6 8 8 5 3 
    2 2 7 9 3 3 2 8 6 9 8 4 4 9 5 8 2 6 3 4 8 4 9 3 8 8 
   7 7 7 9 7 5 2 7 9 2 5 1 9 2 6 5 3 9 3 5 7 3 5 4 2 8 9 
  7 7 6 6 8 7 5 5 8 2 4 7 7 4 7 2 6 9 2 1 8 2 9 8 5 7 3 6 
 5 9 4 5 5 7 5 5 6 3 5 3 9 5 8 9 5 4 1 2 6 1 4 3 5 3 2 4 1 
X X X X X X X X X X X X X X X X X X X X X X X X X X X X X X 
```

其中的数字代表金属块的重量（计量单位较大）。

最下一层的X代表30台极高精度的电子秤。

假设每块原料的重量都十分精确地平均落在下方的两个金属块上，最后，所有的金属块的重量都严格精确地平分落在最底层的电子秤上。

电子秤的计量单位很小，所以显示的数字很大。

工作人员发现，其中读数最小的电子秤的示数为：```2086458231```

请你推算出：读数最大的电子秤的示数为多少？

注意：需要提交的是一个整数，不要填写任何多余的内容。

笨笨有话说：

不断的除2，加到下面，除2,加到下面,.... 不会浮点精度溢出吧？

歪歪有话说：

怕除不开还不好办， 把每个数字扩大一定的倍数不就好了。

> 这个题重量的分配没有捋清楚，晚点再解决。

完整代码:[https://github.com/blackyau/homework/blob/master/Pressure.java](https://github.com/blackyau/homework/blob/master/Pressure.java)

## 寒假作业

蓝桥杯 2016 C C 7

现在小学的数学题目也不是那么好玩的。
看看这个寒假作业：
```
□ + □ = □
□ - □ = □
□ × □ = □
□ ÷ □ = □
```

每个方块代表1~13中的某一个数字，但不能重复。
比如：
```
6  + 7 = 13
9  - 8 = 1
3  * 4 = 12
10 / 2 = 5
```
以及： 
```
 7  + 6 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5
```
就算两种解法。（加法，乘法交换律后算不同的方案）
 
你一共找到了多少种方案？

请填写表示方案数目的整数。

> 递归回溯全排列真香

完整代码:[https://github.com/blackyau/homework/blob/master/WinterVacation.java](https://github.com/blackyau/homework/blob/master/WinterVacation.java)

## 纸牌三角形

蓝桥杯 2017 Java C 3

```A,2,3,4,5,6,7,8,9``` 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。

下图就是一种排法（如有对齐问题，参看p1.png(没有)）。
```
      A
     9 6
    4   8
   3 7 5 2
```
这样的排法可能会有很多。

如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

请你计算并提交该数字。

注意：需要提交的是一个整数，不要提交任何多余内容。

笨笨有话说：

感觉可以暴力破解哦。

麻烦的是，对每个排法还要算出它的旋转、镜像排法，看看有没有和历史重复。

歪歪有话说：

人家又不让你把所有情况都打印出来，只是要算种类数。

对于每个基本局面，通过旋转、镜像能造出来的新局面数目不是固定的吗？

> 还是用的之前的 递归回溯全排列 真好用，不过最后的/3/2去掉旋转的和镜像的。逻辑还是有点没捋清。

完整代码:[https://github.com/blackyau/homework/blob/master/SolitaireTriangle.java](https://github.com/blackyau/homework/blob/master/SolitaireTriangle.java)

## 兴趣小组

蓝桥杯 2017 Java C 2

为丰富同学们的业余文化生活，某高校学生会创办了3个兴趣小组

（以下称A组，B组，C组）。

每个小组的学生名单分别在[【A.txt】](https://st.blackyau.net/share/LanQiao/A.txt),[【B.txt】](https://st.blackyau.net/share/LanQiao/B.txt)和[【C.txt】](https://st.blackyau.net/share/LanQiao/C.txt)中。

每个文件中存储的是学生的学号。

由于工作需要，我们现在想知道：

既参加了A组，又参加了B组，但是没有参加C组的同学一共有多少人？

请你统计该数字并通过浏览器提交答案。

注意：答案是一个整数，不要提交任何多余的内容。

笨笨有话说：

哇塞！数字好多啊！一眼望过去就能发现相同的，好像没什么指望。

不过，可以排序啊，要是每个文件都是有序的，那就好多了。

歪歪有话说：

排什么序啊，这么几行数字对计算机不是太轻松了吗？

我看着需求怎么和中学学过的集合很像啊.....

> 不知道 ```Java``` 怎么读取文件的，蓝桥杯不会有文件操作的题，因为答案都是通过浏览器提交嘛，就懒得去看了。这里有一些数据是 ```0``` 开始的，我就手动把前面带 ```0``` 的数据前面的 ```0``` 都删掉了。其他的没什么可说的。

完整代码:[https://github.com/blackyau/homework/blob/master/InterestGroup.java](https://github.com/blackyau/homework/blob/master/InterestGroup.java)

## 外星日历

蓝桥杯 2017 Java C 1

某星系深处发现了文明遗迹。

他们的计数也是用十进制。

他们的文明也有日历。日历只有天数，没有年、月的概念。

有趣的是，他们也使用了类似“星期”的概念，

只不过他们的一个星期包含了 ```9``` 天，

为了方便，这里分别记为: ```A,B,C....H,I```

从一些资料上看到，

他们的 ```23``` 日是星期 ```E```

他们的 ```190``` 日是星期 ```A```

他们的 ```343251``` 日是星期 ```I```


令人兴奋的是，他们居然也预见了“世界末日”的那天，当然是一个很大很大的数字

```651764141421415346185```

请你计算一下，这遥远的一天是该文明的星期几？

你需要提交的是一个大写字母，表示该文明的星期几，不要填写任何多余的内容。

> 感觉这个题用计算器算会来的比较快，通过 ```190``` 是星期 ```A``` 可以推出。一个数除以 ```9``` 如果余数为 ```1``` 那么就是星期 ```A``` 以此类推。

完整代码:[https://github.com/blackyau/homework/blob/master/AlienCalendar.java](https://github.com/blackyau/homework/blob/master/AlienCalendar.java)

## 四平方和

蓝桥杯 2016 Java C 8

四平方和定理，又称为拉格朗日定理：
每个正整数都可以表示为至多4个正整数的平方和。
如果把0包括进去，就正好可以表示为4个数的平方和。

比如：

```
5 = 0^2 + 0^2 + 1^2 + 2^2
7 = 1^2 + 1^2 + 1^2 + 2^2
```

（^符号表示乘方的意思）

对于一个给定的正整数，可能存在多种平方和的表示法。

要求你对4个数排序：

```0 <= a <= b <= c <= d```

并对所有的可能表示法按 ```a,b,c,d``` 为联合主键升序排列，最后输出第一个表示法


程序输入为一个正整数```N (N<5000000)```

要求输出4个非负整数，按从小到大排序，中间用空格分开

例如，输入：

```5```

则程序应该输出：

```0 0 1 2```

再例如，输入：

```12```

则程序应该输出：

```0 2 2 2```

再例如，输入：

```773535```

则程序应该输出：

```1 1 267 838```

> 先计算后了后两位的平方和把 ```c``` 作为 ```key```缓存起来，然后再在直接开方 ```d```就可以出结果了。极大的降低了运算开销。

完整代码:[https://github.com/blackyau/homework/blob/master/SquareSum.java](https://github.com/blackyau/homework/blob/master/SquareSum.java)

## 冰雹数

蓝桥杯 2016 Java C 7

任意给定一个正整数N，

如果是偶数，执行： ```N / 2```

如果是奇数，执行： ```N * 3 + 1```

生成的新的数字再执行同样的动作，循环往复。

通过观察发现，这个数字会一会儿上升到很高，一会儿又降落下来。就这样起起落落的，但最终必会落到“1”，这有点像小冰雹粒子在冰雹云中翻滚增长的样子。

比如 ```N=9```

```9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1```

可以看到，```N=9``` 的时候，这个“小冰雹”最高冲到了 ```52``` 这个高度。

输入格式：

一个正整数 ```N（N<1000000）```

输出格式：

一个正整数，表示不大于N的数字，经过冰雹数变换过程中，最高冲到了多少。

例如，输入：

```
10
```

程序应该输出：

```
52
```

再例如，输入：

```
100
```

程序应该输出：

```
9232
```

> 认真读题的重要性，实现倒是不难。我一开始是用数组储存的每一个结果，因为读题有问题 输入输出 对不上，看了看答案都是只保存大的哪一个数就行了。这样做效率会高一些。

完整代码:[https://github.com/blackyau/homework/blob/master/HailNum.java](https://github.com/blackyau/homework/blob/master/HailNum.java)

## 凑算式

蓝桥杯 2016 Java C 6

```
     B      DEF
A + --- + ------- = 10
     C      GHI
```

这个算式中A-I代表1~9的数字，不同的字母代表不同的数字。

比如：
- 6+8/3+952/714 就是一种解法，
- 5+3/1+972/486 是另一种解法。

这个算式一共有多少种解法？

注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。

> 这个题我用了两种写法，第一种是暴力穷举每一位，第二种是使用 递归回溯生成全排列  。第二种方式是个适用于无重复元素的情况，就当个公式用了。对这个理解不是很深，就只有暂时这样了。

穷举每一位:[https://github.com/blackyau/homework/blob/master/MergeFormula.java](https://github.com/blackyau/homework/blob/master/MergeFormula.java)

递归回溯全排列:[https://github.com/blackyau/homework/blob/master/MergeFormula2.java](https://github.com/blackyau/homework/blob/master/MergeFormula2.java)

## 分小组

蓝桥杯 2016 Java C 5

9名运动员参加比赛，需要分3组进行预赛。
有哪些分组的方案呢？

我们标记运动员为 A,B,C,... I
下面的程序列出了所有的分组方法。

该程序的正常输出为：

```
ABC DEF GHI
ABC DEG FHI
ABC DEH FGI
ABC DEI FGH
ABC DFG EHI
..... (以下省略，总共560行)
```

```java
public class A
{
	public static String remain(int[] a)
	{
		String s = "";
		for(int i=0; i<a.length; i++){
			if(a[i] == 0) s += (char)(i+'A');
		}	
		return s;
	}
	
	public static void f(String s, int[] a)
	{
		for(int i=0; i<a.length; i++){
			if(a[i]==1) continue;
			a[i] = 1;
			for(int j=i+1; j<a.length; j++){
				if(a[j]==1) continue;
				a[j]=1;
				for(int k=j+1; k<a.length; k++){
					if(a[k]==1) continue;
					a[k]=1;
					System.out.println(__________________________________);  //填空位置
					a[k]=0;
				}
				a[j]=0;
			}
			a[i] = 0;
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = new int[9];		
		a[0] = 1;
		
		for(int b=1; b<a.length; b++){
			a[b] = 1;
			for(int c=b+1; c<a.length; c++){
				a[c] = 1;
				String s = "A" + (char)(b+'A') + (char)(c+'A');
				f(s,a);
				a[c] = 0;
			}
			a[b] = 0;
		}
	}
}
```

> 用 ```Debug``` 看变量猜，第1组数据就是被传进 ```f()``` 的 ```String s``` ，第2组数据就是三个 ```for``` 循环的变量 直接仿造 ```main``` 的方法把它打印出来，第3组数据是最顶上没有被用过的 ```remain()``` 因为它传入的数据是数组，直接就把数组传进去就行了。 赞美 ```Debug``` 

完整代码:[https://github.com/blackyau/homework/blob/master/Grouping2.java](https://github.com/blackyau/homework/blob/master/Grouping2.java)

## 骰子游戏

蓝桥杯 2016 Java C 4

我们来玩一个游戏。

同时掷出3个普通骰子（6个面上的数字分别是1~6）。

如果其中一个骰子上的数字等于另外两个的和，你就赢了。

下面的程序计算出你能获胜的精确概率（以既约分数表示）

```java
public class Main
{
	public static int gcd(int a, int b)
	{
		if(b==0) return a;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args)
	{	
		int n = 0;
		for(int i=0; i<6; i++)
		for(int j=0; j<6; j++)
		for(int k=0; k<6; k++){
			if(______________) n++;   //填空位置
		}
		
		int m = gcd(n,6*6*6);
		System.out.println(n/m + "/" + 6*6*6/m);
	}
}
```
> 一看上面三个 ```for``` 就膨胀了，直接写了一个相等就去看答案了。这里应该要写三个相等用 ```||``` 连接，而且数字都要 ```+1``` 。因为这里 ```for``` 的数字是 ```0-5``` 和骰子的 ```1-6``` 完全不一样。

完整代码:[https://github.com/blackyau/homework/blob/master/Dice.java](https://github.com/blackyau/homework/blob/master/Dice.java)

## 平方怪圈

蓝桥杯 2016 Java C 3

如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。对新产生的正整数再做同样的处理。

如此一来，你会发现，不管开始取的是什么数字，最终如果不是落入1，就是落入同一个循环圈。

请写出这个循环圈中最大的那个数字。

> 和以前做过的 [UVa 10591 Happy Number 快乐数](https://github.com/blackyau/homework#uva-10591-happy-number-%E5%BF%AB%E4%B9%90%E6%95%B0) 很相似，快乐数的算法又忘了做了半天才做完。这个题并不需要把每个数都存起来，上次运行的结果和这次运行的结果进行比较。每次都留其中最大的一个就行了，毕竟题目都说了这是个循环圈。

完整代码:[https://github.com/blackyau/homework/blob/master/SquareWeirdCircle.java](https://github.com/blackyau/homework/blob/master/SquareWeirdCircle.java)

## 煤球数目

蓝桥杯 2016 Java C 2

有一堆煤球，堆成三角棱锥形。具体：

- 第一层放1个

- 第二层3个（排列成三角形）

- 第三层6个（排列成三角形）

- 第四层10个（排列成三角形）
....

如果一共有100层，共有多少个煤球？

> 我一开始是用的等差数列来算的，算出来的结果其实是最后一层的个数。应该把每一层算出来的数字再全部加起来才行。

完整代码:[https://github.com/blackyau/homework/blob/master/Briquettes.java](https://github.com/blackyau/homework/blob/master/Briquettes.java)

## 有奖猜谜

蓝桥杯 2016 Java C 1

小明很喜欢猜谜语。

最近，他被邀请参加了X星球的猜谜活动。

每位选手开始的时候都被发给 ```777``` 个电子币。

规则是：

1. 猜对了，手里的电子币数目翻倍，

2. 猜错了，扣除555个电子币, 扣完为止。

小明一共猜了 ```15``` 条谜语。

战果为：```vxvxvxvxvxvxvvx```

其中 ```v``` 表示猜对了，```x``` 表示猜错了。

请你计算一下，小明最后手里的电子币数目是多少。

> 没啥可说的

完整代码:[https://github.com/blackyau/homework/blob/master/PrizeGuess.java](https://github.com/blackyau/homework/blob/master/PrizeGuess.java)

## 打印大X

蓝桥杯 2015 Java C 9

小明希望用星号拼凑，打印出一个大X，他要求能够控制笔画的宽度和整个字的高度。
为了便于比对空格，所有的空白位置都以句点符来代替。

要求输入两个整数m n，表示笔的宽度，X的高度。用空格分开(```0<m<n```, ```3<n<1000```, 保证n是奇数)
要求输出一个大X

例如，用户输入：

```
3 9
```

程序应该输出：


    ***.....***
    .***...***.
    ..***.***..
    ...*****...
    ....***....
    ...*****...
    ..***.***..
    .***...***.
    ***.....***


再例如，用户输入：

```
4 21
```

程序应该输出


    ****................****
    .****..............****.
    ..****............****..
    ...****..........****...
    ....****........****....
    .....****......****.....
    ......****....****......
    .......****..****.......
    ........********........
    .........******.........
    ..........****..........
    .........******.........
    ........********........
    .......****..****.......
    ......****....****......
    .....****......****.....
    ....****........****....
    ...****..........****...
    ..****............****..
    .****..............****.
    ****................****


> 先开一个二维数组，先画左上角到右下角,再画右上角到左下角。利用了每一列的变化做到了递增的「留空」，中间重叠的部分也不用管。

完整代码:[https://github.com/blackyau/homework/blob/master/PrintX.java](https://github.com/blackyau/homework/blob/master/PrintX.java)

## 移动距离

蓝桥杯 2015 Java C 8

X星球居民小区的楼房全是一样的，并且按矩阵样式排列。其楼房的编号为```1,2,3...```
当排满一行时，从下一行相邻的楼往反方向排号。
比如：当小区排号宽度为6时，开始情形如下：

```
1  2  3  4  5  6
12 11 10 9  8  7
13 14 15 .....
```

我们的问题是：已知了两个楼号m和n，需要求出它们之间的最短移动距离（不能斜线方向移动）

输出为3个整数w m n，空格分开，都在1到10000范围内
要求输出一个整数，表示m n 两楼间最短移动距离。

例如：
用户输入：

```
6 8 2
```

则，程序应该输出：

```
4
```

再例如：
用户输入：

```
4 7 20
```

则，程序应该输出：

```
5
```

> 一开始还以为要用二维数组来做，突然一下想到了可以旁段行号的奇偶性，就可以知道它的数字是从什么方向变化而来的了。

完整代码:[https://github.com/blackyau/homework/blob/master/MoveLength.java](https://github.com/blackyau/homework/blob/master/MoveLength.java)

## 加法变乘法

蓝桥杯 2015 Java C 7

我们都知道：```1+2+3+ ... + 49 = 1225```
现在要求你把其中两个不相邻的加号变成乘号，使得结果为 ```2015```

比如：

```1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015```

就是符合要求的答案。

请你寻找另外一个可能的答案，并把位置靠前的那个乘号左边的数字提交（对于示例，就是提交```10```）。

> 单独写了个方法传入两个数字用来验证是否管用，然后用两个 ```for``` 直接都遍历一次。就是要注意一下下标越界。
 
完整代码:[https://github.com/blackyau/homework/blob/master/AddToMul.java](https://github.com/blackyau/homework/blob/master/AddToMul.java)

## 奇妙的数字

蓝桥杯 2015 Java C 6

小明发现了一个奇妙的数字。它的平方和立方正好把0~9的10个数字每个用且只用了一次。

你能猜出这个数字是多少吗？

> 暴力就完事儿了，```Hashset``` 的应用，还有 ```chat``` 转 ```string``` 。

完整代码:[https://github.com/blackyau/homework/blob/master/WonderfulNum.java](https://github.com/blackyau/homework/blob/master/WonderfulNum.java)

## 格子中输出

蓝桥杯 2015 Java C 5

```stringInGrid``` 方法会在一个指定大小的格子中打印指定的字符串。

要求字符串在水平、垂直两个方向上都居中。

如果字符串太长，就截断。

如果不能恰好居中，可以稍稍偏左或者偏上一点。

下面的程序实现这个逻辑，请填写划线部分缺少的代码。

```java
	public static void stringInGrid(int width, int height, String s)
	{
		if(s.length()>width-2) s = s.substring(0,width-2);
		System.out.print("+");
		for(int i=0;i<width-2;i++) System.out.print("-");
		System.out.println("+");
		
		for(int k=1; k<(height-1)/2;k++){
			System.out.print("|");
			for(int i=0;i<width-2;i++) System.out.print(" ");
			System.out.println("|");
		}
		
		System.out.print("|");
		
		String ff = ____________;  //填空
		System.out.print(String.format(ff,"",s,""));
		          
		System.out.println("|");
		
		for(int k=(height-1)/2+1; k<height-1; k++){
			System.out.print("|");
			for(int i=0;i<width-2;i++) System.out.print(" ");
			System.out.println("|");
		}	
		
		System.out.print("+");
		for(int i=0;i<width-2;i++) System.out.print("-");
		System.out.println("+");	
	}
```

对于题目中数据，应该输出：

```
+------------------+
|                  |
|     abcd1234     |
|                  |
|                  |
+------------------+
```

> 这题做的，真是吃大亏。我平时很少用 ```format``` 完全不知道这个是用来输出 ```%s``` 这种的。如果知道这个的话，计算空格的数量也就是小问题了。 ```s``` 前面几个数字就输出几个。

完整代码:[https://github.com/blackyau/homework/blob/master/LatticeOutput.java](https://github.com/blackyau/homework/blob/master/LatticeOutput.java)

## 循环节长度

蓝桥杯 2015 Java C 4

两个整数做除法，有时会产生循环小数，其循环部分称为：循环节。
比如，```11/13=6=>0.846153846153.....```  其循环节为 ```846153``` 共有```6```位。
下面的方法，可以求出循环节的长度。

请仔细阅读代码，并填写划线部分缺少的代码。

```java
	public static int f(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();
		
		for(;;)
		{
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0)  ________ ;  //填空
		}
	}
```

注意，只能填写缺少的部分，不要重复抄写已有代码。不要填写任何多余的文字。

> 用 Debug 简单的猜测了一下，应该填 ```V``` 这个数组的 ```length ``` 也就是 ```n.size()``` 但是这个地方有个很大的陷阱，有部分数字循环节并不是从第一位开始的。所以就需要用 ```size() - indexOf(n)``` 很大的坑。在自己演算的时候，能够想到这种数据应该不太容易。

完整代码:[https://github.com/blackyau/homework/blob/master/CycleLength.java](https://github.com/blackyau/homework/blob/master/CycleLength.java)

## 无穷分数

蓝桥杯 2015 Java C 3

无穷的分数，有时会趋向于固定的数字。
请计算【图1.jpg】所示的无穷分数，要求四舍五入，精确到小数点后5位，小数位不足的补0。

![图1](https://i.loli.net/2019/03/14/5c892b1c86519.jpg)

请填写该浮点数，不能填写任何多余的内容。

> 因为浮点数精度不够，所以就使用了 ```BigDecimal``` 来做，用逆推的方式求出结果。尝试循环的次数大于 ```8``` 数字就为固定的 ```0.58198``` 了。

完整代码:[https://github.com/blackyau/homework/blob/master/InfiniteScore.java](https://github.com/blackyau/homework/blob/master/InfiniteScore.java)

## 立方尾不变

蓝桥杯 2015 Java C 2

有些数字的立方的末尾正好是该数字本身。
比如：```1,4,5,6,9,24,25,....```

请你计算一下，在 ```10000``` 以内的数字中（指该数字，并非它立方后的数值），符合这个特征的正整数一共有多少个。

请提交该整数，不要填写任何多余的内容。

> 执着于使用数学的方式去求余然后比对，这里直接转成 ```String``` 然后用 ```endsWith``` 要方便很多。

完整代码:[https://github.com/blackyau/homework/blob/master/CubeEnd.java](https://github.com/blackyau/homework/blob/master/CubeEnd.java)

## 隔行变色

蓝桥杯 2015 Java C 1

Excel表的格子很多，为了避免把某行的数据和相邻行混淆，可以采用隔行变色的样式。
小明设计的样式为：第1行蓝色，第2行白色，第3行蓝色，第4行白色，....
现在小明想知道，从第21行到第50行一共包含了多少个蓝色的行。

> 一句话解释：21~50之间有多少个奇数

完整代码:[https://github.com/blackyau/homework/blob/master/Discoloration.java](https://github.com/blackyau/homework/blob/master/Discoloration.java)

## 搭积木

蓝桥杯 2016 Java C 7

小明最近喜欢搭数字积木，
一共有10块积木，每个积木上有一个数字，0~9。

搭积木规则：
每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
最后搭成4层的金字塔形，必须用完所有的积木。

下面是两种合格的搭法：

```
   0
  1 2
 3 4 5
6 7 8 9
```

```
   0
  3 1
 7 5 2
9 8 6 4    
```

请你计算这样的搭法一共有多少种？

请填表示总数目的数字。

注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。

> 暴力就完事儿了，就是代码运行时间要66.45秒。写这个代码也是遇到了蛮多问题，本来想尽可能的减少计算规模。其实花了更多不必要的时间。用 递归回溯重排列 重写了一遍，能0.06秒瞬间出结果了。

暴力:[https://github.com/blackyau/homework/blob/master/BuildingBlocks.java](https://github.com/blackyau/homework/blob/master/BuildingBlocks.java)

递归回溯重排列:[https://github.com/blackyau/homework/blob/master/BuildingBlocks2.java](https://github.com/blackyau/homework/blob/master/BuildingBlocks2.java)

## 奇怪的分式

蓝桥杯 2014 Java C 7

上小学的时候，小明经常自己发明新算法。一次，老师出的题目是：

1/4 乘以 8/5 

小明居然把分子拼接在一起，分母拼接在一起，答案是：18/45 （参见图1.png）

![图1](https://i.loli.net/2019/03/13/5c87e994b6823.jpg)

老师刚想批评他，转念一想，这个答案凑巧也对啊，真是见鬼！

对于分子、分母都是 1~9 中的一位数的情况，还有哪些算式可以这样计算呢？

请写出所有不同算式的个数（包括题中举例的）。

显然，交换分子分母后，例如：4/1 乘以 5/8 是满足要求的，这算做不同的算式。

但对于分子分母相同的情况，2/2 乘以 3/3 这样的类型太多了，不在计数之列!

注意：答案是个整数（考虑对称性，肯定是偶数）。请通过浏览器提交。不要书写多余的内容。

> 一开始我也用的除法来对比，因为精度问题没法处理好 ```if``` 。最后还是单纯的计算两个数字是否一样就行了，十位上面的数就乘以 10 模拟相等就可以避免除法了。
 
完整代码:[https://github.com/blackyau/homework/blob/master/StrangeFraction.java](https://github.com/blackyau/homework/blob/master/StrangeFraction.java)

## 写日志

蓝桥杯 2014 Java C 5

写日志是程序的常见任务。现在要求在 t1.log, t2.log, t3.log 三个文件间轮流写入日志。也就是说第一次写入t1.log，第二次写入t2.log，... 第四次仍然写入t1.log，如此反复。

下面的代码模拟了这种轮流写入不同日志文件的逻辑。

```java
public class A
{
	private static int n = 1;
	
	public static void write(String msg)
	{
		String filename = "t" + n + ".log";
		n = ____________;
		System.out.println("write to file: " + filename + " " + msg);
	}
}
```
请填写划线部分缺失的代码。通过浏览器提交答案。

> 我的天这个太微妙了 ```n = n%3+1;``` ，因为分母太小了所以没法除那么余数就是它本身。再 +1 就太完美了，说不出来的漂亮代码。太佩服了。我还在思考怎么在一行里面写 ```if```

完整代码:[https://github.com/blackyau/homework/blob/master/TypeLog.java](https://github.com/blackyau/homework/blob/master/TypeLog.java)

## 大衍数列

蓝桥杯 2014 Java C 4

中国古代文献中，曾记载过“大衍数列”, 主要用于解释中国传统文化中的太极衍生原理。

它的前几项是：0、2、4、8、12、18、24、32、40、50 ...

其规律是：对偶数项，是序号平方再除2，奇数项，是序号平方减1再除2。

以下的代码打印出了大衍数列的前 100 项。

```java
for(int i=1; i<100; i++)
{
	if(________________)  //填空
		System.out.println(i*i/2);
	else
		System.out.println((i*i-1)/2);
}
```

> 没啥可说的

完整代码:[https://github.com/blackyau/homework/blob/master/TaichiSequence.java](https://github.com/blackyau/homework/blob/master/TaichiSequence.java)

## 猜字母

蓝桥杯 2014 Java C 3

把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。

接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。

得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。

答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容。

> 一开始用 Str 想每次都取出两边的的内容然后再拼接，因为 for 循环处理第一个字母遇到了问题。就搜了搜网上的，发现了使用 ```StringBuffer``` 的 ```deleteCharAt(i)``` 太微妙了。因为每次 ```deleteCharAt``` 整个字符串都在整体左移，所以虽然 ```for循环``` 都是 ```i++``` 实际上他是每隔一位删掉一个字母。所以也完美的贴合的这个题目的要求，同时因为 ```length```都在实时变化，也不用害怕下标越界。
 
完整代码:[https://github.com/blackyau/homework/blob/master/GuessLetters.java](https://github.com/blackyau/homework/blob/master/GuessLetters.java)

## 等额本金

蓝桥杯 2014 Java C 2

小明从银行贷款3万元。约定分24个月，以等额本金方式还款。

这种还款方式就是把贷款额度等分到24个月。每个月除了要还固定的本金外，还要还贷款余额在一个月中产生的利息。

假设月利率是：```0.005```，即：千分之五。那么，

第一个月，小明要还本金 ```1250```, 还要还利息：```30000 * 0.005```，总计 ```1400```

第二个月，本金仍然要还 ```1250```, 但利息为：```(30000-1250) * 0.005``` 总计 ```1393.75```

请问：小明在第15个月，应该还款多少（本金和利息的总和）？

请把答案金额四舍五入后，保留两位小数。注意：```32.5```，一定要写为：```32.50```

> 因为使用 ```Double``` 遇到了精度问题，然后就学习了一下如何使用 ```BigDecimal``` 说实话。如果真的遇到了这种题，我直接用系统的计算器应该方便多了。

完整代码:[https://github.com/blackyau/homework/blob/master/EqualPrincipal.java](https://github.com/blackyau/homework/blob/master/EqualPrincipal.java)

## 核桃的数量

蓝桥杯 2013 Java C 7

小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：

1. 各组的核桃数量必须相同
2. 各组内必须能平分核桃（当然是不能打碎的）
3. 尽量提供满足1,2条件的最小数量（节约闹革命嘛）

程序从标准输入读入：

```a b c```

a,b,c都是正整数，表示每个组正在加班的人数，用空格分开（a,b,c<30）

程序输出：
一个正整数，表示每袋核桃的数量。

例如：

用户输入：

```
2 4 5
```

程序输出：

```
20
```

再例如：

用户输入：

```
3 1 1
```

程序输出：

```
3
```

> 一开始把 for 循环的范围定的太少了，过度解读的题目的 ```尽量提供满足1,2条件的最小数量``` 。搞了半天就是个粗暴的求最小公因数，暴力就行了！

> http://lx.lanqiao.cn Accepted  RunTime:234ms Submission Date:2019-03-12 00:15 Score:100

完整代码:[https://github.com/blackyau/homework/blob/master/WalnutsNumber.java](https://github.com/blackyau/homework/blob/master/WalnutsNumber.java)

## 逆波兰表达式

蓝桥杯 2013 Java C 6

正常的表达式称为中缀表达式，运算符在中间，主要是给人阅读的，机器求解并不方便。

例如：```3 + 5 * (2 + 6) - 1```

而且，常常需要用括号来改变运算次序。

相反，如果使用逆波兰表达式（前缀表达式）表示，上面的算式则表示为：

```- + 3 * 5 + 2 6 1```

不再需要括号，机器可以用递归的方法很方便地求解。

为了简便，我们假设：

1. 只有 + - * 三种运算符
2. 每个运算数都是一个小于10的非负整数
    
下面的程序对一个逆波兰表示串进行求值。

其返回值为一个数组：其中第一元素表示求值结果，第二个元素表示它已解析的字符数。

> 递归毁天灭地，通过下面的一堆 if 和 v1 与 v2 的相加相减判断出他们必定是相似属性的一组数据。又因为使用了 substring 截取一段字符串，得知 v2 肯定是用来处理 v1 处理不完的数据。那么就是 ```x.substring(1+v1[1])``` ，前面已解析的数据 +1 。

完整代码:[https://github.com/blackyau/homework/blob/master/Evaluate.java](https://github.com/blackyau/homework/blob/master/Evaluate.java)

## 有理数类

蓝桥杯 2013 Java C 5

有理数就是可以表示为两个整数的比值的数字。一般情况下，我们用近似的小数表示。但有些时候，不允许出现误差，必须用两个整数来表示一个有理数。

这时，我们可以建立一个“有理数类”，下面的代码初步实现了这个目标。为了简明，它只提供了加法和乘法运算。

> 自己做的第一个填空题，对这个实现的方法没有认真的研究。毫无头绪，看了看答案大概感受了一下。打马虎眼的就过去了吧，这种题依赖 Debug 连蒙带猜的应该都能做出来。

完整代码:[https://github.com/blackyau/homework/blob/master/GuessAge.java](https://github.com/blackyau/homework/blob/master/GuessAge.java)

## 马虎的算式

蓝桥杯 2013 Java C 3

小明是个急性子，上小学的时候经常把老师写在黑板上的题目抄错了。

有一次，老师出的题目是：```36 x 495 = ?```

他却给抄成了：```396 x 45 = ?```

但结果却很戏剧性，他的答案竟然是对的！！

因为 ```36 * 495 = 396 * 45 = 17820```

类似这样的巧合情况可能还有很多，比如：```27 * 594 = 297 * 54```

假设 ```a b c d e``` 代表1~9不同的5个数字（注意是各不相同的数字，且不含0）

能满足形如： ```ab * cde = adb * ce``` 这样的算式一共有多少种呢？

请你利用计算机的优势寻找所有的可能，并回答不同算式的种类数。

> 暴力穷举所有数，直接 if 看看对不对就行了。判断每一位数是否重复的时候出了点错，没有考虑周全。应该先用 a 匹配其他数字，再用 b 匹配其他数，以此类推不能落下任何一位。

完整代码:[https://github.com/blackyau/homework/blob/master/CarelessEquation.java](https://github.com/blackyau/homework/blob/master/CarelessEquation.java)

## 组素数

蓝桥杯 2013 Java C 2

素数就是不能再进行等分的数。比如：```2 3 5 7 11``` 等。

```9 = 3 * 3``` 说明它可以3等分，因而不是素数。

我们国家在1949年建国。如果只给你 ```1 9 4 9``` 这4个数字卡片，可以随意摆放它们的先后顺序（但卡片不能倒着摆放啊，我们不是在脑筋急转弯！），那么，你能组成多少个4位的素数呢？

比如：```1949```，```4919``` 都符合要求。

请你提交：能组成的4位素数的个数，不要罗列这些素数!!

> 一开始没有理解到素数的概念，计算出来的数字总是要大些。最后发现必须要一直循环到数字的前一个结束才行。

完整代码:[https://github.com/blackyau/homework/blob/master/PrimeNumber.java](https://github.com/blackyau/homework/blob/master/PrimeNumber.java)

## 猜年龄

蓝桥杯 2013 Java C 1

美国数学家维纳(N.Wiener)智力早熟，11岁就上了大学。他曾在1935~1936年应邀来中国清华大学讲学。一次，他参加某个重要会议，年轻的脸孔引人注目。于是有人询问他的年龄，他回答说：

“我年龄的立方是个4位数。我年龄的4次方是个6位数。这10个数字正好包含了从0到9这10个数字，每个都恰好出现1次。”

请你推算一下，他当时到底有多年轻。

> 使用 HashSet 实现了检测每一位是否重复，暴力枚举每一位数。

完整代码:[https://github.com/blackyau/homework/blob/master/GuessAge.java](https://github.com/blackyau/homework/blob/master/GuessAge.java)

## 第39级台阶

蓝桥杯 2013 Java C 4

小明刚刚看完电影《第39级台阶》，离开电影院的时候，他数了数礼堂前的台阶数，恰好是39级!

站在台阶前，他突然又想着一个问题：

如果我每一步只能迈上1个或2个台阶。先迈左脚，然后左右交替，最后一步是迈右脚，也就是说一共要走偶数步。那么，上完39级台阶，有多少种不同的上法呢？

请你利用计算机的优势，帮助小明寻找答案。

> 递归的使用

完整代码:[https://github.com/blackyau/homework/blob/master/Step.java](https://github.com/blackyau/homework/blob/master/Step.java)

## 三点顺序

现在给你不共线的三个点A,B,C的坐标，它们一定能组成一个三角形，现在让你判断A，B，C是顺时针给出的还是逆时针给出的？

图1：顺时针给出

图2：逆时针给出

![图1 顺时针](https://i.loli.net/2019/03/11/5c862455da288.jpg)

![图2 逆时针](https://i.loli.net/2019/03/11/5c862458e31c8.jpg)

输出描述：

每行是一组测试数据，有6个整数x1,y1,x2,y2,x3,y3分别表示A,B,C三个点的横纵坐标。（坐标值都在0到10000之间)

输入```0 0 0 0 0 0```表示输入结束

测试数据不超过10000组

如果这三个点是顺时针给出的，请输出1，逆时针给出则输出0

样例输入

```
0 0 1 1 1 3
0 1 1 0 0 0
0 0 0 0 0 0
```

样例输出

```
0
1
```

> 矢量叉积，核心代码就一个公式。

完整代码:[https://github.com/blackyau/homework/blob/master/Triangle.java](https://github.com/blackyau/homework/blob/master/Triangle.java)

## UVa 514 铁轨

[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=455](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=455)

[https://vjudge.net/problem/UVA-514](https://vjudge.net/problem/UVA-514)

某城市有一个火车站，铁轨铺设如图6-1所示。有n节车厢从A方向驶入车站，按进站顺序编号为1～n。你的任务是判断是否能让它们按照某种特定的顺序进入B方向的铁轨并驶出车站。例如，出栈顺序（54123）是不可能的，但（54321）是可能的。

![铁轨图片](https://i.loli.net/2019/02/28/5c77daf13e3be.jpg)

为了重组车厢，你可以借助中转站C。这是一个可以停放任意多节车厢的车站，但由于末端封顶，驶入C的车厢必须按照相反的顺序驶出C.对于每个车厢，一旦从A移入C，就不能再回到A了；一旦从C移入B，就不能回到C了。换句话说，在任意时刻，只有两种选择:A→C和C→B。

> 使用了 Java 的 Stack 类，只有一个栈。

> UVaOJ Accepted  RunTime:1.070 Submission Date:2019-02-28 12:52:00

完整代码:[https://github.com/blackyau/homework/blob/master/Rails.java](https://github.com/blackyau/homework/blob/master/Rails.java)

## UVa 1585 Score 得分

[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=4460](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=4460)

[https://vjudge.net/problem/UVA-1585](https://vjudge.net/problem/UVA-1585)

给出一个由 O 和 X 组成的串（长度为1~80），统计得分。每个 O 的得分为目前连续出现的 O 的个数，X 的得分为 0 。例如，OOXXOXXOOO 的得分为 1+2+0+0+1+0+0+1+2+3。

> 一开始把题想复杂了还准备用递归做，结果突然想到用个 flag 标记当前到底是第一次出现就行了。如果匹配到 X 的话就把 flag 清空。

> UVaOJ Accepted  RunTime:0.060 Submission Date:2019-02-27 14:34:49

完整代码:[https://github.com/blackyau/homework/blob/master/Score.java](https://github.com/blackyau/homework/blob/master/Score.java)

## UVa 489 Hangman Judge 刽子手游戏

[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=430](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=430)

[https://vjudge.net/problem/UVA-489](https://vjudge.net/problem/UVA-489)

刽子手游戏其实是一款猜单词游戏。游戏规则是这样的：计算机想一个单词让你猜，你每次可以猜一个字母。如果单词里有那个字母，所有该字母会显示出来；如果没有那个字母，则计算机会在一幅“刽子手”画上填一笔。这幅画一共需要7笔就能完成，因此你最多只能错6次。注意，猜一个已经猜过的字母也算错。

在本地中，你的任务是编写一个“裁判”程序，输入单词和玩家的猜测，判断玩家赢了（You win.）、输了（You lose.）还是放弃了（You chickened out.）。每组数据包含3行，第1行是游戏编号（-1为输入结束标记），第2行是计算机想的单词，第3行是玩家的猜测。后两位保证只含小写字母。

> 对这个题了解得不够深刻，基本上都是照搬了刘汝佳的代码。应该多做做这类题，而且这是第一次使用 Java 的函数有了点面向对象的感觉。

> UVaOJ Accepted  RunTime:1.360 Submission Date:2019-02-08 15:20:15

完整代码:[https://github.com/blackyau/homework/blob/master/HangmanJudge.java](https://github.com/blackyau/homework/blob/master/HangmanJudge.java)

## 运动员分组

有N个人参加100米短跑比赛。跑道为8条。程序的任务是按照尽量使每组的人数相差最少的原则分组。

例如：

N=8时，分成1组即可。

N=9时，分成2组：一组5人，一组4人。

N=25时，分4组：7、6、6、6。

请编程计算分组数字。要求从键盘输入一个正整数（1~100之间，不必考虑输入错误的情况），表示参赛的人数。程序输出每个组的人数。从大到小顺序输出，每个数字一行。

比如，用户输入：

```
25
```

程序输出：

```
7
6
6
6
```

> 先将总人数除以8，得到分组数，再将总人数除8取余，如果大于0，分组数就要再加1。然后用总人数除以分组数得到每组的平均数，再将总人数除以分组数取余，再将余数分到每个组。

完整代码:[https://github.com/blackyau/homework/blob/master/Grouping.java](https://github.com/blackyau/homework/blob/master/Grouping.java)

## UVa 1149 Bin Packing 装箱

[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=246&page=show_problem&problem=3590](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=246&page=show_problem&problem=3590)

[https://vjudge.net/problem/UVA-1149](https://vjudge.net/problem/UVA-1149)

给定 N（n ≤ 10^5）个物品的重量 L，背包的容量M，同时要求每个背包最多装两个物品。求至少要多少个背包才能装下所有的物品。

> 从数组的两边往中间一直尝试就行了，就是最后的输出换行有问题。因为程序本身结束的时候就会输出一个换行，我在程序中写的是每次都换行两次。所以会导致输出格式有问题。

> UVaOJ Accepted  RunTime:0.540 Submission Date:2019-02-07 12:49:40

完整代码:[https://github.com/blackyau/homework/blob/master/BinPacking.java](https://github.com/blackyau/homework/blob/master/BinPacking.java)

## 李白打酒

话说大诗人李白，一生好饮。幸好他从不开车。

一天，他提着酒壶，从家里出来，酒壶中有酒2斗。他边走边唱：

无事街上走，提壶去打酒。

逢店加一倍，遇花喝一斗。

这一路上，他一共遇到店5次，遇到花10次，已知最后一次遇到的是花，他正好把酒喝光了。

请你计算李白遇到店和花的次序，可以把遇店记为a，遇花记为b。则：babaabbabbabbbb 就是合理的次序。像这样的答案一共有多少呢？

这应该是我在这次算法学习中遇到的第一个递归题，根据题意写了三个if，分别是可能会遇到的三种情况。

- 当还有店的时候，就把店-1同时把酒*2吧结果传给下一个。
- 当还有花的时候，就把花-1同时把酒-1吧结果传给下一个。
- 当遇到一种结局的时候，没有店了同时花只有最后一个酒也剩最后一个。就把计数器+1，同时结束这层递归。

多层递归会导致人的思维有点乱，需要足够的时间去理解才能够搞懂这个递归。感觉挺有意思的。

完整代码:[https://github.com/blackyau/homework/blob/master/LiBaiDrink.java](https://github.com/blackyau/homework/blob/master/LiBaiDrink.java)

## nyoj 46 最少乘法次数

[http://nyoj.top/problem/46](http://nyoj.top/problem/46)

给你一个非零整数，让你求这个数的n次方，每次相乘的结果可以在后面使用，求至少需要多少次乘。如2^4：2*2=2^2（第一次乘），2^2*2^2=24（第二次乘），所以最少共2次；

第一行m表示有m(1<=m<=100)组测试数据;

每一组测试数据有一整数n（0<n<=10000);

输出每组测试数据所需次数s;

样例输入:

```
3
2
3
4
```

样例输出:
```
1
2
2
```

> 将数都分为两份，如果为奇数则分一个1和另外一个偶数。如果为偶数就直接分二。

> nyoj Accepted  RunTime:194ms Submission Date:2019-01-02 15:10:52

完整代码:[https://github.com/blackyau/homework/blob/master/MinProductFreque.java](https://github.com/blackyau/homework/blob/master/MinProductFreque.java)

## 特殊回文数

123321是一个非常特殊的数，它从左边读和从右边读是一样的。输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。

输入格式:

输入一行，包含一个正整数n。

输出格式:

按从小到大的顺序输出满足条件的整数，每个整数占一行。

数据规模和约定:

1<=n<=54

样例输入

```
52
```

样例输出

```
899998
989989
998899
```

> 使用for循环枚举所有5位数和6位数的数字，使用除余将每一位都分出来。直接进行比对即可

> http://lx.lanqiao.cn Accepted  RunTime:375ms Submission Date:2019-01-02 16:31 Score:100

完整代码:[https://github.com/blackyau/homework/blob/master/SpecialPalindromicNumber.java](https://github.com/blackyau/homework/blob/master/SpecialPalindromicNumber.java)

## UVa 11292 Dragon of Loowater 勇者斗恶龙

[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2267](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2267)

[https://vjudge.net/problem/UVA-11292](https://vjudge.net/problem/UVA-11292)

有n个头的恶龙，你雇佣一些骑士把所有的头砍掉，一共有m个骑士可以雇佣， 一个能力为x的骑士只能砍下恶龙一个直径不超过x的头，而且要支付x个金币。 

问：如何雇佣骑士才能砍掉所有恶龙的头，而且要使付出的金币最少。

注意：一个骑士只能砍掉一个头，而且只能被雇用一次！

输入包含多组数据。每组数据的第一行为正整数n和m（1≤n,m≤20 000）；以下n行每行为一个整数，即恶龙每个头的直径；以下m行每行为一个整数，即每个骑士的能力。输入结束标志为n=m=0。

对于每组数据，输出最少花费。如果无解，输出“Loowater isdoomed!”

> 将骑士的能力和龙的头都写入数组，将数组使用Arrays.sort()排序后。一个一个的比对大小，当骑士的能力可以砍下头的话就将金额加上。如果能力不足以砍下，那就遍历下一个骑士。当遍历的骑士到了最后一个，那说明这个龙没法没解决掉，就输出指定结果同时break;

> 最后通过一个flag判断是否输出消耗的金钱数，同时要及时的sc.close();因为这个东西Wrong answer了好多次。

> UVaOJ Accepted  RunTime:0.380 Submission Date:2018-12-31 10:59:27

完整代码:[https://github.com/blackyau/homework/blob/master/DragonofLoowater.java](https://github.com/blackyau/homework/blob/master/DragonofLoowater.java)

## UVa 10591 Happy Number 快乐数

[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1532](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1532)

[https://vjudge.net/problem/UVA-10591](https://vjudge.net/problem/UVA-10591)

这道题定义了一种快乐数，就是说对于某一个正整数，如果对其各个位上的数字分别平方，然后再加起来得到一个新的数字，再进行同样的操作，如果最终结果变成了1，则说明是快乐数，如果一直循环但不是1的话，就不是快乐数，那么现在任意给我们一个正整数，让我们判断这个数是不是快乐数

> 在给定的进位制下，该数字所有数字（英语：digits）的平方和，得到的新数再次求所有数字的平方和，如此重复进行，最终结果必为1。
不是快乐数的数称为不快乐数（英语：unhappy number），所有不快乐数的数字平方和计算，最后都会进入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中，但开始循环的第一个不一定是4。

> 所有的不快乐数都会进入这个循环，至于为什么会导致这样的结果没有找到原因。数学的巧合。
程序通过写了一个方法，将每一个数的每一位都分开进行计算。计算后的结果都存入HashSet()定义的数组，因为该数组不支持重复。所以当有数字开始重复的时候，就意味着这是一个不快乐数。如果求出的数字为1那么它就是快乐数。

> UVaOJ Accepted  RunTime:0.150 Submission Date:2018-12-30 09:05:48

完整代码:[https://github.com/blackyau/homework/blob/master/HappyNumber.java](https://github.com/blackyau/homework/blob/master/HappyNumber.java)

## UVa 1586 Molar mass 分子量

[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=449&page=show_problem&problem=4461](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=449&page=show_problem&problem=4461)

[https://vjudge.net/problem/UVA-1586](https://vjudge.net/problem/UVA-1586)

给出一种物质的分子式（不带括号），求分子量。本题中的分子式只包含4钟原子，分别为C,H,O,N,原子量分别为12.01,1.008,16.00,14.01（单位：g/mol）。例如C6H5OH的分子量为94.108g/mol(后面的数字最多两位数)

还需学习:

- switch的使用方法
- Java自定义函数

笔记:

- Character.isLetter 判断是否为字母
- Character.isDefined 判断是否为数字
- 将每一个字母和数字都装进数组，以字母为主用来定位数字数组中相对应的数字的位置
- 为了两位数的情况同时还要判断下一位是否为数字
- 数字数组默认将每一位都填充1，没有数字的字母都是乘1\
- 单引号表示char,双引号表示字符串
- char转int直接吧char-'0',因为char的ASCII码都是递增的，'0'的ASCII码为48而'2'就是50.他们之间的ASCII码相减正好可以满足需求
- OJ输入要用String st = sc.next();
- 调用之前一定要先sc.nextLine();一下
- 两个浮点数进行计算，不要去声明一个变量最好直接变量与数字直接计算否则会损失精度

> vjudge Accepted RunTime:60ms Submitted:2018-12-22 00:09:11 [https://vjudge.net/solution/17524872](https://vjudge.net/solution/17524872)

完整代码:[https://github.com/blackyau/homework/blob/master/MolarMass.java](https://github.com/blackyau/homework/blob/master/MolarMass.java)

## SnackMath 蛇形填数

在 n * n 方阵里填入 1,2,~,n*n 要求填成蛇形。例如 n=4 时方阵为：

10 | 11 | 12 | 1
-- | -- | -- | --
9  | 16 | 13 | 2
8 | 15 | 14 | 3
7 | 6 | 5 | 4

上面的方阵中，多余的空格只是为了便于观察规律，不必严格输出。n<=8

- 通过输入的数字大小，来限定x轴或y轴数据的大小
- 注意二维数组的原点和x轴y轴的走向
- while使用短路&&符
- 最后打印的时候，输出是从左向右.同时要用println()换行

完整代码:[https://github.com/blackyau/homework/blob/master/SnackMath.java](https://github.com/blackyau/homework/blob/master/SnackMath.java)