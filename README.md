# 算法作业

自己方便查阅同时熟悉Git的操作

UVaOJ blackyau [https://uhunt.onlinejudge.org/id/1015260](https://uhunt.onlinejudge.org/id/1015260)

Virtual Judge [https://vjudge.net/status#un=BlackYau](https://vjudge.net/status#un=BlackYau)

## 备忘录

- 最长公共子序列
- 八皇后问题

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

> 暴力就完事儿了，就是代码运行时间要2分钟。写这个代码也是遇到了蛮多问题，本来想尽可能的减少计算规模。其实花了更多不必要的时间。

完整代码:[https://github.com/blackyau/homework/blob/master/BuildingBlocks.java](https://github.com/blackyau/homework/blob/master/BuildingBlocks.java)

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