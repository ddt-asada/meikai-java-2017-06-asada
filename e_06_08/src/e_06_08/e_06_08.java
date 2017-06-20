/*演習6-8
 * double型の配列の合計値と平均値を求めるプログラム。
 */
package e_06_08;

import java.util.Scanner;

public class e_06_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;				//配列の要素数。
		double sum = 0;		//求めた合計を代入する整数。

		//配列の要素数の入力を促す。
		System.out.print("要素数は：");
		n = stdIn.nextInt();

		//配列を生成する。
		double[] a = new double[n];

		//配列の各要素に値を入れていく。
		for(int i = 0; i < a.length; i++) {
			//値の入力を促す。
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextDouble();
		}

		//合計を求める。
		for(int i = 0; i < a.length; i++) {
			//合計を求める。
			sum += a[i];
		}

		//求めたものを表示する。
		System.out.println("合計値は" + sum + "です。");
		System.out.println("平均値は" + (sum / n) + "です。");

		stdIn.close();
	}

}
