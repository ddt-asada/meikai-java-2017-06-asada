/*演習5-5
 * 三つの整数値を読み込んで、その合計と平均を表示するプログラム。
 * 作成日：2017年6月20日
 * 作成者：浅田　知嗣
 */
package e_05_05;

import java.util.Scanner;

public class e_05_05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x = 0;		//合計と平均を求めるのに使う整数。
		int y = 0;		//合計と平均を求めるのに使う整数。
		int z = 0;		//合計と平均を求めるのに使う整数。
		double sum = 0;	//求めた合計を格納するための整数。
		double avg = 0;	//求めた平均を格納するための整数。

		//合計と平均を求めるのに使う変数の入力を促す。
		System.out.print("計算値を入力してください。");
		x = stdIn.nextInt();

		//合計と平均を求めるのに使う変数の入力を促す。
		System.out.print("計算値を入力してください。");
		y = stdIn.nextInt();

		//合計と平均を求めるのに使う変数の入力を促す。
		System.out.print("計算値を入力してください。");
		z = stdIn.nextInt();

		//合計を求めて代入。
		sum = (double)x + y + z;

		//平均を求めて代入。
		avg = (double)sum / 3;

		//求めた合計と平均を表示する。
		System.out.println("合計は" + sum + "です。" );
		System.out.println("平均は" + avg + "です。" );

		stdIn.close();
	}

}
