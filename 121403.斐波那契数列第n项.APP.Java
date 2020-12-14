package demo;

import java.util.Scanner;

public class Test {

	/**
	 * 嘤嘤嘤
	 * 
	 * @param n
	 * @return
	 */
	public static int getSum(int n) {
		if (n == 1 || n == 2) {// 如果n为1 返回1
			return 1;
		} else {// 否则返回n-1与n-2的数值的相加
			return getSum(n - 1) + getSum(n - 2);
		}
	}

	public static void main(String[] args) {
		int sum = 0;// 定义求和 并初始化
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要求的项数N：");
		int q = sc.nextInt();
		if (q <= 40) {
			for (int i = 1; i <= q; i++) {// 循环
				//System.out.println(getSum(q));// 打印每个值
				sum += getSum(i);// 求和
				
			}
			//System.out.println(getSum(q));
		}
		//System.out.println(sum);//打印结果
		System.out.println("您求的第"+q+"项的值为："+getSum(q));
		System.out.println("求和得："+sum);//打印结果
	}
	 
}
