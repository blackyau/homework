# 算法作业

自己方便查阅同时熟悉Git的操作

UVaOJ blackyau [https://uhunt.onlinejudge.org/id/1015260](https://uhunt.onlinejudge.org/id/1015260)

Virtual Judge [https://vjudge.net/status#un=BlackYau](https://vjudge.net/status#un=BlackYau)

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

完整代码:[https://github.com/blackyau/homework/blob/master/SpecialPalindromicNumber.java](https://github.com/blackyau/homework/blob/master/SpecialPalindromicNumber.java)

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

## UVa 1149 Bin Packing 装箱

[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=246&page=show_problem&problem=3590](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=246&page=show_problem&problem=3590)

[https://vjudge.net/problem/UVA-1149](https://vjudge.net/problem/UVA-1149)

给定 N（n ≤ 10^5）个物品的重量 L，背包的容量M，同时要求每个背包最多装两个物品。求至少要多少个背包才能装下所有的物品。

> 从数组的两边往中间一直尝试就行了，就是最后的输出换行有问题。因为程序本身结束的时候就会输出一个换行，我在程序中写的是每次都换行两次。所以会导致输出格式有问题。

> UVaOJ Accepted  RunTime:0.540 Submission Date:2019-02-07 12:49:40

完整代码:[https://github.com/blackyau/homework/blob/master/BinPacking.java](https://github.com/blackyau/homework/blob/master/BinPacking.java)

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