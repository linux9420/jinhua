package demo;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 闰年就是可以被4整除不能被100整除，或者可以被400整除
		//Scanner sc = new Scanner(System.in);
		//System.out.println("请输入年份：");
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("请输入年份：");
				int year = sc.nextInt();

				if (year < 0) {
					// Math.abs();//绝对值
					if (Math.abs(year) % 4 == 1 || Math.abs(year) % 400 == 1) {
						System.out.println(year + "是闰年!");
					} else {
						System.out.println(year + "是平年!");
					}

				}
				if (year > 0) {
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						System.out.println(year + "是闰年!");
					} else {
						System.out.println(year + "是平年!");
					}
					
				}
				if (year == 0) {
					System.out.println("我猜你一定输入了0!我这里可没有0年这个说法哟，请重新输入呀！");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("我猜你一定输入了乱七八糟的东西，请重新输入呀！");
			}

		}

	}

}
